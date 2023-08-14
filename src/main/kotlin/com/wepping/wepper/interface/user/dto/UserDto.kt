package com.wepping.wepper.`interface`.user.dto

import com.wepping.wepper.BaseDto
import java.time.ZonedDateTime

class UserDto(
    val id: Long,

    val password: String,

    val userName: String,

    val nickName: String,

    val email: String?,

    val createAt: ZonedDateTime,

    val updateAt: ZonedDateTime,
) : BaseDto(
    createAt,
    updateAt
)