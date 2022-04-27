package com.toei.manage.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/hello")
    fun getHello(): String {
        return "Hello WorldA"
    }
}