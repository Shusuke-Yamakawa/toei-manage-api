package com.toei.manage.api.login

import com.toei.manage.entity.Users
import com.toei.manage.service.LoginService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController(private val loginService: LoginService) {
    //    @CrossOrigin(origins = ["http://localhost:3000"])
    @PostMapping("/login")
    fun login(@RequestBody loginResource: LoginResource): Users {
        return loginService.login(loginResource)
    }
}