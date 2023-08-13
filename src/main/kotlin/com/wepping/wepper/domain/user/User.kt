package domain.user
import jakarta.persistence.*

@Entity
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null


}