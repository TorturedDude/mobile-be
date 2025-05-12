package com.golovanov.web_portal.services;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\bH\u0016J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/golovanov/web_portal/services/PostService;", "", "postRepository", "Lcom/golovanov/web_portal/domain/repositories/PostRepository;", "postMapper", "Lcom/golovanov/web_portal/domain/mappers/PostMapper;", "(Lcom/golovanov/web_portal/domain/repositories/PostRepository;Lcom/golovanov/web_portal/domain/mappers/PostMapper;)V", "create", "Lreactor/core/publisher/Mono;", "", "dto", "Lcom/golovanov/web_portal/domain/dtos/post/PostCreateDto;", "get", "Lcom/golovanov/web_portal/domain/dtos/post/PostDto;", "id", "getAll", "", "update", "web-portal"})
public class PostService {
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.domain.repositories.PostRepository postRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.domain.mappers.PostMapper postMapper = null;
    
    public PostService(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.repositories.PostRepository postRepository, @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.mappers.PostMapper postMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<com.golovanov.web_portal.domain.dtos.post.PostDto> get(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.util.List<com.golovanov.web_portal.domain.dtos.post.PostDto>> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.lang.Long> create(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.post.PostCreateDto dto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<com.golovanov.web_portal.domain.dtos.post.PostDto> update(long id, @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.post.PostCreateDto dto) {
        return null;
    }
}