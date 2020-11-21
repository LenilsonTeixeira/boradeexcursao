package br.com.boradeexcursao.api.request

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class AddAgencyPhoneRequest (

        @field:NotBlank(message = "The ddd must be informed")
        @field:Size(max = 3, message = "The max ddd size is 3 characters")
        val ddd: String,

        @field:NotBlank(message = "The number must be informed")
        @field:Size(max = 15, message = "The max city size is 15 characters")
        val number: String
)