package com.wepping.wepper.domain.user

import com.wepping.wepper.`interface`.user.dto.CreateUserDto
import com.wepping.wepper.`interface`.user.persistence.UserPersistence
import com.wepping.wepper.common.exception.NotFoundException
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, String>


@Component
class UserPersistenceImpl(
    private val userRepository: UserRepository,
) : UserPersistence() {

    override fun getAll(): List<User> {
        return this.userRepository.findAll().toList()
    }

    override fun getById(id: String): User {
        return this.userRepository.findByIdOrNull(id) ?: throw NotFoundException("user id $id not exist.")
    }

    override fun createUser(dto: CreateUserDto): User {
        val user = User(
            null,
            dto.password,
            dto.userName,
            dto.nickName,
            dto.email
        )
        return this.userRepository.save(user)
    }

}