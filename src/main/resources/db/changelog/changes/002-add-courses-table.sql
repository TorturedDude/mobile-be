--liquibase formatted sql

--changeset agolovanov:001
CREATE TABLE IF NOT EXISTS courses(
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(128) NOT NULL,
    description TEXT NOT NULL,
    price DECIMAL NOT NULL,
    duration INT NOT NULL,
    start_date Date NOT NULL
);

--changeset agolovanov:002
CREATE TABLE IF NOT EXISTS course_users (
    course_id BIGINT NOT NULL,
    user_id BIGINT NOT NULL,
    PRIMARY KEY (course_id, user_id),
    FOREIGN KEY (course_id) REFERENCES courses(id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);