package br.com.boradeexcursao.domain

data class ObtainedAgencyDomain(
        val id: String,
        val uuid: String,
        val name: String,
        val cadastur: String,
        val cnpj: String,
        val email: String,
        val owner: String,
        val address: ObtainedAgencyAddressDomain,
        val phones: List<ObtainedAgencyPhoneDomain>,
        val socialMedias: List<ObtainedAgencySocialMediaDomain>
)