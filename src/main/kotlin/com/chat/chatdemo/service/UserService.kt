package com.chat.chatdemo.service

import com.chat.chatdemo.model.User
import org.springframework.stereotype.Service

@Service
interface UserService {

    fun createUser(userDto: User)

    fun deleteUser(id: String)

    fun updateUser(userDto: User)
//
    //   fun findUserByPhoneNumber(phoneNumber: String): UserDto

    fun findUserByUserName(userName: String): List<User>

    fun findByUserId(id: String): User?

}