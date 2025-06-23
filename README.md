# 💧⚡ Smart Water & Electricity Monitoring System

A Spring Boot application for real-time monitoring of water and electricity usage. Designed to help administrators and users track utility metrics efficiently with WebSocket support, RESTful APIs, and Swagger UI.


## 🚀 Features

- ✅ Real-time monitoring of water and electricity data
- ✅ RESTful API endpoints
- ✅ PostgreSQL database integration
- ✅ WebSocket support for live updates
- ✅ Swagger UI for easy API testing
- ✅ Modular Spring Boot structure
- ❌ No seed data included (data must be entered manually or integrated from live sources)


## 🛠️ Technologies Used

| Tech                 | Purpose                      |
|----------------------|------------------------------|
| **Java 22**          | Main language                |
| **Spring Boot 3.5.3**| Backend framework            |
| **Spring Data JPA**  | ORM for DB operations        |
| **PostgreSQL**       | Database                     |
| **WebSockets**       | Real-time updates            |
| **Swagger/OpenAPI**  | API documentation            |
| **Maven**            | Dependency management        |


## 🧰 Project Structure

smart-monitoring-system/
│
├── src/main/java/com/monitoring
│ ├── controller/ # API controllers
│ ├── model/ # Entity models
│ ├── repository/ # JPA repositories
│ ├── service/ # Business logic
│ └── SmartMonitoringSystemApplication.java
│
├── src/main/resources/
│ ├── application.properties # Configs
│ └── static/ & templates/ # Optional for web views
│
├── build.gradle / pom.xml # Dependencies
└── README.md # You're here!



## 📦 Getting Started

### 1. Clone the repository

- git clone https://github.com/Extacia21/smart-monitoring-system.git
- cd smart-monitoring-system

### 2. Configure your PostgreSQL database
Update application.properties:
- spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
- spring.datasource.username=your_username
- spring.datasource.password=your_password
- spring.jpa.hibernate.ddl-auto=update

### 3. Build and run the app
If using Maven:
- ./mvnw spring-boot:run
If using Gradle:
- ./gradlew bootRun

  
### API Documentation (Swagger)
Once the app is running, access Swagger UI:
- http://localhost:8081/swagger-ui/index.html

### 📡 WebSocket Endpoint
The WebSocket messaging system is enabled and can be configured to push updates in real-time. You can find it under /ws (adjust as needed).

### 🧪 Sample Endpoints (without seed data)
Endpoint	Method	Description
/api/readings	GET	Fetch all readings
/api/readings	POST	Submit a new reading
/api/readings/{id}	GET	Get reading by ID
/api/readings/{id}	DELETE	Delete a reading

### 📌 To-Do / Future Improvements
- Add seed data generator

- Build frontend dashboard

- Add user roles & authentication

- Export readings to CSV/PDF

- Add IoT device integration

### 👨‍💻 Author
 Extacia Fakero
- 💼 Developer & System Designer
- 📧 [extaciafakero@gmail.com]


