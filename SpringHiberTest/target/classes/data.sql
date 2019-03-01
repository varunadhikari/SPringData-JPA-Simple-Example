CREATE TABLE IF NOT EXISTS STUDENT(
id NUMBER NOT NULL,
name varchar(50),
course varchar(50),

PRIMARY KEY(id)
);

insert into student(id,name,course)
values(10001,'Varun', 'MCA');

insert into student(id,name,course)
values(10002,'Ashutosh', 'B.Tech-IT');

insert into student(id,name,course)
values(10003,'Tapesh', 'B.Tech-CS');