--liquibase formatted sql
--changeset author_liquibase:202312150900table_TBLGiangVien

CREATE TABLE TBLGiangVien (
Magv bigint primary key,
Hotengv varchar(30),
Luong decimal(5,2),
Makhoa varchar(10),
FOREIGN KEY (Makhoa) REFERENCES TBLKhoa(Makhoa));

