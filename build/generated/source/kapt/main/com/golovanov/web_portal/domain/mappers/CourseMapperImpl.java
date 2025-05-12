package com.golovanov.web_portal.domain.mappers;

import com.golovanov.web_portal.domain.dtos.course.CourseCreateDto;
import com.golovanov.web_portal.domain.dtos.course.CourseDto;
import com.golovanov.web_portal.domain.dtos.course.CourseEditDto;
import com.golovanov.web_portal.domain.entities.Course;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-11T06:33:35-0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.9.25.jar, environment: Java 17.0.14 (Amazon.com Inc.)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public Course toEntity(long id, CourseEditDto dto) {
        if ( dto == null ) {
            return null;
        }

        String title = null;
        String description = null;
        int duration = 0;
        double price = 0.0d;
        LocalDate startDate = null;
        if ( dto != null ) {
            title = dto.getTitle();
            description = dto.getDescription();
            duration = dto.getDuration();
            price = dto.getPrice();
            startDate = dto.getStartDate();
        }
        Long id1 = null;
        id1 = id;

        Course course = new Course( id1, title, description, duration, price, startDate );

        return course;
    }

    @Override
    public CourseDto toDto(Course course) {
        if ( course == null ) {
            return null;
        }

        long id = 0L;
        String title = null;
        String description = null;
        int duration = 0;
        double price = 0.0d;
        LocalDate startDate = null;

        if ( course.getId() != null ) {
            id = course.getId();
        }
        title = course.getTitle();
        description = course.getDescription();
        duration = course.getDuration();
        price = course.getPrice();
        startDate = course.getStartDate();

        CourseDto courseDto = new CourseDto( id, title, description, duration, price, startDate );

        return courseDto;
    }

    @Override
    public Course toEntity(CourseCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        String title = null;
        String description = null;
        int duration = 0;
        double price = 0.0d;
        LocalDate startDate = null;

        title = dto.getTitle();
        description = dto.getDescription();
        duration = dto.getDuration();
        price = dto.getPrice();
        startDate = dto.getStartDate();

        Long id = null;

        Course course = new Course( id, title, description, duration, price, startDate );

        return course;
    }
}
