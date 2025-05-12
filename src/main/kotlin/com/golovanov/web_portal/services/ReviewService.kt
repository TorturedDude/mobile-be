package com.golovanov.web_portal.services

import com.golovanov.web_portal.domain.dtos.review.ReviewCreateDto
import com.golovanov.web_portal.domain.dtos.review.ReviewDto
import com.golovanov.web_portal.domain.mappers.ReviewMapper
import com.golovanov.web_portal.domain.repositories.review.ReviewRepository
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.reactor.mono
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class ReviewService(
    private val repository: ReviewRepository,
    private val reviewMapper: ReviewMapper,
) {
    fun getAllByPostId(postId: Long): Mono<List<ReviewDto>> = mono {
        repository.findAllByPostId(postId).toList().map { reviewMapper.toDto(it) }
    }

    fun getAll(): Mono<List<ReviewDto>> = mono {
        repository.findAll().toList().map { reviewMapper.toDto(it) }
    }

    fun create(review: ReviewCreateDto): Mono<Long> = mono {
        repository.save(reviewMapper.toEntity(review)).id
    }
}