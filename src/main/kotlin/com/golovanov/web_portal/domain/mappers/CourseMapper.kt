package com.golovanov.web_portal.domain.mappers

import com.golovanov.web_portal.domain.dtos.course.CourseCreateDto
import com.golovanov.web_portal.domain.dtos.course.CourseDto
import com.golovanov.web_portal.domain.dtos.course.CourseEditDto
import com.golovanov.web_portal.domain.entities.Course
import org.mapstruct.Mapper

@Mapper
interface CourseMapper {

    /**
     * [CourseEditDto] -> [Course]
     */
    fun toEntity(id: Long, dto: CourseEditDto): Course

    /**
     * [Course] -> [CourseDto]
     */
    fun toDto(course: Course): CourseDto

    /**
     * [CourseCreateDto] -> [Course]
     */
    fun toEntity(dto: CourseCreateDto): Course

}