package br.com.boradeexcursao.gateway.impl

import br.com.boradeexcursao.gateway.DeleteAgencyLogoGateway
import br.com.boradeexcursao.gateway.database.repository.AgencyLogoRepository
import org.springframework.stereotype.Service

@Service("deleteAgencyLogoGatewayImpl")
class DeleteAgencyLogoGatewayImpl(private val agencyLogoRepository: AgencyLogoRepository) : DeleteAgencyLogoGateway {

    override fun deleteByAgencyId(agencyId: String) {

        agencyLogoRepository.deleteByAgencyId(agencyId)

    }
}