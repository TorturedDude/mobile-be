package com.golovanov.web_portal.domain.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@Table(name = "courses")
data class Course(
    @Id
    val id: Long? = null,
    val title: String,
    val description: String,
    val duration: Int,
    val price: Double,
    val startDate: LocalDate,
)
