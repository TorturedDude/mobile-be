package com.golovanov.web_portal.services.auth;

/**
 * JWT сервис
 */
@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0012J/\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0012\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0003H\u0012J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016J$\u0010\u0012\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0012J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0012J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u0003H\u0012J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/golovanov/web_portal/services/auth/JwtService;", "", "jwtSingInKey", "", "(Ljava/lang/String;)V", "log", "Lorg/slf4j/Logger;", "extractAllClaims", "Lio/jsonwebtoken/Claims;", "token", "extractClaim", "T", "claimsResolvers", "Lkotlin/Function1;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "extractExpiration", "Ljava/util/Date;", "extractUserName", "generateToken", "extraClaims", "", "userDetails", "Lorg/springframework/security/core/userdetails/UserDetails;", "Lreactor/core/publisher/Mono;", "getSigningKey", "Ljavax/crypto/SecretKey;", "isTokenExpired", "", "isTokenValid", "web-portal"})
public class JwtService {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String jwtSingInKey = null;
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger log = null;
    
    public JwtService(@org.springframework.beans.factory.annotation.Value(value = "${token.signing-key}")
    @org.jetbrains.annotations.NotNull()
    java.lang.String jwtSingInKey) {
        super();
    }
    
    /**
     * Извлечение имени пользователя из токена
     *
     * @param token токен
     * @return имя пользователя
     */
    @org.jetbrains.annotations.NotNull()
    public java.lang.String extractUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    /**
     * Генерация токена
     *
     * @param userDetails данные пользователя
     * @return токен
     */
    @org.jetbrains.annotations.NotNull()
    public reactor.core.publisher.Mono<java.lang.String> generateToken(@org.jetbrains.annotations.NotNull()
    org.springframework.security.core.userdetails.UserDetails userDetails) {
        return null;
    }
    
    /**
     * Проверка токена на валидность
     *
     * @param token       токен
     * @param userDetails данные пользователя
     * @return true, если токен валиден
     */
    public boolean isTokenValid(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    org.springframework.security.core.userdetails.UserDetails userDetails) {
        return false;
    }
    
    /**
     * Извлечение данных из токена
     *
     * @param token           токен
     * @param claimsResolvers функция извлечения данных
     * @return данные
     */
    private <T extends java.lang.Object>T extractClaim(java.lang.String token, kotlin.jvm.functions.Function1<? super io.jsonwebtoken.Claims, ? extends T> claimsResolvers) {
        return null;
    }
    
    /**
     * Генерация токена
     *
     * @param extraClaims дополнительные данные
     * @param userDetails данные пользователя
     * @return токен
     */
    private java.lang.String generateToken(java.util.Map<java.lang.String, ? extends java.lang.Object> extraClaims, org.springframework.security.core.userdetails.UserDetails userDetails) {
        return null;
    }
    
    /**
     * Проверка токена на просроченность
     *
     * @param token токен
     * @return true, если токен просрочен
     */
    private boolean isTokenExpired(java.lang.String token) {
        return false;
    }
    
    /**
     * Извлечение даты истечения токена
     *
     * @param token токен
     * @return дата истечения
     */
    private java.util.Date extractExpiration(java.lang.String token) {
        return null;
    }
    
    /**
     * Извлечение всех данных из токена
     *
     * @param token токен
     * @return данные
     */
    private io.jsonwebtoken.Claims extractAllClaims(java.lang.String token) {
        return null;
    }
    
    /**
     * Получение ключа для подписи токена
     *
     * @return ключ
     */
    private javax.crypto.SecretKey getSigningKey() {
        return null;
    }
}