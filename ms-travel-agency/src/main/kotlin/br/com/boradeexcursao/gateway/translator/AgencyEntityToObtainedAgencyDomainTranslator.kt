package br.com.boradeexcursao.gateway.translator

import br.com.boradeexcursao.domain.ObtainedAgencyAddressDomain
import br.com.boradeexcursao.domain.ObtainedAgencyDomain
import br.com.boradeexcursao.domain.ObtainedAgencyPhoneDomain
import br.com.boradeexcursao.domain.ObtainedAgencySocialMediaDomain
import br.com.boradeexcursao.gateway.database.entity.AgencyEntity

object AgencyEntityToObtainedAgencyDomainTranslator {

    fun translate(agencyEntity: AgencyEntity) : ObtainedAgencyDomain {
        val socialMedias = agencyEntity.socialMedias.map { ObtainedAgencySocialMediaDomain(it.name, it.url) }

        val phones = agencyEntity.phones.map { ObtainedAgencyPhoneDomain(it.ddd, it.number) }

        val address = ObtainedAgencyAddressDomain(agencyEntity.address.city, agencyEntity.address.state, agencyEntity.address.zipCode,
                agencyEntity.address.neighborhood, agencyEntity.address.address, agencyEntity.address.number)

        return ObtainedAgencyDomain(agencyEntity.id!!, agencyEntity.uuid, agencyEntity.name, agencyEntity.cadastur, agencyEntity.cnpj,
                agencyEntity.email, agencyEntity.owner, address, phones, socialMedias)
    }

}