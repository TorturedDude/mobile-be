package com.golovanov.web_portal.domain.repositories.review

import com.golovanov.web_portal.domain.entities.Review
import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface ReviewRepository : CoroutineCrudRepository<Review, Long> {
    fun findAllByPostId(postId: Long): Flow<Review>
}