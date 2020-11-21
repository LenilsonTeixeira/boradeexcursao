package br.com.boradeexcursao.gateway

import br.com.boradeexcursao.domain.AddAgencyDomain
import br.com.boradeexcursao.domain.AddedAgencyDomain

interface AddAgencyGateway {

    fun add(addAgencyDomain: AddAgencyDomain) : AddedAgencyDomain
}