package br.com.boradeexcursao.controller.translate

import br.com.boradeexcursao.api.request.UpdateAgencyRequest
import br.com.boradeexcursao.domain.UpdateAgencyAddressDomain
import br.com.boradeexcursao.domain.UpdateAgencyDomain
import br.com.boradeexcursao.domain.UpdateAgencyPhoneDomain
import br.com.boradeexcursao.domain.UpdateAgencySocialMediaDomain

object UpdateAgencyRequestToUpdateAgencyDomainTranslator {

    fun translate(updateAgencyRequest: UpdateAgencyRequest, uuid: String) : UpdateAgencyDomain {

        val phones = updateAgencyRequest.phones.map { UpdateAgencyPhoneDomain(it.ddd, it.number) }

        val socialMedias = updateAgencyRequest.socialMedias.map { UpdateAgencySocialMediaDomain(it.name, it.url) }

        val address = UpdateAgencyAddressDomain(updateAgencyRequest.address.city, updateAgencyRequest.address.state, updateAgencyRequest.address.zipCode,
                updateAgencyRequest.address.neighborhood, updateAgencyRequest.address.address, updateAgencyRequest.address.number)

        return UpdateAgencyDomain( uuid, updateAgencyRequest.name, updateAgencyRequest.cadastur, updateAgencyRequest.cnpj,
                updateAgencyRequest.email, updateAgencyRequest.owner, address, phones, socialMedias)
    }
}