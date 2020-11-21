package br.com.boradeexcursao.api.response

import java.util.*

data class AddedAgencyResponse(
        val uuid: UUID,
        val name: String,
        val cadastur: String,
        val cnpj: String,
        val email: String,
        val owner: String,
        val address: AddedAgencyAddressResponse,
        val phones: List<AddedAgencyPhoneResponse>,
        val socialMedias: List<AddedAgencySocialMediaResponse>
)