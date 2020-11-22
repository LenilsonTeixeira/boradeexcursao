package br.com.boradeexcursao.usecase

import br.com.boradeexcursao.domain.UpdateAgencyDomain
import br.com.boradeexcursao.domain.UpdatedAgencyDomain
import br.com.boradeexcursao.exception.AddAgencyException
import br.com.boradeexcursao.gateway.UpdateAgencyGateway
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class UpdateAgencyUseCase(private val getOneAgencyUseCase: GetOneAgencyUseCase, private val updateAgencyGateway: UpdateAgencyGateway) {

    fun execute(updateAgencyDomain: UpdateAgencyDomain) : UpdatedAgencyDomain {

        val logger = LoggerFactory.getLogger(UpdateAgencyUseCase::class.java)

        try {

            logger.info("Searching agency by uuid: ${updateAgencyDomain.uuid}")

            val obtainedAgency = getOneAgencyUseCase.execute(updateAgencyDomain.uuid)

            updateAgencyDomain.id = obtainedAgency.id

            logger.info("Updating travel agency: ${updateAgencyDomain.name}.")

            return updateAgencyGateway.update(updateAgencyDomain)

        } catch (e: Exception) {

            logger.error("An error occurred while updating the agency: $updateAgencyDomain. $e")

            throw AddAgencyException("An error occurred while updating the agency: ${updateAgencyDomain.name}.")
        }
    }

}