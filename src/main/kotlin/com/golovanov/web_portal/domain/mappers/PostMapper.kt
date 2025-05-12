package com.golovanov.web_portal.domain.mappers

import com.golovanov.web_portal.domain.dtos.post.PostCreateDto
import com.golovanov.web_portal.domain.dtos.post.PostDto
import com.golovanov.web_portal.domain.entities.Post
import org.mapstruct.Mapper

@Mapper
interface PostMapper {

    /**
     * [Post] -> [PostDto]
     */
    fun toDto(entity: Post): PostDto

    /**
     * [PostCreateDto] -> [Post]
     */
    fun toEntity(dto: PostCreateDto): Post

    /**
     * [id], [PostCreateDto] -> [Post]
     */
    fun toEntity(id: Long, dto: PostCreateDto): Post

}