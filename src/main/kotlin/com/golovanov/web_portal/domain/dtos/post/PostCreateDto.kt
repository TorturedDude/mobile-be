package com.golovanov.web_portal.domain.dtos.post

import java.time.LocalDate

data class PostCreateDto(
    val title: String,
    val description: String,
    val publishDate: LocalDate,
)
