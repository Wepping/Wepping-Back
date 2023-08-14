package com.wepping.wepper.domain.user

import com.wepping.wepper.`interface`.user.persistence.UserPersistence
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>


@Component
class UserPersistenceImpl(
    private val userRepository: UserRepository,
) : UserPersistence() {

    override fun getAll(): List<User> {
        return this.userRepository.findAll().toList()
    }

    override fun getById(id: Long): User {
        return this.userRepository.findByIdOrNull(id) ?: throw error("")
    }
}