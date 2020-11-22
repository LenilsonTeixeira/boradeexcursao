package br.com.boradeexcursao.gateway.impl

import br.com.boradeexcursao.domain.SaveAgencyLogoDomain
import br.com.boradeexcursao.gateway.SaveAgencyLogoGateway
import br.com.boradeexcursao.gateway.database.repository.AgencyLogoRepository
import br.com.boradeexcursao.gateway.translator.SaveAgencyLogoDomainToAgencyLogoEntityTranslator
import org.springframework.stereotype.Service

@Service("saveAgencyLogoGatewayImpl")
class SaveAgencyLogoGatewayImpl(private val agencyLogoRepository: AgencyLogoRepository) : SaveAgencyLogoGateway{

    override fun save(saveAgencyLogoDomain: SaveAgencyLogoDomain) {
        agencyLogoRepository.save(SaveAgencyLogoDomainToAgencyLogoEntityTranslator.translate(saveAgencyLogoDomain))
    }
}