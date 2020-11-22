package br.com.boradeexcursao.gateway.translator

import br.com.boradeexcursao.domain.SaveAgencyLogoDomain
import br.com.boradeexcursao.gateway.database.entity.AgencyLogoEntity

object SaveAgencyLogoDomainToAgencyLogoEntityTranslator {

    fun translate(saveAgencyLogoDomain: SaveAgencyLogoDomain) : AgencyLogoEntity {
        return AgencyLogoEntity(saveAgencyLogoDomain.agencyId, saveAgencyLogoDomain.url)
    }
}