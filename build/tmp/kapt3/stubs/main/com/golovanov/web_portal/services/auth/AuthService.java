package com.golovanov.web_portal.services.auth;

/**
 * Сервис для аутентификации
 */
@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0002\u0010\u0019J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u0017\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/golovanov/web_portal/services/auth/AuthService;", "", "jwtService", "Lcom/golovanov/web_portal/services/auth/JwtService;", "userDetailsService", "Lcom/golovanov/web_portal/services/auth/ReactiveUserDetailsService;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "authenticationManager", "Lorg/springframework/security/authentication/ReactiveAuthenticationManager;", "userMapper", "Lcom/golovanov/web_portal/domain/mappers/UserMapper;", "(Lcom/golovanov/web_portal/services/auth/JwtService;Lcom/golovanov/web_portal/services/auth/ReactiveUserDetailsService;Lorg/springframework/security/crypto/password/PasswordEncoder;Lorg/springframework/security/authentication/ReactiveAuthenticationManager;Lcom/golovanov/web_portal/domain/mappers/UserMapper;)V", "log", "Lorg/slf4j/Logger;", "getCurrentUser", "Lreactor/core/publisher/Mono;", "Lcom/golovanov/web_portal/domain/dtos/user/UserDto;", "userDetails", "Lorg/springframework/security/core/userdetails/UserDetails;", "(Lorg/springframework/security/core/userdetails/UserDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signIn", "Lcom/golovanov/web_portal/domain/dtos/auth/JwtAuthResponse;", "request", "Lcom/golovanov/web_portal/domain/dtos/auth/SignInRequest;", "(Lcom/golovanov/web_portal/domain/dtos/auth/SignInRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lcom/golovanov/web_portal/domain/dtos/auth/SignUpRequest;", "(Lcom/golovanov/web_portal/domain/dtos/auth/SignUpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "web-portal"})
public class AuthService {
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.services.auth.JwtService jwtService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.services.auth.ReactiveUserDetailsService userDetailsService = null;
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.security.crypto.password.PasswordEncoder passwordEncoder = null;
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.security.authentication.ReactiveAuthenticationManager authenticationManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.domain.mappers.UserMapper userMapper = null;
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    
    public AuthService(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.services.auth.JwtService jwtService, @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.services.auth.ReactiveUserDetailsService userDetailsService, @org.springframework.beans.factory.annotation.Autowired()
    @org.jetbrains.annotations.NotNull()
    org.springframework.security.crypto.password.PasswordEncoder passwordEncoder, @org.jetbrains.annotations.NotNull()
    org.springframework.security.authentication.ReactiveAuthenticationManager authenticationManager, @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.mappers.UserMapper userMapper) {
        super();
    }
    
    /**
     * Регистрация пользователя
     *
     * @param request данные пользователя
     * @return токен
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.auth.SignUpRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super reactor.core.publisher.Mono<com.golovanov.web_portal.domain.dtos.auth.JwtAuthResponse>> $completion) {
        return null;
    }
    
    /**
     * Аутентификация пользователя
     *
     * @param request данные пользователя
     * @return токен
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.auth.SignInRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super reactor.core.publisher.Mono<com.golovanov.web_portal.domain.dtos.auth.JwtAuthResponse>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCurrentUser(@org.jetbrains.annotations.NotNull()
    org.springframework.security.core.userdetails.UserDetails userDetails, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super reactor.core.publisher.Mono<com.golovanov.web_portal.domain.dtos.user.UserDto>> $completion) {
        return null;
    }
}