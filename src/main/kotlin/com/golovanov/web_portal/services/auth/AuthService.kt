package com.golovanov.web_portal.services.auth

import kotlinx.coroutines.reactor.awaitSingle
import kotlinx.coroutines.reactor.mono
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.authentication.ReactiveAuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import com.golovanov.web_portal.domain.dtos.auth.JwtAuthResponse
import com.golovanov.web_portal.domain.dtos.auth.SignInRequest
import com.golovanov.web_portal.domain.dtos.auth.SignUpRequest
import com.golovanov.web_portal.domain.dtos.user.UserDto
import com.golovanov.web_portal.domain.entities.User
import com.golovanov.web_portal.domain.mappers.UserMapper
import com.golovanov.web_portal.enums.Role
import com.golovanov.web_portal.utils.logger
import org.springframework.security.core.userdetails.UserDetails

/**
 * Сервис для аутентификации
 */
@Service
class AuthService(
    private val jwtService: JwtService,
    private val userDetailsService: ReactiveUserDetailsService,
    @Autowired private val passwordEncoder: PasswordEncoder,
    private val authenticationManager: ReactiveAuthenticationManager,
    private val userMapper: UserMapper
) {

    private val log = logger()

    /**
     * Регистрация пользователя
     *
     * @param request данные пользователя
     * @return токен
     */
    suspend fun signUp(request: SignUpRequest): Mono<JwtAuthResponse> = mono {
        val user = User(
            firstName=request.firstName,
            lastName = request.lastName,
            username = request.username,
            email = request.email,
            password = passwordEncoder.encode(request.password),
            role = Role.ROLE_USER
        )

        val userFromDb = userDetailsService.get(userDetailsService.create(user).awaitSingle()).awaitSingle()

        val jwt = jwtService.generateToken(userFromDb).awaitSingle()
        log.info("User was registered: ${user.username}")
        JwtAuthResponse(jwt)
    }

    /**
     * Аутентификация пользователя
     *
     * @param request данные пользователя
     * @return токен
     */
    suspend fun signIn(request: SignInRequest): Mono<JwtAuthResponse> = mono {
        authenticationManager.authenticate(
            UsernamePasswordAuthenticationToken(
                request.username,
                request.password
            )
        )

        val user = userDetailsService.findByUsername(request.username).awaitSingle()

        val jwt = jwtService.generateToken(user).awaitSingle()
        log.info("User: ${user.username} come in")
        JwtAuthResponse(jwt)
    }

    suspend fun getCurrentUser(userDetails: UserDetails): Mono<UserDto> = mono {
        userMapper.toDto(userDetailsService.getByUsername(userDetails.username).awaitSingle())
    }

}