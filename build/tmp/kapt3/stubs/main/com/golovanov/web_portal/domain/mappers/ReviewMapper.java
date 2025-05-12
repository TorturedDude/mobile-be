package com.golovanov.web_portal.domain.mappers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/golovanov/web_portal/domain/mappers/ReviewMapper;", "", "toDto", "Lcom/golovanov/web_portal/domain/dtos/review/ReviewDto;", "review", "Lcom/golovanov/web_portal/domain/entities/Review;", "toEntity", "dto", "Lcom/golovanov/web_portal/domain/dtos/review/ReviewCreateDto;", "web-portal"})
@org.mapstruct.Mapper()
public abstract interface ReviewMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.golovanov.web_portal.domain.dtos.review.ReviewDto toDto(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.entities.Review review);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.golovanov.web_portal.domain.entities.Review toEntity(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.review.ReviewCreateDto dto);
}