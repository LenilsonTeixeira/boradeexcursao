package br.com.boradeexcursao.gateway.translator

import br.com.boradeexcursao.domain.UpdatedAgencyAddressDomain
import br.com.boradeexcursao.domain.UpdatedAgencyDomain
import br.com.boradeexcursao.domain.UpdatedAgencyPhoneDomain
import br.com.boradeexcursao.domain.UpdatedAgencySocialMediaDomain
import br.com.boradeexcursao.gateway.database.entity.AgencyEntity

object AgencyEntityToUpdatedAgencyDomainTranslator {

    fun translate(agencyEntity: AgencyEntity): UpdatedAgencyDomain {

        val socialMedias = agencyEntity.socialMedias.map { UpdatedAgencySocialMediaDomain(it.name, it.url) }

        val phones = agencyEntity.phones.map { UpdatedAgencyPhoneDomain(it.ddd, it.number) }

        val address = UpdatedAgencyAddressDomain(agencyEntity.address.city, agencyEntity.address.state, agencyEntity.address.zipCode,
                agencyEntity.address.neighborhood, agencyEntity.address.address, agencyEntity.address.number)

        return UpdatedAgencyDomain(
                agencyEntity.uuid, agencyEntity.name, agencyEntity.cadastur, agencyEntity.cnpj,
                agencyEntity.email, agencyEntity.owner, address, phones, socialMedias)
    }
}