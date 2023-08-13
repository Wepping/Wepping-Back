package com.wepping.wepper.domain.user
import com.wepping.wepper.BaseEntity
import com.wepping.wepper.`interface`.user.dto.UserDto
import jakarta.persistence.*

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val password: String,

    @Column(nullable = false)
    val userName: String,

    val nickName: String? = null,

    val email: String? = null
) : BaseEntity() {

    fun toDto() : UserDto {
        return UserDto(
            this.id!!,
            this.password,
            this.userName,
            this.getNicName(),
            this.email
        )
    }

    private fun getNicName() : String{
        return this.nickName ?: this.userName
    }
}