package com.golovanov.web_portal.configuration;

@org.springframework.context.annotation.Configuration()
@org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0017J\b\u0010\t\u001a\u00020\nH\u0017J\b\u0010\u000b\u001a\u00020\fH\u0017J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/golovanov/web_portal/configuration/SecurityConfig;", "", "userDetailsService", "Lcom/golovanov/web_portal/services/auth/ReactiveUserDetailsService;", "jwtAuthenticationFilter", "Lcom/golovanov/web_portal/configuration/filters/JwtAuthenticationFilter;", "(Lcom/golovanov/web_portal/services/auth/ReactiveUserDetailsService;Lcom/golovanov/web_portal/configuration/filters/JwtAuthenticationFilter;)V", "authenticationManager", "Lorg/springframework/security/authentication/ReactiveAuthenticationManager;", "corsConfigurationSource", "Lorg/springframework/web/cors/reactive/CorsConfigurationSource;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "securityWebFilterChain", "Lorg/springframework/security/web/server/SecurityWebFilterChain;", "http", "Lorg/springframework/security/config/web/server/ServerHttpSecurity;", "web-portal"})
public class SecurityConfig {
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.services.auth.ReactiveUserDetailsService userDetailsService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.golovanov.web_portal.configuration.filters.JwtAuthenticationFilter jwtAuthenticationFilter = null;
    
    public SecurityConfig(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.services.auth.ReactiveUserDetailsService userDetailsService, @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.configuration.filters.JwtAuthenticationFilter jwtAuthenticationFilter) {
        super();
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.web.server.SecurityWebFilterChain securityWebFilterChain(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.web.server.ServerHttpSecurity http) {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.web.cors.reactive.CorsConfigurationSource corsConfigurationSource() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.authentication.ReactiveAuthenticationManager authenticationManager() {
        return null;
    }
}