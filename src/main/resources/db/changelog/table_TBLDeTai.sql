--liquibase formatted sql
--changeset author_liquibase:202312150900table_detai

CREATE TABLE IF NOT EXISTS detai(
Madt varchar(10) primary key,
Tendt varchar(30),
Kinhphi bigint,
Noithuctap varchar(30));

