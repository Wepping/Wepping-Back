package com.wepping.wepper.`interface`.user.dto

import com.wepping.wepper.BaseDto
import com.wepping.wepper.BaseListDto
import com.wepping.wepper.domain.user.User
import java.time.ZonedDateTime

class UserDto(
    val id: String,

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

typealias UserListDto = BaseListDto<User, UserDto>
