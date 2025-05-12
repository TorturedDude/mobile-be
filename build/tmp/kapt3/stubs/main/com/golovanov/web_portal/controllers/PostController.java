package com.golovanov.web_portal.controllers;

@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"api/posts"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\f\u001a\u00020\u0007H\u0017J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\u0006H\u0017J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/golovanov/web_portal/controllers/PostController;", "", "postService", "Lcom/golovanov/web_portal/services/PostService;", "(Lcom/golovanov/web_portal/services/PostService;)V", "create", "Lreactor/core/publisher/Mono;", "", "post", "Lcom/golovanov/web_portal/domain/dtos/post/PostCreateDto;", "get", "Lcom/golovanov/web_portal/domain/dtos/post/PostDto;", "id", "getAll", "", "update", "dto", "web-portal"})
public class PostController {
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.services.PostService postService = null;
    
    public PostController(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.services.PostService postService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.GetMapping()
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.util.List<com.golovanov.web_portal.domain.dtos.post.PostDto>> getAll() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{id}"})
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<com.golovanov.web_portal.domain.dtos.post.PostDto> get(@org.springframework.web.bind.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping()
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.lang.Long> create(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.post.PostCreateDto post) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PutMapping(value = {"/{id}"})
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<com.golovanov.web_portal.domain.dtos.post.PostDto> update(@org.springframework.web.bind.annotation.PathVariable()
    long id, @org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.post.PostCreateDto dto) {
        return null;
    }
}