# spring-boot-CRUD-with-jwt

> A Spring-boot web app to demonstrate CRUD operations with authenticated endpoints.
> Live demo [_here_](https://www.getpostman.com/collections/c55d9585dcbb5d9f495d).

## Table of Contents
* [General Info](#general-information)
* [Technologies Used](#technologies-used)
* [Screenshots](#screenshots)
* [Setup](#setup)
* [Usage](#usage)
* [Project Status](#project-status)
* [Room for Improvement](#room-for-improvement)
* [Contact](#contact)
<!-- * [License](#license) -->


## General Information
- This project intends to help developers understand how to create a spring-boot web app, perform CRUD(Create,Read,Update and Delete) operations on data
  stored in a MYSQL database. The application demonstrates how spring security can be achieved.



## Technologies Used
- Spring-boot - version 2.6.4
- Java - version 1.8
- MYSQL database
- Postman 
- Heroku cloud hosting
- spring-security (jwt)
- Maven
- Intellij



## Setup
This projects requires you to have the above technologies as a pre-requisite, clone (https://github.com/gloriamutie/spring-boot-CRUD-with-jwt.git) and set up on your favourite IDE.
After cloning run the following commands to set up.
mvn clean install
mvn spring-boot:run


## Usage
Test the api's from the postman.Below screenshots guide on the payload to pass in the request body and the expected responses.
##sample headers
Authorization:Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuYW1lIiwiZXhwIjoxNjQ2Njk0MjcyLCJpYXQiOjE2NDY2NTgyNzJ9.W11iRPLhVS_dvpXMiK5bY7jmI-5IlIpTQvchGgsPBNI

Content-Type:application/json

N/B (No headers for the token genertaor endpoint)
## Screenshots
![JWT Token generation](.idea/iimages/jwt.PNG)

![Create Record](.idea/iimages/savetodb.PNG)

![Get all records](.idea/iimages/GetsavedData.PNG)

![Update record by id](.idea/iimages/Update.PNG)

![Delete record by id](.idea/iimages/Update.PNG)

<img width="636" alt="savetodb" src="https://user-images.githubusercontent.com/44633727/157164367-78aeff9c-2dc9-4d2d-9411-cf112179359b.PNG">





## Project Status
Project is: _in progress_ 


## Room for Improvement
Logging,Error mapping,unit tests and include role based authentication for admin and user.



## Contact
Created by mwongeliglo15@gmail.com 

## License
Copyright (c) 2020 gloria mutie

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

