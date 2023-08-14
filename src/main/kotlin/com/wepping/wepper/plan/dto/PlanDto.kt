package com.wepping.wepper.plan.dto

import jakarta.validation.constraints.NotBlank
import lombok.Getter
import lombok.Setter
import org.springframework.format.annotation.DateTimeFormat

@Getter
@Setter
data class PlanDto (
    /* Primary Key */
    @NotBlank
    private val planId: String,
    @NotBlank
    private val userId: String,

    /* =============================================== */
    @NotBlank
    private val planGroupId: String, // TODO : 필요할까? 유저그룹 ID와의 관계에 대하여 고민...
    @NotBlank
    private val planName: String,
    @NotBlank
    private val createAt: DateTimeFormat,
    private val updateAt: DateTimeFormat,
    private val startAt: DateTimeFormat,
    private val endAt: DateTimeFormat
)