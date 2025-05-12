package com.golovanov.web_portal.domain.dtos.user

/**
 * Модель создания пользователя
 */
data class UserCreateDto(
    val firstName: String,
    val lastName: String,
    val username: String,
    val email: String,
    val password: String,
)
