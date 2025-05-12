package com.golovanov.web_portal.domain.dtos.user

/**
 * Модель для изменения пользователя
 */
data class UserEditDto(
    val email: String,
    val password: String,
)
