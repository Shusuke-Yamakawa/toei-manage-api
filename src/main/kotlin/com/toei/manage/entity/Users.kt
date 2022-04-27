package com.toei.manage.entity

import javax.persistence.*

@Entity
data class Users(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val userId: Int? = null,

    @Column(nullable = false, length = 100)
    var name: String? = null,

    @Column(name = "mail_address", nullable = false, length = 256)
    var mailAddress: String? = null,

    @Column(nullable = false, length = 128)
    var password: String? = null,

    @Column(name = "delete_flg", nullable = false)
    var deleteFlg: Int = 0,

    ) : AbstractEntity()