--liquibase formatted sql
--changeset author_liquibase:202312150900table_TBLSinhvien

CREATE TABLE TBLSinhVien (
Masv bigint primary key,
Hotensv varchar(40),
Namsinh varchar(30),
Quequan varchar(30),
Makhoa varchar(10),
FOREIGN KEY (Makhoa) REFERENCES TBLKhoa(Makhoa));
