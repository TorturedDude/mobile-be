package com.golovanov.web_portal.domain.mappers

import org.mapstruct.Mapper
import com.golovanov.web_portal.domain.dtos.user.UserCreateDto
import com.golovanov.web_portal.domain.dtos.user.UserEditDto
import com.golovanov.web_portal.domain.dtos.user.UserDto
import com.golovanov.web_portal.domain.entities.User

/**
 * Маппер для Пользователей
 */
@Mapper
interface UserMapper {

    /**
     * [UserCreateDto] -> [User]
     */
    fun toEntity(dto: UserCreateDto): User

    /**
     * [User] -> [UserDto]
     */
    fun toDto(user: User): UserDto

    /**
     * [UserEditDto] -> [User]
     */
    fun toEntity(id: Long, dto: UserEditDto): User

}