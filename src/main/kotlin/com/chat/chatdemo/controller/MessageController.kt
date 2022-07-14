package com.chat.chatdemo.controller

import com.chat.chatdemo.model.User
import com.chat.chatdemo.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/users")
class MessageController(
    private val userService: UserService
) {

    @GetMapping
    fun addUser() {
        userService.createUser(User(
            UUID.randomUUID().toString(),
            "DSSDDS",
            "455445",
            "sddsds",
            listOf(),
            listOf()
        ))
    }
}