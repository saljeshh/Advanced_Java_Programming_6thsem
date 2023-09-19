use jdbcDemo;


CREATE TABLE student(
	id int AUTO_INCREMENT,
    name varchar(20),
    age int, 
    class int,
    PRIMARY KEY(id)
);


INSERT INTO student(name,age,class) 
VALUES ('saljesh', 21, 18),('rohan',22,56), ('ram', 56, 8);

show databases;

select * from student;