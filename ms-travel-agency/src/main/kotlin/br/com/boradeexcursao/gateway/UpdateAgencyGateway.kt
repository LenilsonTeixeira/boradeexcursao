package br.com.boradeexcursao.gateway

import br.com.boradeexcursao.domain.UpdateAgencyDomain
import br.com.boradeexcursao.domain.UpdatedAgencyDomain

interface UpdateAgencyGateway {

    fun update(updateAgencyDomain: UpdateAgencyDomain) : UpdatedAgencyDomain

}