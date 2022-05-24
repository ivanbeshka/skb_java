package com.example.skb_java.event_listeners

import com.example.skb_java.events.MyEvent
import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.EnableAsync
import java.util.logging.Logger

@EnableAsync
@Configuration
class AsyncEventListener : ApplicationListener<MyEvent>{
    private val logger = Logger.getLogger(this.javaClass.name)

    @Async
    override fun onApplicationEvent(event: MyEvent) {
        Thread.sleep(1000)
        logger.warning(event.message + " after sleep 1 sec")
    }
}