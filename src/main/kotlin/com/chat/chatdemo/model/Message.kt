package com.chat.chatdemo.model

import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.FieldType
import org.springframework.data.mongodb.core.mapping.MongoId

@Document("messages")
data class Message(
    @MongoId(value = FieldType.OBJECT_ID)
    val id: String,
    val datetime: String,
    val text: String,
    val messageChatId: Int,
    val messageUserId: Int
)
