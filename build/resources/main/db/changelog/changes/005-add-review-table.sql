--liquibase formatted sql

--changeset agolovanov:001
CREATE TABLE IF NOT EXISTS reviews(
    id BIGSERIAL PRIMARY KEY,
    rating INT NOT NULL,
    decription TEXT NOT NULL,
    post_id BIGINT NOT NULL,
    FOREIGN KEY (post_id) REFERENCES posts(id) ON DELETE CASCADE
);