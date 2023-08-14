package com.wepping.wepper.`interface`.user.persistence

import com.wepping.wepper.domain.user.User

open abstract class UserPersistence(
) {
    abstract fun getAll(): List<User>

    abstract fun getById(id: Long): User
}