package biz.markov.experimental.controller

import biz.markov.experimental.service.UserService
import biz.markov.experimental.view.UserDto
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * UserController.
 *
 * @author Vasily_Markov
 */
@RestController
@RequestMapping("/user")
class UserController(private val userService: UserService) {

    @GetMapping
    fun get(@RequestBody userDto: UserDto) =
        userService.get(userDto)

    @PostMapping
    fun create(@RequestBody userDto: UserDto) =
        userService.create(userDto)

    @PutMapping
    fun update(@RequestBody userDto: UserDto) =
        userService.update(userDto)

    @DeleteMapping
    fun delete(@RequestBody userDto: UserDto) {
        userService.delete(userDto)
    }
}