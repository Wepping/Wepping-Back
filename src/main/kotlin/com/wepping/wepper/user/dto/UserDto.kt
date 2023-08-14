package com.wepping.wepper.user.dto

import jakarta.validation.constraints.NotBlank
import lombok.Getter
import lombok.Setter
import org.springframework.format.annotation.DateTimeFormat

@Getter
@Setter
data class UserDto (
    /* Primary Key */
    @NotBlank
    private val userId: String,

    /* =============================================== */
    @NotBlank
    private val password: String,
    @NotBlank
    private val userName: String,
    private val nickName: String,
    private val email: String,
    @NotBlank
    private val createAt: DateTimeFormat,
    private val updateAt: DateTimeFormat
)