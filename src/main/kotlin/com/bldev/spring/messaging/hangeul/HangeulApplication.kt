package com.bldev.spring.messaging.hangeul

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
@EnableKafka
class HangeulApplication

fun main(args: Array<String>) {
    runApplication<HangeulApplication>(*args)
}
