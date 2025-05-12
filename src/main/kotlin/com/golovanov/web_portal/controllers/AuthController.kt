package com.golovanov.web_portal.controllers

import reactor.core.publisher.Mono
import com.golovanov.web_portal.domain.dtos.auth.JwtAuthResponse
import com.golovanov.web_portal.domain.dtos.auth.SignInRequest
import com.golovanov.web_portal.domain.dtos.auth.SignUpRequest
import com.golovanov.web_portal.domain.dtos.user.UserDto
import com.golovanov.web_portal.services.auth.AuthService
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.web.bind.annotation.*

/**
 * Контроллер для аунтентификации
 */
@RestController
@RequestMapping("/auth")
class AuthController(
    private val authService: AuthService
) {
    @PostMapping("/sign-up")
    suspend fun signUp(@RequestBody signUpRequest: SignUpRequest): Mono<JwtAuthResponse> =
        authService.signUp(signUpRequest)

    @PostMapping("/sign-in")
    suspend fun signIn(@RequestBody signInRequest: SignInRequest): Mono<JwtAuthResponse> =
        authService.signIn(signInRequest)

    @GetMapping("/me")
    suspend fun me(@AuthenticationPrincipal userDetails: UserDetails): Mono<UserDto> =
        authService.getCurrentUser(userDetails)
}