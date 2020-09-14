package biz.markov.experimental.model

import org.hibernate.annotations.GenericGenerator
import org.hibernate.envers.Audited
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

/**
 * User.
 *
 * @author Vasily_Markov
 */
@Audited
@Entity
@Table(name = "users")
data class User(

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    var id: UUID? = null,

    @Column
    var name: String? = null
)