package br.com.boradeexcursao.gateway

import br.com.boradeexcursao.domain.RetrievedAgencyLogoDomain

interface GetAgencyLogoGateway {

    fun findAllByAgencyId(agencyId: String) : List<RetrievedAgencyLogoDomain>

}