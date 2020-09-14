package biz.markov.experimental.view

import biz.markov.experimental.model.User
import java.util.*

/**
 * UserDto.
 *
 * @author Vasily_Markov
 */
data class UserDto(
    var id: UUID? = null,
    var name: String? = null
)

fun UserDto.toEntity() = User(id, name)
