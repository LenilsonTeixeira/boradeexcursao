package br.com.boradeexcursao.controller

import br.com.boradeexcursao.api.GetAgencyLogoApi
import br.com.boradeexcursao.api.response.RetrievedAgencyLogoResponse
import br.com.boradeexcursao.controller.translate.RetrievedAgencyLogoDomainToRetrievedAgencyLogoResponseTranslator
import br.com.boradeexcursao.usecase.GetAgencyLogoUseCase
import org.springframework.web.bind.annotation.RestController

@RestController
class GetAgencyLogoController(private val getAgencyLogoUseCase: GetAgencyLogoUseCase) : GetAgencyLogoApi {

    private val empty: String = ""

    override fun get(id: String): RetrievedAgencyLogoResponse {

        val agencyLogoOptional = getAgencyLogoUseCase.execute(id)

        if(agencyLogoOptional.isPresent) {
            return RetrievedAgencyLogoDomainToRetrievedAgencyLogoResponseTranslator.translate(agencyLogoOptional.get())
        }

        return RetrievedAgencyLogoResponse(empty)

    }
}