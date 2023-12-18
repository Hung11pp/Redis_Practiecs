--liquibase formatted sql
--changeset author_liquibase:202312150900table_TBLDeTai

CREATE TABLE TBLDeTai(
Madt varchar(10) primary key,
Tendt varchar(30),
Kinhphi bigint,
Noithuctap varchar(30));

