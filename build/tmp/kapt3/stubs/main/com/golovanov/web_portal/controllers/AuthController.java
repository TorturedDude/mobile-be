package com.golovanov.web_portal.controllers;

/**
 * Контроллер для аунтентификации
 */
@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/auth"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0097@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0097@\u00a2\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0097@\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/golovanov/web_portal/controllers/AuthController;", "", "authService", "Lcom/golovanov/web_portal/services/auth/AuthService;", "(Lcom/golovanov/web_portal/services/auth/AuthService;)V", "me", "Lreactor/core/publisher/Mono;", "Lcom/golovanov/web_portal/domain/dtos/user/UserDto;", "userDetails", "Lorg/springframework/security/core/userdetails/UserDetails;", "(Lorg/springframework/security/core/userdetails/UserDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signIn", "Lcom/golovanov/web_portal/domain/dtos/auth/JwtAuthResponse;", "signInRequest", "Lcom/golovanov/web_portal/domain/dtos/auth/SignInRequest;", "(Lcom/golovanov/web_portal/domain/dtos/auth/SignInRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "signUpRequest", "Lcom/golovanov/web_portal/domain/dtos/auth/SignUpRequest;", "(Lcom/golovanov/web_portal/domain/dtos/auth/SignUpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "web-portal"})
public class AuthController {
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.services.auth.AuthService authService = null;
    
    public AuthController(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.services.auth.AuthService authService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/sign-up"})
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signUp(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.auth.SignUpRequest signUpRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super reactor.core.publisher.Mono<com.golovanov.web_portal.domain.dtos.auth.JwtAuthResponse>> $completion) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/sign-in"})
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signIn(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.auth.SignInRequest signInRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super reactor.core.publisher.Mono<com.golovanov.web_portal.domain.dtos.auth.JwtAuthResponse>> $completion) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/me"})
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object me(@org.springframework.security.core.annotation.AuthenticationPrincipal()
    @org.jetbrains.annotations.NotNull()
    org.springframework.security.core.userdetails.UserDetails userDetails, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super reactor.core.publisher.Mono<com.golovanov.web_portal.domain.dtos.user.UserDto>> $completion) {
        return null;
    }
}