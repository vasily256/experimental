package biz.markov.experimental.mapper

import biz.markov.experimental.model.User
import biz.markov.experimental.view.UserDto
import org.mapstruct.Mapper

/**
 * UserMapper.
 *
 * @author Vasily_Markov
 */
@Mapper
interface UserMapper {

    fun toDto(user: User): UserDto

    fun toDtoList(users: List<User>): List<UserDto>

    fun toEntity(userDto: UserDto): User
}