package com.golovanov.web_portal.services.auth;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/golovanov/web_portal/services/auth/ReactiveUserDetailsService;", "Lorg/springframework/security/core/userdetails/ReactiveUserDetailsService;", "userRepository", "Lcom/golovanov/web_portal/domain/repositories/UserRepository;", "(Lcom/golovanov/web_portal/domain/repositories/UserRepository;)V", "log", "Lorg/slf4j/Logger;", "create", "Lreactor/core/publisher/Mono;", "", "user", "Lcom/golovanov/web_portal/domain/entities/User;", "findByUsername", "Lorg/springframework/security/core/userdetails/UserDetails;", "username", "", "get", "id", "getByUsername", "web-portal"})
public class ReactiveUserDetailsService implements org.springframework.security.core.userdetails.ReactiveUserDetailsService {
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.domain.repositories.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    
    public ReactiveUserDetailsService(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.repositories.UserRepository userRepository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<org.springframework.security.core.userdetails.UserDetails> findByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    /**
     * Получение пользователя по [id]
     *
     * @param id пользователя
     * @return сущность User
     */
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<com.golovanov.web_portal.domain.entities.User> get(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<com.golovanov.web_portal.domain.entities.User> getByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    /**
     * Создание пользователя
     *
     * @param user - сущность пользователь
     * @return id пользователя
     */
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.lang.Long> create(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.entities.User user) {
        return null;
    }
}