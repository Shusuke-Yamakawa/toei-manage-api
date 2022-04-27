package com.toei.manage.repository

import com.toei.manage.entity.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsersRepository : JpaRepository<Users, Long> {
    fun findByMailAddressAndPassword(mailAddress: String, password: String): Users?
}