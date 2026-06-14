# StudentAPI

A RESTful API built with Java and Spring Boot that manages student records. Supports full CRUD operations — Create, Read, Update and Delete.

## Technologies Used

- Java 17
- Spring Boot 3.5.14
- Spring Web (REST)
- Maven
- Apache Tomcat (embedded)

## Project Structure

```
studentapi
└── src
    └── main
        └── java
            └── com.lebohang.studentapi
                ├── StudentapiApplication.java   # Spring Boot entry point
                ├── Student.java                 # Student model
                └── StudentController.java       # REST API endpoints
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/students` | Fetch all students |
| GET | `/students/{id}` | Fetch a student by ID |
| POST | `/students` | Add a new student |
| DELETE | `/students/{id}` | Delete a student by ID |

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/AnalystLebo/StudentAPI.git
   ```
2. Open the project in NetBeans or any IDE that supports Maven.
3. Wait for Maven to download dependencies.
4. Run `StudentapiApplication.java`.
5. The API will start on `http://localhost:8080`.

## Testing the API

**Get all students:**
```
GET http://localhost:8080/students
```

**Get student by ID:**
```
GET http://localhost:8080/students/1
```

**Add a new student (use Postman):**
```
POST http://localhost:8080/students
Content-Type: application/json

{
  "id": 4,
  "name": "New Student",
  "course": "Software Engineering",
  "gpa": 3.7
}
```

**Delete a student (use Postman):**
```
DELETE http://localhost:8080/students/1
```

## Example Response

```json
[
  {
    "id": 1,
    "name": "Lebohang Tapeane",
    "course": "Networking Systems",
    "gpa": 3.8
  },

{
"id": 2,
"name": "Prudence Tapeane",
"course": "Logistics & Supply Chain"
"gpa": 3.5
},
  {
    "id": 3,
    "name": "Tshepiso Tapeane",
    "course": "Bachelor of Accounting",
    "gpa": 3.9
  },
  {
    "id": 4,
    "name": "Jane Smith",
    "course": "Computer Science",
    "gpa": 3.6
  },
{
"id": 5
"name": "Lihle Vuyo",
"course": "Humanities",
"gpa": 3.2
}
]
```

## Purpose

Built to demonstrate REST API development using Java and Spring Boot — one of the most in-demand skills for Junior Java Developer roles. Shows understanding of HTTP methods, JSON responses, and Spring Boot annotations.

## License

MIT License — feel free to use and build on this project.
