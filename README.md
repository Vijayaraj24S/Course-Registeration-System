# Course-Registration-System
  A full-stack Course Registration System built using Spring Boot, MySQL, and HTML/CSS/JavaScript.
The application allows users to view available courses, register for courses, and view enrolled students through RESTful APIs.

# Features:
- View available courses
- Register a student for a course
- View enrolled students
- RESTful API architecture
- MySQL database integration
- Frontend–backend communication using Fetch API

# Backend:
- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

# Frontend:
- HTML
- CSS
- JavaScript (Fetch API)

# API Endpoints:

 User APIs:
- GET /user/courses  => Fetch all available courses
- POST /user/courses/register => Register a user for a course

 Admin APIs:
- GET /admin/courses/enrolled => View all enrolled students
- POST /admin/add-user => Add a new user

How to Run Locally:

 Backend:
- Open the Backend folder in your IDE
- Configure MySQL details in application.properties
- Run the Spring Boot application
- Backend runs on: http://localhost:8080

 Frontend:
- Open the Frontend folder
- Open index.html using Live Server or browser
- Frontend communicates with backend using REST APIs

# Security:
- Spring Security with Basic Authentication
- Role-based authorization (ADMIN, USER)
- Passwords encrypted using BCryptPasswordEncoder

# Notes:
- Source code only uploaded; the application does not run directly on GitHub
- Backend and database must be run locally or deployed to a server for full functionality


