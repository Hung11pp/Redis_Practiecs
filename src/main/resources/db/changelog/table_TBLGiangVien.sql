--liquibase formatted sql
--changeset author_liquibase:202312150900table_giangvien
CREATE TABLE IF NOT EXISTS giangvien (
Magv bigint primary key,
Hotengv varchar(30),
Luong decimal(5,2),
Makhoa varchar(10),
FOREIGN KEY (Makhoa) REFERENCES khoa(Makhoa));

