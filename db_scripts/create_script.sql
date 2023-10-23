create database company_ms;

create table users (
id int not null AUTO_INCREMENT PRIMARY key,
    username varchar(20) not null,
    pass varchar(20) not null,
    created timestamp
);

