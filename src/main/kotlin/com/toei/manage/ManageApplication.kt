package com.toei.manage

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class ManageApplication

fun main(args: Array<String>) {
    runApplication<ManageApplication>(*args)
}
