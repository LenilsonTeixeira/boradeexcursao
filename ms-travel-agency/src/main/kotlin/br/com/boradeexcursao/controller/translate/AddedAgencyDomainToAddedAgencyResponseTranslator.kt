package br.com.boradeexcursao.controller.translate

import br.com.boradeexcursao.api.response.AddedAgencyAddressResponse
import br.com.boradeexcursao.api.response.AddedAgencyPhoneResponse
import br.com.boradeexcursao.api.response.AddedAgencyResponse
import br.com.boradeexcursao.api.response.AddedAgencySocialMediaResponse
import br.com.boradeexcursao.domain.AddedAgencyDomain

object AddedAgencyDomainToAddedAgencyResponseTranslator {

    fun translate(addedAgencyDomain: AddedAgencyDomain) : AddedAgencyResponse {
        val phones = addedAgencyDomain.phones.map { AddedAgencyPhoneResponse(it.ddd, it.number) }

        val socialMedias = addedAgencyDomain.socialMedias.map { AddedAgencySocialMediaResponse(it.name, it.url) }

        val address = AddedAgencyAddressResponse(addedAgencyDomain.address.city, addedAgencyDomain.address.state, addedAgencyDomain.address.zipCode,
                addedAgencyDomain.address.neighborhood, addedAgencyDomain.address.address, addedAgencyDomain.address.number)

        return AddedAgencyResponse(addedAgencyDomain.uuid, addedAgencyDomain.name, addedAgencyDomain.cadastur, addedAgencyDomain.cnpj,
                addedAgencyDomain.email, addedAgencyDomain.owner, address, phones, socialMedias)
    }
}