package br.com.boradeexcursao.api.request

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class AddAgencySocialMediaRequest(

        @field:NotBlank(message = "The name must be informed")
        @field:Size(max = 60, message = "The max name size is 60 characters")
        val name: String,

        @field:NotBlank(message = "The url must be informed")
        val url: String
)