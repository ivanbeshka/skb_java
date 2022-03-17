package com.example.skb_java.engine

import org.springframework.stereotype.Component

@Component("CustomEngine")
class CustomEngine : IEngine {
    override fun work() {
        println("CustomEngine working")
    }
}