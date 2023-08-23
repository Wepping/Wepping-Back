package com.wepping.wepper.`interface`.user.dto

import com.wepping.wepper.common.entity.BaseDto
import com.wepping.wepper.common.entity.BaseListDto
import java.time.ZonedDateTime

class UserDto(
    val id: Long,

    val userId: String,

    val password: String,

    val userName: String,

    val nickName: String,

    val email: String?,

    createAt: ZonedDateTime,

    updateAt: ZonedDateTime,
) : BaseDto(
    createAt,
    updateAt
)

class CreateUserDto(
    val userId: String,
    val password: String,
    val userName: String,
    val nickName: String?,
    val email: String?,
)

typealias UserListDto = BaseListDto<UserDto>
