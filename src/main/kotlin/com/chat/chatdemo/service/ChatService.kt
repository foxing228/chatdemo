package com.chat.chatdemo.service

import com.chat.chatdemo.model.Chat

interface ChatService {

//    fun createChat(userList: List<UserDto>): ChatDto

//    fun deleteChat(chatId: Int)
//
//    fun addUserToTheChat(chatDto: ChatDto, userDto: UserDto)

    fun findAll(): List<Chat>

}