package br.com.boradeexcursao.api

import br.com.boradeexcursao.api.response.UploadedAgencyLogoResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.multipart.MultipartFile

@RequestMapping
interface UploadAgencyLogoApi {

    @PutMapping("agencies/{id}/upload")
    @ResponseStatus(value = HttpStatus.OK)
    fun upload(@PathVariable("id") id: String, logo: MultipartFile) : UploadedAgencyLogoResponse

}