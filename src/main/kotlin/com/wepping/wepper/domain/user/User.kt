package com.wepping.wepper.domain.user

import com.wepping.wepper.common.entity.BaseEntity
import com.wepping.wepper.`interface`.user.dto.UserDto
import jakarta.persistence.*

@Entity
@Table(name = "USER_MAS_TB")
class User(
    @Column(nullable = false)
    var password: String,

    @Column(nullable = false)
    var userName: String,

    var nickName: String? = null,

    var email: String? = null,
) : BaseEntity<UserDto>() {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    lateinit var id: String

    override fun toDto(): UserDto {
        return UserDto(
            this.id!!,
            this.password,
            this.userName,
            this.getActualNickName(),
            this.email,
            this.createdAt,
            this.updatedAt
        )
    }

    fun getActualNickName(): String {
        return this.nickName ?: this.userName
    }
}