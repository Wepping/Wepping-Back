package com.wepping.wepper

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.ZonedDateTime


@MappedSuperclass
open class BaseEntity {

    @field:CreationTimestamp
    @Column(nullable = false)
    lateinit var createdAt: ZonedDateTime

    @field:UpdateTimestamp
    @Column(nullable = false)
    lateinit var updatedAt: ZonedDateTime
}

open class BaseDto(
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime
)