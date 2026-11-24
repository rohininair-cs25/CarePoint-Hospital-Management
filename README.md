# CarePoint — Hospital Management System

A full-stack Java academic project with a polished browser dashboard.

## Modules included
- Overview dashboard with live totals and recent patients
- Patient management: add, view, edit, delete
- Doctor management: add, view, edit, delete
- Appointment management: add, view, edit, delete
- Search within each module

## Technology
- Java 17
- Spring Boot 3.5.7
- Spring Web (REST APIs)
- Spring Data JPA / Hibernate
- MySQL
- HTML, CSS, vanilla JavaScript
- Maven

## Run it
1. Install JDK 17+, MySQL Server and IntelliJ IDEA (or another Java IDE).
2. Start MySQL.
3. Open MySQL Workbench or a MySQL terminal and run:
   ```sql
   CREATE DATABASE carepoint_hospital;
   ```
   The JDBC URL also has `createDatabaseIfNotExist=true`.
4. Open `src/main/resources/application.properties`. Change `spring.datasource.password=CHANGE_ME` to your local MySQL password. Update username too if needed.
5. Open the folder containing `pom.xml` in IntelliJ and allow Maven to import dependencies.
6. Run `src/main/java/com/carepoint/HospitalApplication.java`.
7. Wait for Spring Boot to start, then open **http://localhost:8080** in Chrome.

Do not open the HTML file directly or use Live Server. Spring Boot serves the website and API from the same address.

## API endpoints
| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/api/patients` | List patients |
| GET | `/api/patients/{id}` | Get one patient |
| POST | `/api/patients` | Add patient |
| PUT | `/api/patients/{id}` | Update patient |
| DELETE | `/api/patients/{id}` | Delete patient |
| GET/POST | `/api/doctors` | List / add doctors |
| GET/PUT/DELETE | `/api/doctors/{id}` | Get / update / delete doctor |
| GET/POST | `/api/appointments` | List / add appointments |
| GET/PUT/DELETE | `/api/appointments/{id}` | Get / update / delete appointment |

## Example API request
POST `/api/patients` with JSON:
```json
{
  "name": "Asha Kumar",
  "age": 34,
  "gender": "Female",
  "phone": "9876543210",
  "email": "asha@example.com",
  "bloodGroup": "O+",
  "address": "Bengaluru"
}
```

Appointments currently store patient and doctor IDs and names as fields, to keep this starter project straightforward for learning. For a more robust production system, model these as JPA relationships and validate IDs against existing records.

## How the modules fit together
- `model`: Java entity classes mapped to database tables.
- `repository`: Spring Data JPA interfaces that provide database operations.
- `service`: business logic and record lookup.
- `controller`: REST API endpoints used by the browser.
- `resources/static`: frontend HTML, CSS and JavaScript served by Spring Boot.
- `application.properties`: MySQL connection and server configuration.

## Suggested explanation for your project demo
"The frontend is built using HTML, CSS and JavaScript. JavaScript sends HTTP requests to REST endpoints created using Spring Boot. The controller receives each request and calls the service layer. The service uses Spring Data JPA repositories to perform CRUD operations in MySQL. The returned JSON is displayed in the browser."

## Important
This is an academic demonstration project, not a production-ready hospital information system. It has no login, role-based access, audit logs, or production-grade privacy controls. Use fictional data only. Do not store real patient information. Before any real-world use, implement authentication, authorization, HTTPS, encryption, audit logging, backups, validation, and applicable privacy/legal safeguards. For production, use Flyway or Liquibase migrations instead of `ddl-auto=update`.
