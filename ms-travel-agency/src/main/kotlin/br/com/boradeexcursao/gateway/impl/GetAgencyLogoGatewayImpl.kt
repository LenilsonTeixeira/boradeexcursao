package br.com.boradeexcursao.gateway.impl

import br.com.boradeexcursao.domain.RetrievedAgencyLogoDomain
import br.com.boradeexcursao.gateway.GetAgencyLogoGateway
import br.com.boradeexcursao.gateway.database.repository.AgencyLogoRepository
import br.com.boradeexcursao.gateway.translator.AgencyLogoEntityToRetrievedAgencyLogoDomainTranslator
import org.springframework.stereotype.Service

@Service("getAgencyLogoGatewayImpl")
class GetAgencyLogoGatewayImpl(private val agencyLogoRepository: AgencyLogoRepository) : GetAgencyLogoGateway {

    override fun findAllByAgencyId(agencyId: String): List<RetrievedAgencyLogoDomain> {

        return agencyLogoRepository.findAllByAgencyId(agencyId).map { AgencyLogoEntityToRetrievedAgencyLogoDomainTranslator.translate(it) }

    }
}