package br.com.boradeexcursao.api.request

import javax.validation.Valid
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class AddAgencyRequest(

        @field:NotBlank(message = "The name must be informed")
        @field:Size(max = 255, message = "The max name size is 255 characters")
        val name: String,

        @field:NotBlank(message = "The cadastur must be informed")
        @field:Size(max = 40, message = "The max cadastur size is 40 characters")
        val cadastur: String,

        @field:NotBlank(message = "The cnpj must be informed")
        @field:Size(max = 40, message = "The max cnpj size is 40 characters")
        val cnpj: String,

        @field:NotBlank(message = "The email must be informed")
        @field:Size(max = 255, message = "The max email size is 255 characters")
        val email: String,

        @field:NotBlank(message = "The owner must be informed")
        @field:Size(max = 255, message = "The max owner size is 255 characters")
        val owner: String,

        //LIST OWNER

        @field:Valid
        @field:NotNull(message = "The address is required")
        val address: AddAgencyAddressRequest,

        @field:Valid
        @field:NotNull(message = "At least one phone must be informed at list of phones")
        val phones: List<AddAgencyPhoneRequest>,

        @field:Valid
        @field:NotNull(message = "At least one social media must be informed at list of social medias")
        val socialMedias: List<AddAgencySocialMediaRequest>
)
