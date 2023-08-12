package com.wepping.wepper.user.dto

import jakarta.validation.constraints.NotBlank
import lombok.Getter
import lombok.Setter
import org.springframework.format.annotation.DateTimeFormat

@Getter
@Setter
data class UserGroupDto(
    /* Primary Key */
    @NotBlank
    private val userGroupId: String,
    @NotBlank
    private val userId: String,

    /* =============================================== */
    @NotBlank
    private val userGroupName: String,
    @NotBlank
    private val createAt: DateTimeFormat,
    private val updateAt: DateTimeFormat
)
