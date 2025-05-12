package com.golovanov.web_portal.domain.mappers;

import com.golovanov.web_portal.domain.dtos.review.ReviewCreateDto;
import com.golovanov.web_portal.domain.dtos.review.ReviewDto;
import com.golovanov.web_portal.domain.entities.Review;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-12T02:15:44-0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.9.25.jar, environment: Java 17.0.14 (Amazon.com Inc.)"
)
@Component
public class ReviewMapperImpl implements ReviewMapper {

    @Override
    public ReviewDto toDto(Review review) {
        if ( review == null ) {
            return null;
        }

        long id = 0L;
        String decription = null;
        int rating = 0;
        long postId = 0L;

        if ( review.getId() != null ) {
            id = review.getId();
        }
        decription = review.getDecription();
        rating = review.getRating();
        postId = review.getPostId();

        ReviewDto reviewDto = new ReviewDto( id, decription, rating, postId );

        return reviewDto;
    }

    @Override
    public Review toEntity(ReviewCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        String decription = null;
        int rating = 0;
        long postId = 0L;

        decription = dto.getDecription();
        rating = dto.getRating();
        postId = dto.getPostId();

        Long id = null;

        Review review = new Review( id, decription, rating, postId );

        return review;
    }
}
