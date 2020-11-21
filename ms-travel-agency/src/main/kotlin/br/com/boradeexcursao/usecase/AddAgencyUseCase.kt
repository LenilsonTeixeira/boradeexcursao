package br.com.boradeexcursao.usecase

import br.com.boradeexcursao.domain.AddAgencyDomain
import br.com.boradeexcursao.domain.AddedAgencyDomain
import br.com.boradeexcursao.exception.AddAgencyException
import br.com.boradeexcursao.gateway.AddAgencyGateway
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class AddAgencyUseCase(val addAgencyGateway: AddAgencyGateway) {

    fun execute(addAgencyDomain: AddAgencyDomain): AddedAgencyDomain {

        val logger = LoggerFactory.getLogger(AddAgencyUseCase::class.java)

        try {
            logger.info("Saving travel agency: ${addAgencyDomain.name}.")

            return addAgencyGateway.add(addAgencyDomain)

        } catch (e: Exception) {

            logger.error("An error occurred while saving the agency: $addAgencyDomain. $e")

            throw AddAgencyException("An error occurred while saving the agency: ${addAgencyDomain.name}.")
        }

    }
}