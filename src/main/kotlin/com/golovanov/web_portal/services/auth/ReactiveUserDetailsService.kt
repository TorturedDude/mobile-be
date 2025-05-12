package com.golovanov.web_portal.services.auth

import com.golovanov.web_portal.domain.entities.User
import kotlinx.coroutines.reactor.mono
import org.springframework.security.core.userdetails.ReactiveUserDetailsService
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import com.golovanov.web_portal.domain.repositories.UserRepository
import com.golovanov.web_portal.exceptions.UserExistsException
import com.golovanov.web_portal.exceptions.UserNotFoundException
import com.golovanov.web_portal.utils.logger

@Service
class ReactiveUserDetailsService(
    private val userRepository: UserRepository
) : ReactiveUserDetailsService{

    private val log = logger()

    override fun findByUsername(username: String): Mono<UserDetails> = mono {
        userRepository.findByUsername(username)
            ?: throw UserNotFoundException("User not found with username: $username")
    }

    /**
     * Получение пользователя по [id]
     *
     * @param id пользователя
     * @return сущность User
     */
    fun get(id: Long): Mono<User> = mono {
        userRepository.findById(id)
            ?: throw UserNotFoundException("User not found with id: $id")
    }

    fun getByUsername(username: String): Mono<User> = mono {
        userRepository.findByUsername(username)
            ?: throw UserNotFoundException("User not found with username: $username")
    }

    /**
     * Создание пользователя
     *
     * @param user - сущность пользователь
     * @return id пользователя
     */
    fun create(user: User): Mono<Long> = mono {

        if (userRepository.existsByUsername(user.username) || userRepository.existsByEmail(user.email)) {
            log.error("User with username/email ${user.username}/${user.email} already exists")
            throw UserExistsException("User with username/email ${user.username}/${user.email} already exists")
        }

        userRepository.save(user).id
    }
}