package com.wepping.wepper.domain.user

import com.wepping.wepper.`interface`.user.dto.UserDto
import com.wepping.wepper.`interface`.user.persistence.UserPersistence
import com.wepping.wepper.`interface`.user.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userPersistence: UserPersistence,
) : UserService(
) {

    override fun getAllUsers(): List<UserDto> {
        return this.userPersistence.getAll().map { user ->
            user.toDto()
        }
    }

    override fun getUserById(id: Long): UserDto {
        return this.userPersistence.getById(id).toDto()
    }
}