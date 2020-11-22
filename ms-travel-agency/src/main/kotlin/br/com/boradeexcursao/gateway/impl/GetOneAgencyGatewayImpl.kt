package br.com.boradeexcursao.gateway.impl

import br.com.boradeexcursao.domain.ObtainedAgencyDomain
import br.com.boradeexcursao.exception.GetOneAgencyException
import br.com.boradeexcursao.gateway.GetOneAgencyGateway
import br.com.boradeexcursao.gateway.database.repository.AgencyRepository
import br.com.boradeexcursao.gateway.translator.AgencyEntityToObtainedAgencyDomainTranslator
import org.springframework.stereotype.Service

@Service("getOneAgencyGatewayImpl")
class GetOneAgencyGatewayImpl(private val agencyRepository: AgencyRepository) : GetOneAgencyGateway {
    override fun getByUuid(uuid: String): ObtainedAgencyDomain {

        val agencyEntity =  agencyRepository.findByUuid(uuid).orElseThrow{GetOneAgencyException("The agency with uuid $uuid was not found")}

        return AgencyEntityToObtainedAgencyDomainTranslator.translate(agencyEntity)
    }
}