package br.com.boradeexcursao.domain

data class AddedAgencyDomain(
        val uuid: String,
        val name: String,
        val cadastur: String,
        val cnpj: String,
        val email: String,
        val owner: String,
        val address: AddedAgencyAddressDomain,
        val phones: List<AddedAgencyPhoneDomain>,
        val socialMedias: List<AddedAgencySocialMediaDomain>
)