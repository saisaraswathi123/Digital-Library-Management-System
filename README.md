**Digital-Library-Management-System** :
=======================================

This is a simple digital library management system built using Java, Spring Boot, and PostgreSQL. It allows users to add, list, and borrow books, as well as manage members of the library.


 **Technologies Used** : 
 ======================
  
   Java 17

  Spring Boot 3.4.4

  Spring Data JPA

  PostgreSQL

  HTML + JavaScript (frontend)

  Gradle 

  IntelliJ IDEA


 **Features** :  
 ===============
 
 Add Books, Members, and Borrowings

  Fetch All Books, Members, and Borrowings

  Display books in a sidebar list on homepage

  Simple UI with buttons to manage records

  Data stored in PostgreSQL using JPA


 **Project Structure** :
 =======================
 
![image](https://github.com/user-attachments/assets/ab0da88a-c1b1-42d0-93e8-c15a3c46dd34)




**API Endpoints** :
===================

Method	Endpoint	Description

GET	/api/books	List all books

POST	/api/books	Add a new book

GET	/api/members	List all members

POST	/api/members	Add a new member

GET	/api/borrowings	List all borrowings

POST	/api/borrowings	Add a new borrowing

GET	/	Welcome message

GET	/index.html	Main UI page


**How to Run Locally** :
========================

Clone the repository  -

git clone https://github.com/saisaraswathi123/Digital-Library-Management-System.git

cd Digital-Library-Management-System



**Set up PostgreSQL and create a database** :
================================================

CREATE DATABASE postgres_db;


**Update src/main/resources/application.properties** :
======================================================

spring.datasource.url=jdbc:postgresql://localhost:5432/library_db

spring.datasource.username=your_postgres_user

spring.datasource.password=your_postgres_password

spring.jpa.hibernate.ddl-auto=update


**Run the project:** :
=====================
./gradlew bootRun


**Open your browser and go to**:
================================

 http://localhost:8080/index.html


**Application pages:**
=============================

 ![Screenshot 2025-04-07 175523](https://github.com/user-attachments/assets/e16a0763-33bf-49ef-9d24-d275f79ce32e)
====================================================================================================================





 ![Screenshot 2025-04-07 175633](https://github.com/user-attachments/assets/0ae045a5-aadd-4c17-8d7f-0478b6dde1c5)
=====================================================================================================================




 
 ![Screenshot 2025-04-07 175716](https://github.com/user-attachments/assets/8dafb8a2-df66-4e95-a0be-d2d5b3c7321e)
========================================================================================================================





 
 ![Screenshot 2025-04-07 175742](https://github.com/user-attachments/assets/407768a1-ea7b-4248-a3f5-224c9e757fcc)
 =======================================================================================================================



 

 ![Screenshot 2025-04-11 135337](https://github.com/user-attachments/assets/8ce9f28b-72e3-4857-8a03-fdee856a6c9b)
 =======================================================================================================================


 




 ![Screenshot 2025-04-11 134916](https://github.com/user-attachments/assets/4eebbdb1-9b9b-4daa-887c-6eba4fd08eb4)
 =========================================================================================================================






 ![Screenshot 2025-04-11 134949](https://github.com/user-attachments/assets/51ffd18c-d092-4e45-874d-62bce051bb79)
 ========================================================================================================================


 

 **Author** :
 ===========

 Saisaraswathi
 
 kourwarsaisaraswathi@gmail.com
 
 GitHub: saisaraswathi123




