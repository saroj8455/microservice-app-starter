# 🚀 Spring Boot Microservices with API Gateway

A production-ready **microservices architecture** built using **Java 17**, **Spring Boot**, **Spring Cloud**, **Eureka Discovery**, and **Spring Cloud Gateway**.

This project demonstrates:
- Service discovery
- Inter-service communication
- API Gateway routing
- Typed DTO-based JSON responses
- Clean and interview-ready structure

---

## 🧱 Architecture Overview


---

## 🛠 Tech Stack

| Technology | Version |
|-----------|---------|
| Java | 17 |
| Spring Boot | 3.4.5 |
| Spring Cloud | 2024.0.1 |
| Service Discovery | Netflix Eureka |
| API Gateway | Spring Cloud Gateway |
| Build Tool | Maven |
| Communication | RestTemplate (LoadBalanced) |
| Response Format | Typed JSON DTOs |

---

## 📂 Project Structure


---

## ⚙️ Services & Ports

| Service | Port |
|-------|------|
| API Gateway | 8080 |
| Eureka Server | 8761 |
| User Service | 8081 |
| Todo Service | 8082 |

---

## ▶️ How to Run the Project

### 1️⃣ Prerequisites
- Java 17 installed
- Maven installed
- IntelliJ IDEA (recommended)

---

### 2️⃣ Import into IntelliJ
1. Extract the ZIP
2. Open **IntelliJ → Open**
3. Select the **root folder**
4. Import as **Maven Project**
5. Set **Project SDK = Java 17**

---

### 3️⃣ Start Services (IMPORTANT ORDER)

```bash
1. discovery-server
2. todo-service
3. user-service
4. api-gateway
