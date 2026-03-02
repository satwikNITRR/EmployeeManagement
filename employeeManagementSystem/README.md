# Employee Management System

Spring Boot based Employee Management System with a layered architecture.

## Project Structure

```text
employeeManagementSystem/
├── pom.xml
├── mvnw
├── src/
│   ├── main/
│   │   ├── java/com/satwik/employeeManagementSystem/
│   │   │   ├── advice/                # Global exception handling
│   │   │   ├── controller/            # REST controllers
│   │   │   ├── dto/                   # Request/response DTOs
│   │   │   ├── entity/                # JPA entities
│   │   │   ├── exception/             # Custom exceptions
│   │   │   ├── mapper/                # Entity <-> DTO mappers
│   │   │   ├── repository/            # Spring Data repositories
│   │   │   ├── service/               # Business logic
│   │   │   ├── Valid/                 # Validation package (currently empty)
│   │   │   └── EmployeeManagementSystemApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── db/reset_employee_schema_and_seed.sql
│   │       ├── static/                # Static assets (currently empty)
│   │       └── templates/             # Templates (currently empty)
│   └── test/
│       └── java/com/satwik/employeeManagementSystem/
│           └── EmployeeManagementSystemApplicationTests.java
└── target/
```

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Maven

## Run Locally

From the `employeeManagementSystem` directory:

```bash
./mvnw spring-boot:run
```

On Windows:

```bat
mvnw.cmd spring-boot:run
```

## Test

```bash
./mvnw test
```

On Windows:

```bat
mvnw.cmd test
```
