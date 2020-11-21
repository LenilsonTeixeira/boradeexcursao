package br.com.boradeexcursao.gateway.translator

import br.com.boradeexcursao.domain.AddedAgencyAddressDomain
import br.com.boradeexcursao.domain.AddedAgencyDomain
import br.com.boradeexcursao.domain.AddedAgencyPhoneDomain
import br.com.boradeexcursao.domain.AddedAgencySocialMediaDomain
import br.com.boradeexcursao.gateway.database.entity.AgencyEntity

object AgencyEntityToAddedAgencyDomainTranslator {

    fun translate(agencyEntity: AgencyEntity) : AddedAgencyDomain {

       val socialMedias = agencyEntity.socialMedias.map { AddedAgencySocialMediaDomain(it.name, it.url) }

       val phones = agencyEntity.phones.map { AddedAgencyPhoneDomain(it.ddd, it.number) }

       val address = AddedAgencyAddressDomain(agencyEntity.address.city, agencyEntity.address.state, agencyEntity.address.zipCode,
       agencyEntity.address.neighborhood, agencyEntity.address.address, agencyEntity.address.number)

       return AddedAgencyDomain(
               agencyEntity.uuid, agencyEntity.name, agencyEntity.cadastur, agencyEntity.cnpj,
               agencyEntity.email, agencyEntity.owner, address, phones, socialMedias)
    }
}