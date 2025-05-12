package com.golovanov.web_portal.domain.dtos.review

data class ReviewDto(
    val id: Long,
    val decription: String,
    val rating: Int,
    val postId: Long,
)
