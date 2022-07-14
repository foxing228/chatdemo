package com.chat.chatdemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/chats")
class ChatController {

    @GetMapping("")
    fun test(): String {
        return "fddf"
    }

    //    @PostMapping("/messages")
    //    @ResponseStatus(HttpStatus.CREATED)
    //    public void addMessageToTheChat(@RequestBody Message message, Chat chat) {
    //
    //        chatService.addMessageToTheChat(message, chat);
    //    }
//    @GetMapping("/findAllChats")
//    fun findByChatTopic(): ResponseEntity<List<ChatDto>?>? {
//        val chats: List<ChatDto> = chatService.findAll()
//        return if (chats.isEmpty()) {
//            ResponseEntity<List<ChatDto>?>(HttpStatus.NO_CONTENT)
//        } else ResponseEntity<List<ChatDto>?>(chats, HttpStatus.OK)
//    }


//    @PostMapping
//    fun createChat(): List<UserDto> = chatService.createChat()
}