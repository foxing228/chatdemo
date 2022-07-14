package com.chat.chatdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = arrayOf(
    "com.chat.chatdemo")
)
class ChatDemoApplication

fun main(args: Array<String>) {
    runApplication<ChatDemoApplication>(*args)
}


