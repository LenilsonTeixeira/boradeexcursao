package br.com.boradeexcursao.api

import br.com.boradeexcursao.api.request.AddAgencyRequest
import br.com.boradeexcursao.api.response.AddedAgencyResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import javax.validation.Valid

@RequestMapping
interface AddAgencyApi {

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("agencies")
    fun add(@Valid @RequestBody addAgencyRequest: AddAgencyRequest) : AddedAgencyResponse
}