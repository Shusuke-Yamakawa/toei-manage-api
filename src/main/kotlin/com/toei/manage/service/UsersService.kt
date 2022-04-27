package com.toei.manage.service

import com.toei.manage.api.users.UserPostResource
import com.toei.manage.entity.Users
import com.toei.manage.repository.UsersRepository
import org.apache.commons.logging.LogFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UsersService {

    @Autowired
    lateinit var usersRepository: UsersRepository

    private val logger = LogFactory.getLog(javaClass)

    fun createUser(userPostResource: UserPostResource) {
        val users = Users()
        users.name = userPostResource.name
        users.mailAddress = userPostResource.mailAddress
        users.password = userPostResource.password

        usersRepository.save(users)
    }
}