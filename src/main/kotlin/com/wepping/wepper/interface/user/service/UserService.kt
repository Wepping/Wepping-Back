package com.wepping.wepper.`interface`.user.service

import com.wepping.wepper.`interface`.user.dto.UserDto

open abstract class UserService(
){
    abstract fun getAllUsers() : List<UserDto>

    abstract fun getUserById(id: Long): UserDto
}