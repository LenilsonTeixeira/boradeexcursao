package br.com.boradeexcursao.api.request

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class AddAgencyAddressRequest(

        @field:NotBlank(message = "The city must be informed")
        @field:Size(max = 60, message = "The max city size is 60 characters")
        val city: String,

        @field:NotBlank(message = "The state must be informed")
        @field:Size(max = 2, message = "The max state size is 2 characters")
        val state: String,

        @field:NotBlank(message = "The zip code must be informed")
        @field:Size(max = 20, message = "The max zip code size is 20 characters")
        val zipCode: String,

        @field:NotBlank(message = "The neighborhood must be informed")
        @field:Size(max = 60, message = "The max neighborhood size is 60 characters")
        val neighborhood: String,

        @field:NotBlank(message = "The address must be informed")
        @field:Size(max = 255, message = "The max address size is 255 characters")
        val address: String,

        @field:NotBlank(message = "The number must be informed")
        val number: String
)