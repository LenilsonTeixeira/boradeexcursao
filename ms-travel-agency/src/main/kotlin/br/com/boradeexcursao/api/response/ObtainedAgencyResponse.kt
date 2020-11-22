package br.com.boradeexcursao.api.response

data class ObtainedAgencyResponse(
        val uuid: String,
        val name: String,
        val cadastur: String,
        val cnpj: String,
        val email: String,
        val owner: String,
        val address: ObtainedAgencyAddressResponse,
        val phones: List<ObtainedAgencyPhoneResponse>,
        val socialMedias: List<ObtainedAgencySocialMediaResponse>
)