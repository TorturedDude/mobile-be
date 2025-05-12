--liquibase formatted sql
--changeset agolovanov:001

CREATE TABLE IF NOT EXISTS posts(
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(128) NOT NULL,
    description TEXT NOT NULL,
    publish_date Date NOT NULL
);