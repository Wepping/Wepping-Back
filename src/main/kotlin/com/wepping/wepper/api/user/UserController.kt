package com.wepping.wepper.api.user

import com.wepping.wepper.`interface`.user.dto.UserDto
import com.wepping.wepper.`interface`.user.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userService: UserService,
) {

    @GetMapping("/v1/users")
    fun getUsers(): List<UserDto> {
        return this.userService.getAllUsers()
    }

    @GetMapping("/v1/users/:id")
    fun getUserById(id: Long): UserDto {
        return this.userService.getUserById(id)
    }
}