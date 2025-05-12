package com.golovanov.web_portal.domain.repositories.review

import com.golovanov.web_portal.domain.dtos.review.ReviewDto
import com.golovanov.web_portal.domain.entities.Review

interface ReviewFindRepository {
    suspend fun findAllByPostId(postId: Long): List<Review>
}