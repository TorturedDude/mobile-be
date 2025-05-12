--liquibase formatted sql
--changeset agolovanov:001

CREATE TABLE IF NOT EXISTS users(
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(32) UNIQUE NOT NULL,
    first_name VARCHAR(32) NOT NULL,
    last_name VARCHAR(32) NOT NULL,
    email DOMAIN_EMAIL UNIQUE NOT NULL,
    password TEXT NOT NULL,
    role TEXT NOT NULL
);