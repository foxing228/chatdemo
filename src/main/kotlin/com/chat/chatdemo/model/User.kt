package com.chat.chatdemo.model

import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.FieldType
import org.springframework.data.mongodb.core.mapping.MongoId

@Document("users")
data class User(
    @MongoId(value = FieldType.OBJECT_ID)
    val id: String,
    val name: String,
    val phoneNumber: String,
    val bio: String,
//    @DBRef
    val chat: List<Chat>,
//    @DBRef
    val message: List<Message>
)