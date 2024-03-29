package br.com.boradeexcursao.api.response

data class AddedAgencyResponse(
        val uuid: String,
        val name: String,
        val cadastur: String,
        val cnpj: String,
        val email: String,
        val owner: String,
        val address: AddedAgencyAddressResponse,
        val phones: List<AddedAgencyPhoneResponse>,
        val socialMedias: List<AddedAgencySocialMediaResponse>
)