package com.wepping.wepper.domain.user

import com.wepping.wepper.`interface`.user.dto.UserDto
import com.wepping.wepper.common.entity.BaseEntity
import com.wepping.wepper.domain.plan.Plan
import jakarta.persistence.*

@Entity
@Table(name = "USER_MAS_TB")
class User(

    @Column(nullable = false, unique = true)
    var userId: String,

    @Column(nullable = false)
    var password: String,

    @Column(nullable = false)
    var userName: String,

    var nickName: String? = null,

    var email: String? = null,

    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "user")
    var plans: List<Plan> = emptyList(),
) : BaseEntity<UserDto>() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    override fun toDto(): UserDto {
        return UserDto(
            this.id!!,
            this.userId,
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