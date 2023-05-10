-- liquibase formatted sql

-- changeset User:1683746456886-1
CREATE TABLE product.product (id BIGINT AUTO_INCREMENT NOT NULL, name VARCHAR(255) NULL, CONSTRAINT PK_PRODUCT PRIMARY KEY (id));

