package com.golovanov.web_portal.domain.repositories.course

import com.golovanov.web_portal.domain.entities.Course

interface CourseFindRepository {
    suspend fun findAllByUsername(username: String): List<Course>
}