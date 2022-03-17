package com.example.skb_java.engine

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
class DefEngine : IEngine {
    override fun work() {
        println("Engine working")
    }

    @PostConstruct
    fun postConstruct() {
        println("${javaClass.name} is create")
    }

    @PreDestroy
    fun preDestroy() {
        println("${javaClass.name} is dead")
    }
}