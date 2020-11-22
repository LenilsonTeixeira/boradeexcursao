package br.com.boradeexcursao.gateway.translator

import br.com.boradeexcursao.domain.RetrievedAgencyLogoDomain
import br.com.boradeexcursao.gateway.database.entity.AgencyLogoEntity

object AgencyLogoEntityToRetrievedAgencyLogoDomainTranslator {

    fun translate(agencyLogoEntity: AgencyLogoEntity) : RetrievedAgencyLogoDomain {

        return RetrievedAgencyLogoDomain(agencyLogoEntity.agencyId!!, agencyLogoEntity.url!!)

    }
}