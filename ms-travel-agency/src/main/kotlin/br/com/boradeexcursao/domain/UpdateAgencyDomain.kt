package br.com.boradeexcursao.domain

data class UpdateAgencyDomain(
        var id: String? = null,
        val uuid: String,
        val name: String,
        val cadastur: String,
        val cnpj: String,
        val email: String,
        val owner: String,
        val address: UpdateAgencyAddressDomain,
        val phones: List<UpdateAgencyPhoneDomain>,
        val socialMedias: List<UpdateAgencySocialMediaDomain>
) {
    constructor(uuid: String, name: String, cadastur: String, cnpj: String, email: String, owner: String, address: UpdateAgencyAddressDomain,
                phones: List<UpdateAgencyPhoneDomain>, socialMedias: List<UpdateAgencySocialMediaDomain>) :
            this(null, uuid, name, cadastur, cnpj, email, owner, address, phones, socialMedias)
}