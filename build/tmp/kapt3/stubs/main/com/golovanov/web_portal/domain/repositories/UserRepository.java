package com.golovanov.web_portal.domain.repositories;

/**
 * Репозиторий для пользователей
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/golovanov/web_portal/domain/repositories/UserRepository;", "Lorg/springframework/data/repository/kotlin/CoroutineCrudRepository;", "Lcom/golovanov/web_portal/domain/entities/User;", "", "existsByEmail", "", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "existsByUsername", "username", "findByUsername", "web-portal"})
public abstract interface UserRepository extends org.springframework.data.repository.kotlin.CoroutineCrudRepository<com.golovanov.web_portal.domain.entities.User, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.golovanov.web_portal.domain.entities.User> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object existsByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object existsByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
}