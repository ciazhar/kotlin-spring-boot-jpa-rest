package com.ciazhar.springkotlinrest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SpringKotlinRestApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringKotlinRestApplication::class.java, *args)
}
