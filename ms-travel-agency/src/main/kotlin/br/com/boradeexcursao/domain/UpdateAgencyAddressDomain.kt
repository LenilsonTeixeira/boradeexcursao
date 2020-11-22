package br.com.boradeexcursao.domain

data class UpdateAgencyAddressDomain(
        val city: String,
        val state: String,
        val zipCode: String,
        val neighborhood: String,
        val address: String,
        val number: String
)