package com.golovanov.web_portal.domain.dtos.auth

data class SignInRequest(
    val username: String,
    val password: String
)