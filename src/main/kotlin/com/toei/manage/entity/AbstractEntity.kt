package com.toei.manage.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.MappedSuperclass
import javax.persistence.PrePersist
import javax.persistence.PreUpdate

@MappedSuperclass
abstract class AbstractEntity {

    @Column(name = "created_at")
    var createdAt: Date? = null

    @Column(name = "updated_at")
    var updatedAt: Date? = null

    @PrePersist
    fun onPrePersist() {
        createdAt = Date()
        updatedAt = Date()
    }

    @PreUpdate
    fun onPreUpdate() {
        updatedAt = Date()
    }
}