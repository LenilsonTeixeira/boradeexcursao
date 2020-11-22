package br.com.boradeexcursao.api.response

data class UpdatedAgencyResponse(
        val uuid: String,
        val name: String,
        val cadastur: String,
        val cnpj: String,
        val email: String,
        val owner: String,
        val address: UpdatedAgencyAddressResponse,
        val phones: List<UpdatedAgencyPhoneResponse>,
        val socialMedias: List<UpdatedAgencySocialMediaResponse>
)