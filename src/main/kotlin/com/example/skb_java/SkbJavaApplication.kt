package com.example.skb_java

import com.example.skb_java.engine.CustomEngine
import com.example.skb_java.engine.DefEngine
import com.example.skb_java.engine.IEngine
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.annotation.PostConstruct

@SpringBootApplication
class SkbJavaApplication(
    @Qualifier("CustomEngine")
    val engine: IEngine,
    val defEngine: IEngine
) {
    @Autowired
    lateinit var fieldCustomEngine: CustomEngine

    var fieldDefEngine: DefEngine? = null
        @Autowired
        set

    @PostConstruct
    fun postConstruct() {
        engine.work()
        defEngine.work()
        fieldCustomEngine.work()
        fieldDefEngine?.work()
    }
}

fun main(args: Array<String>) {
    runApplication<SkbJavaApplication>(*args)
}
