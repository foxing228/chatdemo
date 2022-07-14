package com.chat.chatdemo.service

import com.chat.chatdemo.model.User
import com.chat.chatdemo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {

    @Autowired(required=false)
    lateinit var userRepository: UserRepository

    override fun createUser(userDto: User) {
        userRepository.save(userDto)
    }

    override fun deleteUser(id: String) {
//        val user: User? = findByUserId(id)
//        userRepository.delete(user!!)
        TODO()

    }

    override fun updateUser(userDto: User) {
        val userToUpdate = userRepository.findById(userDto.id)
    }

//    override fun findUserByPhoneNumber(phoneNumber: String): UserDto {
//        return userRepository.findByPhoneNumber(phoneNumber)
//    }

    override fun findUserByUserName(userName: String): List<User> {
        TODO("Not yet implemented")
    }

    override fun findByUserId(id: String): User? {
        return userRepository.findById(id).orElseThrow { Exception() }
    }
}