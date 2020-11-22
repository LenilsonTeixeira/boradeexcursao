package br.com.boradeexcursao.controller.translate

import br.com.boradeexcursao.api.response.UpdatedAgencyAddressResponse
import br.com.boradeexcursao.api.response.UpdatedAgencyPhoneResponse
import br.com.boradeexcursao.api.response.UpdatedAgencyResponse
import br.com.boradeexcursao.api.response.UpdatedAgencySocialMediaResponse
import br.com.boradeexcursao.domain.UpdatedAgencyDomain

object UpdatedAgencyDomainToUpdatedAgencyResponseTranslator {

    fun translate(updatedAgencyDomain: UpdatedAgencyDomain): UpdatedAgencyResponse {
        val phones = updatedAgencyDomain.phones.map { UpdatedAgencyPhoneResponse(it.ddd, it.number) }

        val socialMedias = updatedAgencyDomain.socialMedias.map { UpdatedAgencySocialMediaResponse(it.name, it.url) }

        val address = UpdatedAgencyAddressResponse(updatedAgencyDomain.address.city, updatedAgencyDomain.address.state, updatedAgencyDomain.address.zipCode,
                updatedAgencyDomain.address.neighborhood, updatedAgencyDomain.address.address, updatedAgencyDomain.address.number)

        return UpdatedAgencyResponse(updatedAgencyDomain.uuid, updatedAgencyDomain.name, updatedAgencyDomain.cadastur, updatedAgencyDomain.cnpj,
                updatedAgencyDomain.email, updatedAgencyDomain.owner, address, phones, socialMedias)
    }
}