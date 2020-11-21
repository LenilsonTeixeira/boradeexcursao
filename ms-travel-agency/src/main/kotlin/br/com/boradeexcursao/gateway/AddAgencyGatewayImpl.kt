package br.com.boradeexcursao.gateway

import br.com.boradeexcursao.domain.AddAgencyDomain
import br.com.boradeexcursao.domain.AddedAgencyDomain
import br.com.boradeexcursao.gateway.database.repository.AgencyRepository
import br.com.boradeexcursao.gateway.translator.AddAgencyDomainToAgencyEntityTranslator
import br.com.boradeexcursao.gateway.translator.AgencyEntityToAddedAgencyDomainTranslator
import org.springframework.stereotype.Service

@Service("addAgencyGatewayImpl")
class AddAgencyGatewayImpl(val agencyRepository: AgencyRepository) : AddAgencyGateway {

    override fun add(addAgencyDomain: AddAgencyDomain): AddedAgencyDomain {

         val agencyEntity = agencyRepository.save(AddAgencyDomainToAgencyEntityTranslator.translate(addAgencyDomain))

         return AgencyEntityToAddedAgencyDomainTranslator.translate(agencyEntity)
    }

}