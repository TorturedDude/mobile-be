package com.golovanov.web_portal.domain.repositories

import com.golovanov.web_portal.domain.entities.Post
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface PostRepository : CoroutineCrudRepository<Post, Long>