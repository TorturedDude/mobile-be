package com.golovanov.web_portal.configuration.filters;

@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/golovanov/web_portal/configuration/filters/JwtAuthenticationFilter;", "Lorg/springframework/web/server/WebFilter;", "jwtService", "Lcom/golovanov/web_portal/services/auth/JwtService;", "userDetailsService", "Lcom/golovanov/web_portal/services/auth/ReactiveUserDetailsService;", "(Lcom/golovanov/web_portal/services/auth/JwtService;Lcom/golovanov/web_portal/services/auth/ReactiveUserDetailsService;)V", "filter", "Lreactor/core/publisher/Mono;", "Ljava/lang/Void;", "exchange", "Lorg/springframework/web/server/ServerWebExchange;", "chain", "Lorg/springframework/web/server/WebFilterChain;", "Companion", "web-portal"})
public class JwtAuthenticationFilter implements org.springframework.web.server.WebFilter {
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.services.auth.JwtService jwtService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.services.auth.ReactiveUserDetailsService userDetailsService = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BEARER_PREFIX = "Bearer ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_NAME = "Authorization";
    @org.jetbrains.annotations.NotNull()
    public static final com.golovanov.web_portal.configuration.filters.JwtAuthenticationFilter.Companion Companion = null;
    
    public JwtAuthenticationFilter(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.services.auth.JwtService jwtService, @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.services.auth.ReactiveUserDetailsService userDetailsService) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.lang.Void> filter(@org.jetbrains.annotations.NotNull()
    org.springframework.web.server.ServerWebExchange exchange, @org.jetbrains.annotations.NotNull()
    org.springframework.web.server.WebFilterChain chain) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/golovanov/web_portal/configuration/filters/JwtAuthenticationFilter$Companion;", "", "()V", "BEARER_PREFIX", "", "HEADER_NAME", "web-portal"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}