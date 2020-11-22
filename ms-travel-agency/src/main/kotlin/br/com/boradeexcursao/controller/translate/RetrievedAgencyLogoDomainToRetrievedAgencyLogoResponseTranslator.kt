package br.com.boradeexcursao.controller.translate

import br.com.boradeexcursao.api.response.RetrievedAgencyLogoResponse
import br.com.boradeexcursao.domain.RetrievedAgencyLogoDomain

object RetrievedAgencyLogoDomainToRetrievedAgencyLogoResponseTranslator {

    fun translate(retrievedAgencyLogoDomain: RetrievedAgencyLogoDomain) : RetrievedAgencyLogoResponse {

        return RetrievedAgencyLogoResponse(retrievedAgencyLogoDomain.url)

    }
}