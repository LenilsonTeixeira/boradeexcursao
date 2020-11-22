package br.com.boradeexcursao.controller

import br.com.boradeexcursao.api.UploadAgencyLogoApi
import br.com.boradeexcursao.api.response.UploadedAgencyLogoResponse
import br.com.boradeexcursao.controller.translate.UploadedAgencyLogoDomainToUploadedAgencyLogoResponseTranslator
import br.com.boradeexcursao.domain.UploadAgencyLogoDomain
import br.com.boradeexcursao.usecase.UploadAgencyLogoUseCase
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
class UploadAgencyLogoController(private val uploadAgencyLogoUseCase: UploadAgencyLogoUseCase) : UploadAgencyLogoApi {
    override fun upload(@PathVariable("id") id: String, logo: MultipartFile): UploadedAgencyLogoResponse {

        val uploadedAgencyDomain = uploadAgencyLogoUseCase.execute(UploadAgencyLogoDomain(id, logo))

        return UploadedAgencyLogoDomainToUploadedAgencyLogoResponseTranslator.translate(uploadedAgencyDomain)

    }
}