create database starbucks;
use starbucks;
create table login(
	userId varchar(15) primary key,
    userPw varchar(16) not null
);

insert login 
values
('holic9311','1234567890'),
('holic7186','1234567890'),
('holic9956','1234567890')
;

select * from login;

create table regedit(
	userId varchar(15) primary key,
    userPw varchar(16) not null,
	userName varchar (20) not null,
    gender varchar(4) not null,
    userYear varchar(4) not null,
    userMonth varchar(2) not null,
    userDay varchar(2) not null,
    birthFlag varchar(2) not null,
    userPhone varchar(12) not null,
	userEmail varchar(30) not null
);
insert regedit 
values
('holic9311','1234567890','이상국','남','1993','12','31','양력', '01071869956','dltkdrnr@naver.com'),
('qwert9311','234asaw567889','정은하','여','1995','12','31','음력', '01012341234','wjddmsgk@naver.com'),
('asdfg9311','070012312323','한수진','별종','1997','12','31','양력','01099880099','gkstnwls@naver.com');

select * from regedit;
