package com.wepping.wepper.domain.user

import com.wepping.wepper.`interface`.user.persistence.UserPersistence
import com.wepping.wepper.`interface`.user.persistence.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class UserPersistenceImpl(
) :  UserPersistence() {

    override fun getAll(): List<User> {
        return this.userRepository.findAll().toList()
    }

    override fun getById(id: Long): User {
        return this.userRepository.findByIdOrNull(id) ?: throw error("")
    }
}