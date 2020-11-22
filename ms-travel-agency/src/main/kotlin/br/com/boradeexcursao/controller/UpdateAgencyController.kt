package br.com.boradeexcursao.controller

import br.com.boradeexcursao.api.UpdateAgencyApi
import br.com.boradeexcursao.api.request.UpdateAgencyRequest
import br.com.boradeexcursao.api.response.UpdatedAgencyResponse
import br.com.boradeexcursao.controller.translate.UpdateAgencyRequestToUpdateAgencyDomainTranslator
import br.com.boradeexcursao.controller.translate.UpdatedAgencyDomainToUpdatedAgencyResponseTranslator
import br.com.boradeexcursao.usecase.UpdateAgencyUseCase
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class UpdateAgencyController(private val updateAgencyUseCase: UpdateAgencyUseCase) : UpdateAgencyApi{

    override fun update(@PathVariable("id") uuid: String, @Valid @RequestBody updateAgencyRequest: UpdateAgencyRequest): UpdatedAgencyResponse {

        val updatedAgencyDomain = updateAgencyUseCase.execute(UpdateAgencyRequestToUpdateAgencyDomainTranslator.translate(updateAgencyRequest, uuid))

        return UpdatedAgencyDomainToUpdatedAgencyResponseTranslator.translate(updatedAgencyDomain)

    }
}