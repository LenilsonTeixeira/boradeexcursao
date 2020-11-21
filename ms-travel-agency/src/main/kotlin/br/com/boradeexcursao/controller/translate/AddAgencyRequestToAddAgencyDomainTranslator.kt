package br.com.boradeexcursao.controller.translate

import br.com.boradeexcursao.api.request.AddAgencyRequest
import br.com.boradeexcursao.domain.AddAgencyAddressDomain
import br.com.boradeexcursao.domain.AddAgencyDomain
import br.com.boradeexcursao.domain.AddAgencyPhoneDomain
import br.com.boradeexcursao.domain.AddAgencySocialMediaDomain

object AddAgencyRequestToAddAgencyDomainTranslator {

    fun translate(addAgencyRequest: AddAgencyRequest) : AddAgencyDomain {

        val phones = addAgencyRequest.phones.map { AddAgencyPhoneDomain(it.ddd, it.number) }

        val socialMedias = addAgencyRequest.socialMedias.map { AddAgencySocialMediaDomain(it.name, it.url) }

        val address = AddAgencyAddressDomain(addAgencyRequest.address.city, addAgencyRequest.address.state, addAgencyRequest.address.zipCode,
        addAgencyRequest.address.neighborhood, addAgencyRequest.address.address, addAgencyRequest.address.number)

        return AddAgencyDomain(addAgencyRequest.name, addAgencyRequest.cadastur, addAgencyRequest.cnpj,
        addAgencyRequest.email, addAgencyRequest.owner, address, phones, socialMedias)
    }
}