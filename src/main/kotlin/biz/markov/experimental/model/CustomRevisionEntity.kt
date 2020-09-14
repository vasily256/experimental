package biz.markov.experimental.model

import org.hibernate.envers.RevisionEntity
import org.hibernate.envers.RevisionNumber
import org.hibernate.envers.RevisionTimestamp
import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

/**
 * CustomRevisionEntity.
 *
 * @author Vasily_Markov
 */
@Entity
@RevisionEntity
@Table(name = "revinfo")
class CustomRevisionEntity : Serializable {

    @Id
    @GeneratedValue
    @RevisionNumber
    var rev: Long = 0

    @RevisionTimestamp
    var timestamp: Long = 0
}