
# Employee Management System - Spring Boot

This is a RESTful API built with Spring Boot for managing employees in an organization. The system supports full CRUD operations (Create, Read, Update, Delete) for employee records.

---

## Features

1. **Retrieve All Employees**
   - Endpoint: `GET /api/employees`
   - Fetches a list of all employees in the database.

2. **Retrieve Employee by ID**
   - Endpoint: `GET /api/employees/{id}`
   - Fetches the details of a single employee by their unique ID.

3. **Create New Employee**
   - Endpoint: `POST /api/employees`
   - Request Body:
     ```json
     {
       "firstName": "John",
       "lastName": "Doe",
       "email": "john.doe@example.com"
     }
     ```

4. **Update Existing Employee**
   - Endpoint: `PUT /api/employees/{id}`
   - Updates the details of an existing employee.
   - Request Body:
     ```json
     {
       "firstName": "Jane",
       "lastName": "Smith",
       "email": "jane.smith@example.com"
     }
     ```

5. **Delete Employee**
   - Endpoint: `DELETE /api/employees/{id}`
   - Deletes an employee by their unique ID.

---

## Technologies Used

- **Spring Boot**: Backend framework for RESTful APIs.
- **Hibernate (JPA)**: ORM for database operations.
- **MySQL**: Database for storing employee records.
- **Lombok**: To reduce boilerplate code for models.
- **Maven**: Build tool for managing dependencies.

---

## Prerequisites

1. **Java**: Ensure JDK 17 or higher is installed.
2. **MySQL**: Database server running locally or remotely.
3. **Maven**: Dependency management tool (included in IntelliJ IDEA).

---

## Setup Instructions

### Clone the Repository
Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/TharanaBope/Employee-Management-System-SpringBoot.git

