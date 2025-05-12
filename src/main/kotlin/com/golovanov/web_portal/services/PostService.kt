package com.golovanov.web_portal.services

import com.golovanov.web_portal.domain.dtos.post.PostCreateDto
import com.golovanov.web_portal.domain.dtos.post.PostDto
import com.golovanov.web_portal.domain.entities.Post
import com.golovanov.web_portal.domain.mappers.PostMapper
import com.golovanov.web_portal.domain.repositories.PostRepository
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.reactor.mono
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class PostService(
    private val postRepository: PostRepository,
    private val postMapper: PostMapper,
) {

    fun get(id: Long): Mono<PostDto> = mono {
        val result = postRepository.findById(id)
            ?: RuntimeException("Post with id: $id not found")

        postMapper.toDto(result as Post)
    }

    fun getAll(): Mono<List<PostDto>> = mono {
        postRepository.findAll().toList().map { postMapper.toDto(it) }
    }

    fun create(dto: PostCreateDto): Mono<Long> = mono {
        postRepository.save(postMapper.toEntity(dto)).id
    }

    fun update(id: Long, dto: PostCreateDto): Mono<PostDto> = mono {
        postRepository.save(postMapper.toEntity(id, dto))
            .let { postMapper.toDto(it) }
    }

}