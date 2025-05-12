package com.golovanov.web_portal.services;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\bH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/golovanov/web_portal/services/ReviewService;", "", "repository", "Lcom/golovanov/web_portal/domain/repositories/review/ReviewRepository;", "reviewMapper", "Lcom/golovanov/web_portal/domain/mappers/ReviewMapper;", "(Lcom/golovanov/web_portal/domain/repositories/review/ReviewRepository;Lcom/golovanov/web_portal/domain/mappers/ReviewMapper;)V", "create", "Lreactor/core/publisher/Mono;", "", "review", "Lcom/golovanov/web_portal/domain/dtos/review/ReviewCreateDto;", "getAll", "", "Lcom/golovanov/web_portal/domain/dtos/review/ReviewDto;", "getAllByPostId", "postId", "web-portal"})
public class ReviewService {
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.domain.repositories.review.ReviewRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.domain.mappers.ReviewMapper reviewMapper = null;
    
    public ReviewService(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.repositories.review.ReviewRepository repository, @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.mappers.ReviewMapper reviewMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.util.List<com.golovanov.web_portal.domain.dtos.review.ReviewDto>> getAllByPostId(long postId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.util.List<com.golovanov.web_portal.domain.dtos.review.ReviewDto>> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.lang.Long> create(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.review.ReviewCreateDto review) {
        return null;
    }
}