package com.toei.manage.api.card

import com.toei.manage.service.CardService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CardController(private val cardService: CardService) {
    @GetMapping("/card")
    fun getCard(@RequestParam(required = false) name: String?) {
        cardService.getCard(name)
    }
}