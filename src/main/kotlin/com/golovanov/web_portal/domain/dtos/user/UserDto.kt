package com.golovanov.web_portal.domain.dtos.user

import com.golovanov.web_portal.enums.Role

/**
 * Модель получения пользователя
 */
data class UserDto(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val username: String,
    val email: String,
    val role: Role,
)
