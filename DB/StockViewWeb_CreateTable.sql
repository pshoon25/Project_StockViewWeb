show databases;

create database StockViewWeb;

use StockViewWeb;

CREATE TABLE Member(
	id int primary key auto_increment,
    MemberId char(255),
    MemberPw char(255),
    MemberName char(255),
    MamnerBirth int
);

CREATE TABLE ItemOfInterest(
	id int primary key auto_increment,
    MemberId char(255),
    StockitemName char(255)
);

show tables;
