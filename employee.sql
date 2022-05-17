-- CREATE DATABASE dba;
USE dba;
DROP TABLE employee;

CREATE TABLE employee(
	id int(10) primary key auto_increment,
	name varchar(30),
    age int(3),
    job varchar(20),
    phone varchar(10),
    address varchar(60)
    );
    
INSERT INTO employee VALUES(1, 'Pratyush', 23, 'Developer', '9123456780','Howrah');

SELECT * FROM employee;

-- delete from employee where id=2;