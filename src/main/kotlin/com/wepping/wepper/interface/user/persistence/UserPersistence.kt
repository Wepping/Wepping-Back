package com.wepping.wepper.`interface`.user.persistence

import com.wepping.wepper.`interface`.user.dto.CreateUserDto
import com.wepping.wepper.domain.user.User

abstract class UserPersistence {
    abstract fun getAll(): List<User>

    abstract fun getById(id: String): User

    abstract fun createUser(dto: CreateUserDto): User
}