package br.com.boradeexcursao.controller

import br.com.boradeexcursao.api.AddAgencyApi
import br.com.boradeexcursao.api.request.AddAgencyRequest
import br.com.boradeexcursao.api.response.AddedAgencyResponse
import br.com.boradeexcursao.controller.translate.AddAgencyRequestToAddAgencyDomainTranslator
import br.com.boradeexcursao.controller.translate.AddedAgencyDomainToAddedAgencyResponseTranslator
import br.com.boradeexcursao.usecase.AddAgencyUseCase
import org.springframework.web.bind.annotation.RestController

@RestController
class AddAgencyController(val addAgencyUseCase: AddAgencyUseCase) : AddAgencyApi {

    override fun add(addAgencyRequest: AddAgencyRequest): AddedAgencyResponse {

        val addedAgencyDomain = addAgencyUseCase.execute(AddAgencyRequestToAddAgencyDomainTranslator.translate(addAgencyRequest))

        return AddedAgencyDomainToAddedAgencyResponseTranslator.translate(addedAgencyDomain)
    }

}