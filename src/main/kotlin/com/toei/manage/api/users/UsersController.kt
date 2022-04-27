package com.toei.manage.api.users

import com.toei.manage.service.UsersService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UsersController(private val usersService: UsersService) {
    @PostMapping("/users")
    fun createUser(@RequestBody userPostResource: UserPostResource) {
        usersService.createUser(userPostResource)
    }
}