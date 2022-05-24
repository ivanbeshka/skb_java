package com.example.skb_java.events

import org.springframework.context.ApplicationEvent

class MyEvent(source: Any, val message: String) : ApplicationEvent(source)