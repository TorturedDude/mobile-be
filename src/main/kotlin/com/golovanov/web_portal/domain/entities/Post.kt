package com.golovanov.web_portal.domain.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@Table("posts")
data class Post(
    @Id
    val id: Long? = null,
    val title: String,
    val description: String,
    val publishDate: LocalDate,
)
