package br.com.boradeexcursao.controller

import br.com.boradeexcursao.api.GetOneAgencyApi
import br.com.boradeexcursao.api.response.ObtainedAgencyResponse
import br.com.boradeexcursao.controller.translate.ObtainedAgencyDomainToObtainedAgencyResponseTranslator
import br.com.boradeexcursao.usecase.GetOneAgencyUseCase
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GetOneAgencyController(private val getOneAgencyUseCase: GetOneAgencyUseCase) : GetOneAgencyApi{

    override fun get(@PathVariable("id") uuid: String): ObtainedAgencyResponse {

        return ObtainedAgencyDomainToObtainedAgencyResponseTranslator.translate(getOneAgencyUseCase.execute(uuid))

    }

}