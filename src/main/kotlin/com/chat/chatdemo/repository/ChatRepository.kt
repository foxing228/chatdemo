package com.chat.chatdemo.repository

import com.chat.chatdemo.model.Chat
import org.springframework.data.mongodb.repository.MongoRepository

interface ChatRepository : MongoRepository<Chat, String> {

}