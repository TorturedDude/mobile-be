package com.golovanov.web_portal.domain.repositories.review

import com.golovanov.web_portal.domain.dtos.review.ReviewDto
import com.golovanov.web_portal.domain.entities.Review
import io.r2dbc.spi.Row
import io.r2dbc.spi.RowMetadata
import kotlinx.coroutines.reactor.awaitSingle
import org.springframework.r2dbc.core.DatabaseClient
import java.util.function.BiFunction

class ReviewFindRepositoryImpl(
    private val databaseClient: DatabaseClient,
) : ReviewFindRepository {

    companion object {
        private const val FIND_ALL_BY_POST_ID = """
            SELECT * FROM reviews
            WHERE post_id = :postId
        """

        private val mapperList =
            BiFunction<Row, RowMetadata, Review> { row, _ ->
                Review(
                    id = row["id"] as? Long,
                    decription = row["description"] as String,
                    rating = row["rating"] as Int,
                    postId = row["post_id"] as Long,
                )
            }
    }

    override suspend fun findAllByPostId(postId: Long): List<Review> =
        databaseClient.sql(FIND_ALL_BY_POST_ID)
            .bind("post_id", postId)
            .map(mapperList)
            .all().collectList().awaitSingle()
}