package br.com.boradeexcursao.gateway.database.entity


data class AgencyAddressEntity(
         val city: String,
         val state: String,
         val zipCode: String,
         val neighborhood: String,
         val address: String,
         val number: String
)