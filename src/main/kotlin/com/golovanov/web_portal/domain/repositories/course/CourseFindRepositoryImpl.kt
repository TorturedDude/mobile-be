package com.golovanov.web_portal.domain.repositories.course

import com.golovanov.web_portal.domain.entities.Course
import io.r2dbc.spi.Row
import io.r2dbc.spi.RowMetadata
import kotlinx.coroutines.reactor.awaitSingle
import org.springframework.r2dbc.core.DatabaseClient
import java.time.LocalDate
import java.util.function.BiFunction

class CourseFindRepositoryImpl(
    private val databaseClient: DatabaseClient,
) : CourseFindRepository {

    companion object {
        private const val FIND_ALL_BY_USER_ID = """
            SELECT * FROM courses c
            JOIN course_users cu on cu.course_id = c.id
            JOIN users u on u.id = c.user.id
            WHERE u.username = :username
        """

        private val mapperList =
            BiFunction<Row, RowMetadata, Course> { row, _ ->
                Course(
                    id = row["id"] as? Long,
                    title = row["title"] as String,
                    description = row["description"] as String,
                    duration = row["duration"] as Int,
                    price = row["price"] as Double,
                    startDate = row["start_date"] as LocalDate,
                )
            }
    }

    override suspend fun findAllByUsername(username: String): List<Course> =
        databaseClient.sql(FIND_ALL_BY_USER_ID)
            .bind("username", username)
            .map(mapperList)
            .all().collectList().awaitSingle()
}