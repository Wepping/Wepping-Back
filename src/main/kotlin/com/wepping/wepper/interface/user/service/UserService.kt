package com.wepping.wepper.`interface`.user.service

import com.wepping.wepper.`interface`.user.dto.UserDto
import com.wepping.wepper.`interface`.user.persistence.UserPersistence
import org.springframework.beans.factory.annotation.Autowired

open abstract class UserService(
){
    @Autowired
    lateinit var userPersistence: UserPersistence

    abstract fun getAllUsers() : List<UserDto>

    abstract fun getUserById(id: Long): UserDto
}