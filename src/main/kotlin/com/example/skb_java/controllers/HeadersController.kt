package com.example.skb_java.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController

@RestController
class HeadersController {

    @GetMapping("/headers")
    fun getHeaders(@RequestHeader headers: Map<String, String>): List<String> {
        return headers.map { it.key }
    }
}