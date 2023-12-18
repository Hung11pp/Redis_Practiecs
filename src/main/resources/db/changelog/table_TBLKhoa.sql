--liquibase formatted sql
--changeset author_liquibase:202312150900table_TBLKhoa

CREATE TABLE TBLKhoa
(Makhoa varchar(10) primary key,
 Tenkhoa varchar(30),
 Dienthoai varchar(10));
