SHOW DATABASES;
    
CREATE DATABASE springjdbc;
USE springjdbc;      -- (FOR SPRING JDBC)
SHOW TABLES;


-- WORK ON STUDENT TABLE
CREATE TABLE STUDENT(
ID INT PRIMARY KEY,
NAME VARCHAR(100) NOT NULL,
CITY VARCHAR(255)
);
DESC STUDENT;
INSERT INTO STUDENT (ID,NAME,CITY) VALUES
(222,"DIYA JAIN","DELHI");
SELECT * FROM STUDENT;