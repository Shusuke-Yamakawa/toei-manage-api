package com.toei.manage.service

import com.toei.manage.repository.ToeiRepository
import org.apache.commons.logging.LogFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CardService {

    @Autowired
    lateinit var toeiRepository: ToeiRepository

    private val logger = LogFactory.getLog(javaClass)

    fun getCard(name: String?) {
        this.logger.info(toeiRepository.findById("87242690"));
    }
}