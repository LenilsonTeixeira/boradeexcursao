package br.com.boradeexcursao.gateway.impl

import br.com.boradeexcursao.domain.UpdateAgencyDomain
import br.com.boradeexcursao.domain.UpdatedAgencyDomain
import br.com.boradeexcursao.gateway.UpdateAgencyGateway
import br.com.boradeexcursao.gateway.database.repository.AgencyRepository
import br.com.boradeexcursao.gateway.translator.AgencyEntityToUpdatedAgencyDomainTranslator
import br.com.boradeexcursao.gateway.translator.UpdateAgencyDomainToAgencyEntityTranslator
import org.springframework.stereotype.Service

@Service("updateAgencyGatewayImpl")
class UpdateAgencyGatewayImpl(private val agencyRepository: AgencyRepository) : UpdateAgencyGateway{
    override fun update(updateAgencyDomain: UpdateAgencyDomain): UpdatedAgencyDomain {

        val agencyEntity = agencyRepository.save(UpdateAgencyDomainToAgencyEntityTranslator.translate(updateAgencyDomain))

        return AgencyEntityToUpdatedAgencyDomainTranslator.translate(agencyEntity)
    }
}