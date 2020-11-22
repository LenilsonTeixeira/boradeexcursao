package br.com.boradeexcursao.gateway.translator

import br.com.boradeexcursao.domain.UpdateAgencyDomain
import br.com.boradeexcursao.gateway.database.entity.AgencyAddressEntity
import br.com.boradeexcursao.gateway.database.entity.AgencyEntity
import br.com.boradeexcursao.gateway.database.entity.AgencyPhoneEntity
import br.com.boradeexcursao.gateway.database.entity.AgencySocialMediaEntity

object UpdateAgencyDomainToAgencyEntityTranslator {

    fun translate(updateAgencyDomain: UpdateAgencyDomain): AgencyEntity {

        val address = AgencyAddressEntity(
                updateAgencyDomain.address.city, updateAgencyDomain.address.state,
                updateAgencyDomain.address.zipCode, updateAgencyDomain.address.neighborhood,
                updateAgencyDomain.address.address, updateAgencyDomain.address.number)

        val phones = updateAgencyDomain.phones.map { AgencyPhoneEntity(it.ddd, it.number) }

        val socialMedias = updateAgencyDomain.socialMedias.map { AgencySocialMediaEntity(it.name, it.url) }

        return AgencyEntity(updateAgencyDomain.id, updateAgencyDomain.uuid,updateAgencyDomain.name, updateAgencyDomain.cadastur,
                updateAgencyDomain.cnpj, updateAgencyDomain.email,
                updateAgencyDomain.owner, address, phones, socialMedias)
    }
}