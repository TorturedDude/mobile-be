package com.golovanov.web_portal.domain.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("reviews")
data class Review(
    @Id
    val id: Long? = null,
    val decription: String,
    val rating: Int,
    val postId: Long,
)
