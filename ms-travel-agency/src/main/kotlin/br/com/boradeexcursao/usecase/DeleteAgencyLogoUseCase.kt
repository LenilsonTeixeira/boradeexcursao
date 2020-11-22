package br.com.boradeexcursao.usecase

import br.com.boradeexcursao.domain.RetrievedAgencyLogoDomain
import br.com.boradeexcursao.gateway.DeleteAgencyLogoGateway
import java.io.File
import org.springframework.stereotype.Component

@Component
class DeleteAgencyLogoUseCase(private val getAgencyLogoUseCase: GetAgencyLogoUseCase, private val deleteAgencyLogoGateway: DeleteAgencyLogoGateway) {

    fun execute(agencyId: String) {

        val logos = getAgencyLogoUseCase.execute(agencyId)

        if(logos.isNotEmpty()) {

            fromLocalStorage(logos)

            fromDatabase(agencyId)

        }

    }

    private fun fromDatabase(agencyId: String) {
        deleteAgencyLogoGateway.deleteByAgencyId(agencyId)
    }

    private fun fromLocalStorage(logos: List<RetrievedAgencyLogoDomain>) {

        logos.forEach { File(it.url).delete() }

    }
}