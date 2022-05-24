package com.example.skb_java.publishers

import com.example.skb_java.events.MyEvent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class MyEventPublisher {
    private val logger = Logger.getLogger(this.javaClass.name)

    @Autowired
    lateinit var publisher: ApplicationEventPublisher

    fun publishMyEvent(msg: String) {
        val myEvent = MyEvent(this, msg)
        logger.warning("${myEvent.message} published")
        publisher.publishEvent(myEvent)
    }
}