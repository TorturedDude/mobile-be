package com.golovanov.web_portal.controllers

import com.golovanov.web_portal.domain.dtos.course.CourseCreateDto
import com.golovanov.web_portal.domain.dtos.course.CourseDto
import com.golovanov.web_portal.domain.dtos.course.CourseEditDto
import com.golovanov.web_portal.services.CourseService
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping("api/course")
class CourseController(
    private val courseService: CourseService,
) {
    @GetMapping
    fun getAll(): Mono<List<CourseDto>> = courseService.getAll()

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): Mono<CourseDto> = courseService.get(id)

    @GetMapping("/me")
    fun getAllForUser(@AuthenticationPrincipal userDetails: UserDetails): Mono<List<CourseDto>> = courseService.getAllByUsername(userDetails)

    @PostMapping
    fun create(@RequestBody courseDto: CourseCreateDto): Mono<Long> = courseService.create(courseDto)

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody courseDto: CourseEditDto): Mono<CourseDto> = courseService.update(id, courseDto)

}