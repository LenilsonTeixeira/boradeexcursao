package br.com.boradeexcursao.usecase

import br.com.boradeexcursao.domain.SaveAgencyLogoDomain
import br.com.boradeexcursao.exception.SaveAgencyLogoException
import br.com.boradeexcursao.gateway.SaveAgencyLogoGateway
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class SaveAgencyLogoUseCase(private val saveAgencyLogoGateway: SaveAgencyLogoGateway) {

    fun execute(saveAgencyLogoDomain: SaveAgencyLogoDomain) {

        val logger = LoggerFactory.getLogger(SaveAgencyLogoUseCase::class.java)

        try {

            saveAgencyLogoGateway.save(saveAgencyLogoDomain)

            logger.info("Agency logo saved successfully")

        } catch (e: Exception) {

            logger.error("Occurring error while saving agency logo: $saveAgencyLogoDomain. $e")

            throw SaveAgencyLogoException("Occurring error while saving agency logo: $saveAgencyLogoDomain.")
        }

    }
}