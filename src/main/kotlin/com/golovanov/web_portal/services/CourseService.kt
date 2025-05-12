package com.golovanov.web_portal.services

import com.golovanov.web_portal.domain.dtos.course.CourseCreateDto
import com.golovanov.web_portal.domain.dtos.course.CourseDto
import com.golovanov.web_portal.domain.dtos.course.CourseEditDto
import com.golovanov.web_portal.domain.entities.Course
import com.golovanov.web_portal.domain.mappers.CourseMapper
import com.golovanov.web_portal.domain.repositories.course.CourseRepository
import com.golovanov.web_portal.services.auth.ReactiveUserDetailsService
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.reactor.awaitSingle
import kotlinx.coroutines.reactor.mono
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class CourseService(
    private val courseRepository: CourseRepository,
    private val courseMapper: CourseMapper,
) {

    fun getAllByUsername(userDetails: UserDetails): Mono<List<CourseDto>> = mono {
        courseRepository.findAllByUsername(userDetails.username).toList().map { courseMapper.toDto(it) }
    }

    fun getAll(): Mono<List<CourseDto>> = mono {
        courseRepository.findAll().toList().map { courseMapper.toDto(it) }
    }

    /**
     * Создание курса
     *
     * @param dto модель курса
     * @return Сущность курса
     */
    fun create(dto: CourseCreateDto): Mono<Long> = mono {
        courseRepository.save(courseMapper.toEntity(dto)).id
    }

    /**
     * Изменение курса
     *
     * @param id курса
     * @param dto модель курса
     * @return обновленную модель курса
     */
    fun update(id: Long, dto: CourseEditDto): Mono<CourseDto> = mono {
        courseRepository.save(courseMapper.toEntity(id,dto))
            .let { courseMapper.toDto(it) }
    }

    /**
     * Получение курса по [id]
     *
     * @param id курса
     * @return модель курса
     */
    fun get(id: Long): Mono<CourseDto> = mono {
        val result = courseRepository.findById(id)
            ?: RuntimeException("Course with id: $id not found")
        courseMapper.toDto(result as Course)
    }
}