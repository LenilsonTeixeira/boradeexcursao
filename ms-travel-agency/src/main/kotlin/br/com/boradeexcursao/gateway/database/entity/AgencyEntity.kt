package br.com.boradeexcursao.gateway.database.entity

import java.util.*
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "agencies")
data class AgencyEntity(
        @Id
        val id: String? = "",

        val uuid: String,

        val name: String,

        @Indexed(unique = true)
        val cadastur: String,

        @Indexed(unique = true)
        val cnpj: String,

        val email: String,

        val owner: String,

        val address: AgencyAddressEntity,

        val phones: List<AgencyPhoneEntity>,

        val socialMedias: List<AgencySocialMediaEntity>
) {
        constructor(name: String, cadastur: String, cnpj: String,
                    email: String, owner: String, address: AgencyAddressEntity,
                    phones: List<AgencyPhoneEntity>, socialMedias: List<AgencySocialMediaEntity>) :
                this(null, UUID.randomUUID().toString(), name, cadastur, cnpj, email, owner, address, phones, socialMedias)

}
