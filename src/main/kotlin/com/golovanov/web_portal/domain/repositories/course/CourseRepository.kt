package com.golovanov.web_portal.domain.repositories.course

import com.golovanov.web_portal.domain.entities.Course
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface CourseRepository : CoroutineCrudRepository<Course, Long>, CourseFindRepository