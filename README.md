# BMS
POC in Hibernate with SpringBoot
#Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial
This is a Sample Application management system using Spring Boot, Mysql, JPA and Hibernate.

#Requirements
1.	Java - 1.8.x
2.	Maven - 3.x.x
3.	Mysql - 5.x.x

#Steps to Setup
1. Clone the application
git clone https://github.com/thiyaguanbu/BMS.git
2. Create Mysql database
create database applicationmanagement
3. Change mysql username and password as per your installation.

>open src/main/resources/application.properties

>change spring.datasource.username and spring.datasource.password as per your mysql installation

4. Build and run the app using maven

##mvn package
java -jar target/BankManagementSystem-1.0.0.jar
Alternatively, you can run the app without packaging it using -
mvn spring-boot:run
The app will start running at http://localhost:8080.

#Explore Rest APIs
The app defines following CRUD APIs.

**Branch API**
GET /bms/branches

POST /bms/branch

GET /bms/branch/{id}

PUT /bms/branch

DELETE /api/notes/{id}

**Customer API**
GET /bms/customers

POST /bms/customer

GET /bms/customer/{number}

PUT /bms/customer

DELETE /bms/customer/{number}

You can test them using postman or any other rest client.
