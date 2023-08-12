package com.wepping.wepper.user.controller

import com.wepping.wepper.user.dto.UserDto
import jakarta.validation.Valid
import mu.KotlinLogging
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/user")
class UserController {
    val log = KotlinLogging.logger{}

    // TODO : method 이름 정하기
    @GetMapping("/get")
    fun getUser():String{
        log.info { "get done..." }
        return "get done"
    }

    @PostMapping("/post")
    fun postUser(@Valid @RequestBody user: UserDto):String{
        log.info { "post done..." }
        return "post done"
    }

    @DeleteMapping("/delete")
    fun deleteUSer(@Valid @RequestBody user: UserDto):String{
        log.info { "delete done..." }
        return "delete done"
    }
}