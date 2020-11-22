package br.com.boradeexcursao.controller.translate

import br.com.boradeexcursao.api.response.ObtainedAgencyAddressResponse
import br.com.boradeexcursao.api.response.ObtainedAgencyPhoneResponse
import br.com.boradeexcursao.api.response.ObtainedAgencyResponse
import br.com.boradeexcursao.api.response.ObtainedAgencySocialMediaResponse
import br.com.boradeexcursao.domain.ObtainedAgencyDomain

object ObtainedAgencyDomainToObtainedAgencyResponseTranslator {

    fun translate(obtainedAgencyDomain: ObtainedAgencyDomain): ObtainedAgencyResponse {

        val phones = obtainedAgencyDomain.phones.map { ObtainedAgencyPhoneResponse(it.ddd, it.number) }

        val socialMedias = obtainedAgencyDomain.socialMedias.map { ObtainedAgencySocialMediaResponse(it.name, it.url) }

        val address = ObtainedAgencyAddressResponse(obtainedAgencyDomain.address.city, obtainedAgencyDomain.address.state, obtainedAgencyDomain.address.zipCode,
                obtainedAgencyDomain.address.neighborhood, obtainedAgencyDomain.address.address, obtainedAgencyDomain.address.number)

        return ObtainedAgencyResponse(obtainedAgencyDomain.uuid, obtainedAgencyDomain.name, obtainedAgencyDomain.cadastur, obtainedAgencyDomain.cnpj,
                obtainedAgencyDomain.email, obtainedAgencyDomain.owner, address, phones, socialMedias)
    }
}