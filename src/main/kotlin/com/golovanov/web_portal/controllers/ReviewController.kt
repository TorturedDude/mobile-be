package com.golovanov.web_portal.controllers

import com.golovanov.web_portal.domain.dtos.review.ReviewCreateDto
import com.golovanov.web_portal.domain.dtos.review.ReviewDto
import com.golovanov.web_portal.domain.entities.Review
import com.golovanov.web_portal.services.ReviewService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("api/reviews")
class ReviewController(
    private val service: ReviewService,
) {
    @PostMapping
    fun create(@RequestBody review: ReviewCreateDto): Mono<Long> = service.create(review)

    @GetMapping("/{postId}")
    fun get(@PathVariable postId: Long): Mono<List<ReviewDto>> = service.getAllByPostId(postId)
}