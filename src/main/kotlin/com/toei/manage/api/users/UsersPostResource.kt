package com.toei.manage.api.users

data class UserPostResource(
    val name: String,
    val mailAddress: String,
    val password: String
)