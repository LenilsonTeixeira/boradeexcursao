package br.com.boradeexcursao.gateway

import br.com.boradeexcursao.domain.SaveAgencyLogoDomain

interface SaveAgencyLogoGateway {

    fun save(saveAgencyLogoDomain: SaveAgencyLogoDomain)

}