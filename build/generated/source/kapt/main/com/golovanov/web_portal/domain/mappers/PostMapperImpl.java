package com.golovanov.web_portal.domain.mappers;

import com.golovanov.web_portal.domain.dtos.post.PostCreateDto;
import com.golovanov.web_portal.domain.dtos.post.PostDto;
import com.golovanov.web_portal.domain.entities.Post;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-11T06:33:34-0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.9.25.jar, environment: Java 17.0.14 (Amazon.com Inc.)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public PostDto toDto(Post entity) {
        if ( entity == null ) {
            return null;
        }

        long id = 0L;
        String title = null;
        String description = null;
        LocalDate publishDate = null;

        if ( entity.getId() != null ) {
            id = entity.getId();
        }
        title = entity.getTitle();
        description = entity.getDescription();
        publishDate = entity.getPublishDate();

        PostDto postDto = new PostDto( id, title, description, publishDate );

        return postDto;
    }

    @Override
    public Post toEntity(PostCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        String title = null;
        String description = null;
        LocalDate publishDate = null;

        title = dto.getTitle();
        description = dto.getDescription();
        publishDate = dto.getPublishDate();

        Long id = null;

        Post post = new Post( id, title, description, publishDate );

        return post;
    }

    @Override
    public Post toEntity(long id, PostCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        String title = null;
        String description = null;
        LocalDate publishDate = null;
        if ( dto != null ) {
            title = dto.getTitle();
            description = dto.getDescription();
            publishDate = dto.getPublishDate();
        }
        Long id1 = null;
        id1 = id;

        Post post = new Post( id1, title, description, publishDate );

        return post;
    }
}
