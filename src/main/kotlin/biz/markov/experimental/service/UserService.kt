package biz.markov.experimental.service

import biz.markov.experimental.mapper.UserMapper
import biz.markov.experimental.model.User
import biz.markov.experimental.repository.UserRepository
import biz.markov.experimental.view.UserDto
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * UserService.
 *
 * @author Vasily_Markov
 */
@Service
@Transactional
class UserService(private val userRepository: UserRepository) {

    private val mapper = Mappers.getMapper(UserMapper::class.java)

    fun get(userDto: UserDto): UserDto = mapper.toDto(
        userRepository.getOne(userDto.id!!)
    )

    fun create(userDto: UserDto): UserDto = mapper.toDto(
        userRepository.save(mapper.toEntity(userDto))
    )

    fun update(userDto: UserDto): UserDto = mapper.toDto(
        userRepository.save(mapper.toEntity(userDto))
    )

    fun delete(userDto: UserDto) {
        userRepository.delete(mapper.toEntity(userDto))
    }

    fun generate(count: Long, name: String): List<UserDto> = ArrayList<User>().let {
        for (n in 0..count) {
            it.add(User(name = "${name}_$n"))
        }
        mapper.toDtoList(userRepository.saveAll(it))
    }
}