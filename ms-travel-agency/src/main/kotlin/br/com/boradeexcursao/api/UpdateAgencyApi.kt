package br.com.boradeexcursao.api

import br.com.boradeexcursao.api.request.UpdateAgencyRequest
import br.com.boradeexcursao.api.response.UpdatedAgencyResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import javax.validation.Valid

@RequestMapping
interface UpdateAgencyApi {

    @PutMapping("agencies/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    fun update(@PathVariable("id") uuid: String , @Valid @RequestBody updateAgencyRequest: UpdateAgencyRequest) : UpdatedAgencyResponse

}