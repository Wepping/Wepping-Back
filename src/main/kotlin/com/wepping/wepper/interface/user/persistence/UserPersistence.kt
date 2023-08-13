package com.wepping.wepper.`interface`.user.persistence

import com.wepping.wepper.domain.user.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>


open abstract class UserPersistence(
) {
    @Autowired
    lateinit var userRepository: UserRepository

    abstract fun getAll() : List<User>

    abstract fun getById(id: Long) : User
}