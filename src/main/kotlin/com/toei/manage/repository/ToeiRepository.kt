package com.toei.manage.repository

import com.toei.manage.entity.Toei
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ToeiRepository : JpaRepository<Toei, String> {
    fun findByUserId(userId: String): Boolean
}