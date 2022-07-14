package com.chat.chatdemo.repository

import com.chat.chatdemo.model.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<User, String> {

    fun findByUserName(userName: String?): List<User>

    fun findByPhoneNumber(phoneNumber: String?): User?

    fun findByUserId(id: String): User?

}