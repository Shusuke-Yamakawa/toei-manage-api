package com.toei.manage.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Toei(
    @Id
    @Column(name = "card_id", nullable = false, length = 8)
    val cardId: String? = null,

    @Column(nullable = false, length = 8)
    var password: String? = null,

    @Column(name = "user_nm_kj", length = 80)
    var userNmKj: String? = null,

    @Column(name = "user_nm_kn", nullable = false, length = 80)
    var userNmKn: String? = null,

    @Column(name = "give_nm", length = 80)
    var giveNm: String? = null,

    @Column(name = "expire_date")
    var expireDate: Date? = null,

    @Column(name = "available_flg", nullable = false)
    var availableFlg: Int = 1,

    var note: String? = null,

    @Column(name = "delete_flg", nullable = false)
    var deleteFlg: Int = 0,

    @Column(name = "user_id", nullable = false)
    val userId: Int? = null,

    ) : AbstractEntity()