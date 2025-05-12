--liquibase formatted sql
--changeset agolovanov:001

CREATE TABLE IF NOT EXISTS sessions(
    id BIGSERIAL PRIMARY KEY,
    comment TEXT NOT NULL,
    date_session Date NOT NULL,
    time_session Date NOT NULL,
    user_id BIGINT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);