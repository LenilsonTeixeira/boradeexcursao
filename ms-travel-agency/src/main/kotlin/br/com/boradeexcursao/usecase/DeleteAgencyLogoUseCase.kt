package br.com.boradeexcursao.usecase

import br.com.boradeexcursao.domain.RetrievedAgencyLogoDomain
import br.com.boradeexcursao.gateway.DeleteAgencyLogoGateway
import java.io.File
import org.springframework.stereotype.Component

@Component
class DeleteAgencyLogoUseCase(private val getAgencyLogoUseCase: GetAgencyLogoUseCase, private val deleteAgencyLogoGateway: DeleteAgencyLogoGateway) {

    fun execute(agencyId: String) {

        val logo = getAgencyLogoUseCase.execute(agencyId)

        if(logo.isPresent) {

            fromLocalStorage(logo.get())

            fromDatabase(agencyId)

        }

    }

    private fun fromDatabase(agencyId: String) {
        deleteAgencyLogoGateway.deleteByAgencyId(agencyId)
    }

    private fun fromLocalStorage(logo: RetrievedAgencyLogoDomain) {

        File(logo.url).delete()

    }
}