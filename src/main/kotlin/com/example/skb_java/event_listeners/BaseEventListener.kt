package com.example.skb_java.event_listeners

import com.example.skb_java.events.MyEvent
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class BaseEventListener : ApplicationListener<MyEvent> {

    private val logger = Logger.getLogger(this.javaClass.name)

    override fun onApplicationEvent(event: MyEvent) {
        logger.warning(event.message)
    }
}