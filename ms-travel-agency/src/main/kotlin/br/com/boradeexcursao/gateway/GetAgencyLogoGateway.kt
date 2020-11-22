package br.com.boradeexcursao.gateway

import br.com.boradeexcursao.domain.RetrievedAgencyLogoDomain

interface GetAgencyLogoGateway {

    fun findByAgencyId(agencyId: String) : RetrievedAgencyLogoDomain?

}