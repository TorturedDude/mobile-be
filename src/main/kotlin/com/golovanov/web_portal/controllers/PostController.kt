package com.golovanov.web_portal.controllers

import com.golovanov.web_portal.domain.dtos.post.PostCreateDto
import com.golovanov.web_portal.domain.dtos.post.PostDto
import com.golovanov.web_portal.services.PostService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping("api/posts")
class PostController(
    private val postService: PostService,
) {

    @GetMapping
    fun getAll(): Mono<List<PostDto>> = postService.getAll()

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): Mono<PostDto> = postService.get(id)

    @PostMapping
    fun create(@RequestBody post: PostCreateDto): Mono<Long> = postService.create(post)

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody dto: PostCreateDto): Mono<PostDto> = postService.update(id, dto)

}