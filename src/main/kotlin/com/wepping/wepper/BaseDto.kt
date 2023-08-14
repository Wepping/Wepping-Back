package com.wepping.wepper

import java.time.ZonedDateTime

open class BaseDto(
    val createdAt: ZonedDateTime,
    val updatedAt: ZonedDateTime,
)

open class BaseListDto<Entity : BaseEntity<EntityDto>, EntityDto> constructor (
    private val list: List<Entity>,
) {
    var data: List<EntityDto> = this.list.map { entity -> entity.toDto() }
    var length: Int = this.list.size
}