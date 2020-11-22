package br.com.boradeexcursao.api.response

data class ObtainedAgencyAddressResponse(
        val city: String,
        val state: String,
        val zipCode: String,
        val neighborhood: String,
        val address: String,
        val number: String
)