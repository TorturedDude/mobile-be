package com.golovanov.web_portal.domain.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate
import java.time.LocalTime

@Table("sessions")
data class Session(
    @Id
    val id: Long? = null,
    val comment: String,
    val dateSession: LocalDate,
    val timeSession: LocalTime,
    val userId: Long,
)
