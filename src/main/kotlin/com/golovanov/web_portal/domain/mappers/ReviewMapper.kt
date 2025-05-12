package com.golovanov.web_portal.domain.mappers

import com.golovanov.web_portal.domain.dtos.review.ReviewCreateDto
import com.golovanov.web_portal.domain.dtos.review.ReviewDto
import com.golovanov.web_portal.domain.entities.Review
import org.mapstruct.Mapper

@Mapper
interface ReviewMapper {
    fun toDto(review: Review): ReviewDto

    fun toEntity(dto: ReviewCreateDto): Review
}