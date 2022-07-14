package com.chat.chatdemo.service

import com.chat.chatdemo.model.Chat
import com.chat.chatdemo.repository.ChatRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ChatServiceImpl : ChatService {

    @Autowired(required = false)
    lateinit var chatRepository: ChatRepository

//    override fun createChat(users: List<UserDto?>?): ChatDto {
//        val chat = ChatDto()
//        chat.setUsers(HashSet<Any?>(users))
//        return chatRepository.save(chat)
//    }

    override fun findAll(): List<Chat> {
//        return chatRepository.findAll()
        TODO()
    }
}