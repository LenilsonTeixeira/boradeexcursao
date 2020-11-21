package br.com.boradeexcursao.domain

data class AddAgencyDomain(
        val name: String,
        val cadastur: String,
        val cnpj: String,
        val email: String,
        val owner: String,
        val address: AddAgencyAddressDomain,
        val phones: List<AddAgencyPhoneDomain>,
        val socialMedias: List<AddAgencySocialMediaDomain>
)