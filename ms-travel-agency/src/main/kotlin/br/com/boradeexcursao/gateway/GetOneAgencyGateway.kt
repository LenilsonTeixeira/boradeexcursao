package br.com.boradeexcursao.gateway

import br.com.boradeexcursao.domain.ObtainedAgencyDomain

interface GetOneAgencyGateway {

    fun getByUuid(uuid: String) : ObtainedAgencyDomain

}