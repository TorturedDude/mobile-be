package com.golovanov.web_portal.domain.mappers;

/**
 * Маппер для Пользователей
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/golovanov/web_portal/domain/mappers/UserMapper;", "", "toDto", "Lcom/golovanov/web_portal/domain/dtos/user/UserDto;", "user", "Lcom/golovanov/web_portal/domain/entities/User;", "toEntity", "dto", "Lcom/golovanov/web_portal/domain/dtos/user/UserCreateDto;", "id", "", "Lcom/golovanov/web_portal/domain/dtos/user/UserEditDto;", "web-portal"})
@org.mapstruct.Mapper()
public abstract interface UserMapper {
    
    /**
     * [UserCreateDto] -> [User]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.golovanov.web_portal.domain.entities.User toEntity(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.user.UserCreateDto dto);
    
    /**
     * [User] -> [UserDto]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.golovanov.web_portal.domain.dtos.user.UserDto toDto(@org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.entities.User user);
    
    /**
     * [UserEditDto] -> [User]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.golovanov.web_portal.domain.entities.User toEntity(long id, @org.jetbrains.annotations.NotNull()
    com.golovanov.web_portal.domain.dtos.user.UserEditDto dto);
}