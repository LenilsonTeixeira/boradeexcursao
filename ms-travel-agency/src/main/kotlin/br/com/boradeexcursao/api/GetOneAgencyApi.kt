package br.com.boradeexcursao.api

import br.com.boradeexcursao.api.response.ObtainedAgencyResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus

@RequestMapping
interface GetOneAgencyApi {

    @GetMapping("agencies/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    fun get(@PathVariable("id") uuid: String) : ObtainedAgencyResponse
}