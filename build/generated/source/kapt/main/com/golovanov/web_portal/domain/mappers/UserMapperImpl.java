package com.golovanov.web_portal.domain.mappers;

import com.golovanov.web_portal.domain.dtos.user.UserCreateDto;
import com.golovanov.web_portal.domain.dtos.user.UserDto;
import com.golovanov.web_portal.domain.dtos.user.UserEditDto;
import com.golovanov.web_portal.domain.entities.User;
import com.golovanov.web_portal.enums.Role;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-11T15:07:37-0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.9.25.jar, environment: Java 17.0.14 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserCreateDto dto) {
        if ( dto == null ) {
            return null;
        }

        String firstName = null;
        String lastName = null;
        String username = null;
        String email = null;
        String password = null;

        firstName = dto.getFirstName();
        lastName = dto.getLastName();
        username = dto.getUsername();
        email = dto.getEmail();
        password = dto.getPassword();

        Long id = null;
        Role role = null;

        User user = new User( id, firstName, lastName, username, email, password, role );

        return user;
    }

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        long id = 0L;
        String firstName = null;
        String lastName = null;
        String username = null;
        String email = null;
        Role role = null;

        if ( user.getId() != null ) {
            id = user.getId();
        }
        firstName = user.getFirstName();
        lastName = user.getLastName();
        username = user.getUsername();
        email = user.getEmail();
        role = user.getRole();

        UserDto userDto = new UserDto( id, firstName, lastName, username, email, role );

        return userDto;
    }

    @Override
    public User toEntity(long id, UserEditDto dto) {
        if ( dto == null ) {
            return null;
        }

        String email = null;
        String password = null;
        if ( dto != null ) {
            email = dto.getEmail();
            password = dto.getPassword();
        }
        Long id1 = null;
        id1 = id;

        String firstName = null;
        String lastName = null;
        String username = null;
        Role role = null;

        User user = new User( id1, firstName, lastName, username, email, password, role );

        return user;
    }
}
