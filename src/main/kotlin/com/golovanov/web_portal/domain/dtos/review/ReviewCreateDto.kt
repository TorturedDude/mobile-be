package com.golovanov.web_portal.domain.dtos.review

data class ReviewCreateDto(
    val decription: String,
    val rating: Int,
    val postId: Long,
)
