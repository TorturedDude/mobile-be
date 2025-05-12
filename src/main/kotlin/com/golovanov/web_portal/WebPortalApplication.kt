package com.golovanov.web_portal

import io.github.cdimascio.dotenv.dotenv
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebPortalApplication

fun main(args: Array<String>) {
	dotenv().entries().forEach { entry ->
		System.setProperty(entry.key, entry.value)
	}
	runApplication<WebPortalApplication>(*args)
}
