package com.wepping.wepper.user.controller

import com.wepping.wepper.user.dto.UserGroupDto
import mu.KotlinLogging
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/user")
class UserGroupController {
    val log = KotlinLogging.logger{}

    // TODO : method 이름 정하기
    @GetMapping("/get")
    fun getUser():String{
        log.info { "get done..." }
        return "get done"
    }

    @PostMapping("/post")
    fun postUser(@RequestBody user: UserGroupDto):String{


        log.info { "post done..." }
        return "post done"
    }

    @DeleteMapping("/delete")
    fun deleteUSer(@RequestBody user: UserGroupDto):String{
        log.info { "delete done..." }
        return "delete done"
    }
}