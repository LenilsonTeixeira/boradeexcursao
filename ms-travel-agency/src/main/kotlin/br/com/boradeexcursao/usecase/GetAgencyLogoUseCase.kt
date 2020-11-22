package br.com.boradeexcursao.usecase

import br.com.boradeexcursao.domain.RetrievedAgencyLogoDomain
import br.com.boradeexcursao.gateway.GetAgencyLogoGateway
import org.springframework.stereotype.Component

@Component
class GetAgencyLogoUseCase(private val getAgencyLogoGateway: GetAgencyLogoGateway) {

    fun execute(agencyId: String) : List<RetrievedAgencyLogoDomain> {

        return getAgencyLogoGateway.findAllByAgencyId(agencyId)

    }
}