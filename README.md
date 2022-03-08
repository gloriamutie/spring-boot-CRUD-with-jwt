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
# JWT
<img width="642" alt="jwt" src="https://user-images.githubusercontent.com/44633727/157164517-72b99f1e-c89e-4602-809e-028f5c361587.PNG">

# Save/Create data 
<img width="636" alt="savetodb" src="https://user-images.githubusercontent.com/44633727/157164577-1c8ca77c-2241-43d4-a420-ac116fa80c56.PNG">

# Read saved data from db
<img width="642" alt="GetsavedData" src="https://user-images.githubusercontent.com/44633727/157164604-a622b69b-c22e-43e3-a3e8-ddcde3c25f6a.PNG">

# Update by id
<img width="646" alt="Update" src="https://user-images.githubusercontent.com/44633727/157164643-d516d27b-6d2f-4a5a-8dec-840e7df51d05.PNG">

# Delete by id
<img width="667" alt="Delete" src="https://user-images.githubusercontent.com/44633727/157164672-ba468dda-e718-4aba-b111-3821c60f6793.PNG">



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

