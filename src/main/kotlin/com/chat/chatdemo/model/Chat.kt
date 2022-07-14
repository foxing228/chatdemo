package com.chat.chatdemo.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.FieldType
import org.springframework.data.mongodb.core.mapping.MongoId

@Document("chats")
data class Chat(
    @MongoId(value = FieldType.OBJECT_ID)
    val id: String,
    val topic: String,
//    @DBRef
    val message: List<Message>,
//    @DBRef
    val user: List<User>
)
