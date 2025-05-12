package com.golovanov.web_portal.domain.entities

import org.springframework.data.relational.core.mapping.Table

@Table(name = "course_users")
data class UserCourse(
    val userId: Long,
    val courseId: Long,
)
