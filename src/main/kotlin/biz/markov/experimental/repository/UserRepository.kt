package biz.markov.experimental.repository

import biz.markov.experimental.model.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

/**
 * UserRepository.
 *
 * @author Vasily_Markov
 */
interface UserRepository : JpaRepository<User, UUID>