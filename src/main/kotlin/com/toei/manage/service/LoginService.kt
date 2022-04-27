package com.toei.manage.service

import com.toei.manage.api.login.LoginResource
import com.toei.manage.entity.Users
import com.toei.manage.repository.UsersRepository
import org.apache.commons.logging.LogFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class LoginService {

    @Autowired
    lateinit var usersRepository: UsersRepository

    private val logger = LogFactory.getLog(javaClass)

    fun login(loginResource: LoginResource): Users {
        return usersRepository.findByMailAddressAndPassword(loginResource.mailAddress, loginResource.password)
            ?: throw Exception("ログイン失敗")
    }
}