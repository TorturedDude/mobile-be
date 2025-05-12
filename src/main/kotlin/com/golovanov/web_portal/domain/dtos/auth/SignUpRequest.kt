package com.golovanov.web_portal.domain.dtos.auth

data class SignUpRequest(
    val firstName: String,
    val lastName: String,
    val username: String,
    val email: String,
    val password: String
)
