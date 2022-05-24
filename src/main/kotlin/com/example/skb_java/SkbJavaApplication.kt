package com.example.skb_java

import com.example.skb_java.publishers.MyEventPublisher
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.annotation.PostConstruct

@SpringBootApplication
class SkbJavaApplication {
    @Autowired
    lateinit var myEventPublisher: MyEventPublisher

    @PostConstruct
    fun postConstruct() {
        myEventPublisher.publishMyEvent("application created")
    }
}

fun main(args: Array<String>) {
    runApplication<SkbJavaApplication>(*args)
}
