package br.com.boradeexcursao.domain

data class UpdatedAgencyDomain(
        val uuid: String,
        val name: String,
        val cadastur: String,
        val cnpj: String,
        val email: String,
        val owner: String,
        val address: UpdatedAgencyAddressDomain,
        val phones: List<UpdatedAgencyPhoneDomain>,
        val socialMedias: List<UpdatedAgencySocialMediaDomain>
)