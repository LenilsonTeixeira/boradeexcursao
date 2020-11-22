package br.com.boradeexcursao.api

import br.com.boradeexcursao.api.response.RetrievedAgencyLogoResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus

@RequestMapping
interface GetAgencyLogoApi {

    @GetMapping("agencies/{id}/logo")
    @ResponseStatus(value = HttpStatus.OK)
    fun get(@PathVariable("id") id: String) : RetrievedAgencyLogoResponse

}