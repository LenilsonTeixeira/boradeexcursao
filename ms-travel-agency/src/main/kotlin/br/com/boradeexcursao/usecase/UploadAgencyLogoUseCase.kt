package br.com.boradeexcursao.usecase

import br.com.boradeexcursao.domain.SaveAgencyLogoDomain
import br.com.boradeexcursao.domain.UploadAgencyLogoDomain
import br.com.boradeexcursao.domain.UploadedAgencyLogoDomain
import br.com.boradeexcursao.exception.UploadAgencyLogoException
import java.nio.file.FileSystems.getDefault
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.util.StringUtils
import org.springframework.web.multipart.MultipartFile

@Component
class UploadAgencyLogoUseCase(private val saveAgencyLogoUseCase: SaveAgencyLogoUseCase, private val deleteAgencyLogoUseCase: DeleteAgencyLogoUseCase) {

    @Value("\${storage.agency.logo.path}")
    private val UPLOAD_DIR = "."

    fun execute(uploadAgencyLogoDomain: UploadAgencyLogoDomain) : UploadedAgencyLogoDomain {

        val logger = LoggerFactory.getLogger(UploadAgencyLogoUseCase::class.java)

        val fileName = normalizeFilePath(uploadAgencyLogoDomain.logo)

        val path: Path = Paths.get(UPLOAD_DIR + getDefault().separator + fileName)

        try {

            deleteAgencyLogoUseCase.execute(uploadAgencyLogoDomain.agencyId)

            Files.copy(uploadAgencyLogoDomain.logo.inputStream, path, StandardCopyOption.REPLACE_EXISTING)

            saveAgencyLogoUseCase.execute(SaveAgencyLogoDomain(uploadAgencyLogoDomain.agencyId, path.toString()))

            logger.info("Agency logo uploaded successfully.")

        } catch (e: Exception) {

            logger.error("Occurring error while uploading agency logo: ${uploadAgencyLogoDomain}. $e")

            throw UploadAgencyLogoException("Occurring error while uploading agency logo: ${uploadAgencyLogoDomain}.")

        }

        return UploadedAgencyLogoDomain(uploadAgencyLogoDomain.agencyId, path.toString())

    }

    private fun normalizeFilePath(file: MultipartFile) : String {
        return StringUtils.cleanPath(file.getOriginalFilename()!!)
    }


}