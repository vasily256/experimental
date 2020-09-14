package biz.markov.experimental.service

import biz.markov.experimental.model.User
import biz.markov.experimental.model.toDto
import biz.markov.experimental.repository.UserRepository
import biz.markov.experimental.view.UserDto
import biz.markov.experimental.view.toEntity
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

    fun get(userDto: UserDto): UserDto =
        userRepository.getOne(userDto.id!!).toDto()

    fun create(userDto: UserDto): UserDto =
        userRepository.save(userDto.toEntity()).toDto()

    fun update(userDto: UserDto): UserDto =
        userRepository.save(userDto.toEntity()).toDto()

    fun delete(userDto: UserDto) {
        userRepository.delete(userDto.toEntity())
    }
}