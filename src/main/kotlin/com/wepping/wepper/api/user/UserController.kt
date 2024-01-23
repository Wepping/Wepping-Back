package com.wepping.wepper.api.user

import com.wepping.wepper.`interface`.user.dto.CreateUserDto
import com.wepping.wepper.`interface`.user.dto.UpdateUserDto
import com.wepping.wepper.`interface`.user.dto.UserDto
import com.wepping.wepper.`interface`.user.dto.UserListDto
import com.wepping.wepper.`interface`.user.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/users")
class UserController(
    private val userService: UserService,
) {

    @GetMapping()
    fun getUsers(): UserListDto {
        return this.userService.getAllUsers()
    }

    @PostMapping()
    fun createUser(@RequestBody dto: CreateUserDto): UserDto {
        return this.userService.createUser(dto)
    }

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): UserDto {
        return this.userService.getUserById(id)
    }

    @PatchMapping("/{id}")
    fun updateUserData(@PathVariable id: Long, @RequestBody dto: UpdateUserDto): UserDto {
        return this.userService.updateUser(id, dto)
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Long) {
        this.userService.deleteUser(id)
    }
}