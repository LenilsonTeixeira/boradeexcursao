package br.com.boradeexcursao.gateway.translator

import br.com.boradeexcursao.domain.AddAgencyDomain
import br.com.boradeexcursao.gateway.database.entity.AgencyAddressEntity
import br.com.boradeexcursao.gateway.database.entity.AgencyEntity
import br.com.boradeexcursao.gateway.database.entity.AgencyPhoneEntity
import br.com.boradeexcursao.gateway.database.entity.AgencySocialMediaEntity

object AddAgencyDomainToAgencyEntityTranslator {

    fun translate(addAgencyDomain: AddAgencyDomain) : AgencyEntity {

        val address = AgencyAddressEntity(
                addAgencyDomain.address.city, addAgencyDomain.address.state,
                addAgencyDomain.address.zipCode, addAgencyDomain.address.neighborhood,
                addAgencyDomain.address.address, addAgencyDomain.address.number)

        val phones = addAgencyDomain.phones.map { AgencyPhoneEntity(it.ddd, it.number) }

        val socialMedias = addAgencyDomain.socialMedias.map { AgencySocialMediaEntity(it.name, it.url) }

        return AgencyEntity(
                addAgencyDomain.name, addAgencyDomain.cadastur,
                addAgencyDomain.cnpj, addAgencyDomain.email,
                addAgencyDomain.owner, address, phones, socialMedias)
    }
}