package br.com.boradeexcursao.usecase

import br.com.boradeexcursao.domain.RetrievedAgencyLogoDomain
import br.com.boradeexcursao.gateway.GetAgencyLogoGateway
import java.util.*
import org.springframework.stereotype.Component

@Component
class GetAgencyLogoUseCase(private val getAgencyLogoGateway: GetAgencyLogoGateway) {

    fun execute(agencyId: String) : Optional<RetrievedAgencyLogoDomain> {

        return Optional.ofNullable(getAgencyLogoGateway.findByAgencyId(agencyId))

    }
}