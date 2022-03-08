package com.example.skb_java

import com.google.common.collect.Multimap
import com.google.common.math.IntMath
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SkbJavaApplication

fun main(args: Array<String>) {
	runApplication<SkbJavaApplication>(*args)
	println(IntMath.isPrime(7))
}
