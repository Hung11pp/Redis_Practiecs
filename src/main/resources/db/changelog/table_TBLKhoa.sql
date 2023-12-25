--liquibase formatted sql
--changeset author_liquibase:202312150900table_khoa

CREATE TABLE IF NOT EXISTS khoa
(Makhoa varchar(10) primary key,
 Tenkhoa varchar(30),
 Dienthoai varchar(10));
