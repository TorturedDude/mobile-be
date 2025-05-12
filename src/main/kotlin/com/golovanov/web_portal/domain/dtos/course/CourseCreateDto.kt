package com.golovanov.web_portal.domain.dtos.course

import java.time.LocalDate

data class CourseCreateDto(
    val title: String,
    val description: String,
    val duration: Int,
    val price: Double,
    val startDate: LocalDate,
)