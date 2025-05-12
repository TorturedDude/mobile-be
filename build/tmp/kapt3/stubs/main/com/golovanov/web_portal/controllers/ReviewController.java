package com.golovanov.web_portal.controllers;

@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"api/reviews"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00062\b\b\u0001\u0010\r\u001a\u00020\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/golovanov/web_portal/controllers/ReviewController;", "", "service", "Lcom/golovanov/web_portal/services/ReviewService;", "(Lcom/golovanov/web_portal/services/ReviewService;)V", "create", "Lreactor/core/publisher/Mono;", "", "review", "Lcom/golovanov/web_portal/domain/dtos/review/ReviewCreateDto;", "get", "", "Lcom/golovanov/web_portal/domain/dtos/review/ReviewDto;", "postId", "web-portal"})
public class ReviewController {
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.services.ReviewService service = null;
    
    public ReviewController(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.services.ReviewService service) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping()
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.lang.Long> create(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.review.ReviewCreateDto review) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{postId}"})
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.util.List<com.golovanov.web_portal.domain.dtos.review.ReviewDto>> get(@org.springframework.web.bind.annotation.PathVariable()
    long postId) {
        return null;
    }
}