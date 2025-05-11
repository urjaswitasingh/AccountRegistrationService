# 🏦 CitiBank Account Registration Service

## 📘 Project Description

The **CitiBank Account Registration Service** is a Spring Boot microservice that handles the core functionalities for **user registration** and **account management**. It allows for account creation, scheduling payments, and transferring funds between accounts. It also integrates with Kafka to send messages related to scheduled payments.

This service plays a key role in CitiBank's banking system by managing user account data and facilitating basic banking operations.

---

## 🔑 Key Features

### User Registration
- **Register a new user**: Allows a new user to register in the bank's system.
- **Account creation**: For every new user, a default savings account is created.
  
### Scheduled Payments
- **Schedule Payments**: Users can schedule payments, which are saved and communicated to other services via Kafka.

### Fund Transfer
- **Fund Transfer**: Facilitates transferring funds between two accounts.
  
---

## 🛠 Technologies Used

- **Java 17** – Core language for business logic.
- **Spring Boot** – Application framework for building microservices.
- **Spring Data JPA** – Database interaction layer.
- **PostgreSQL** – Database for storing user and account information.
- **Apache Kafka** – Asynchronous message broker used for communication.
- **Spring Kafka** – Kafka producer integration for message publishing.
- **JUnit** – For unit testing the business logic.

---

## 🚀 Getting Started

### Prerequisites

Before running this project, ensure you have the following installed:

- **Java 17 or higher**
- **Apache Kafka** – Kafka must be running for the Kafka producer to send messages.
- **PostgreSQL or H2** – For storing user, account, and payment data.
- **Maven** – For project dependencies and building the project.

---

### Installation

#### Clone the Repository:
```bash
git clone https://github.com/yourusername/citibank-account-registration-service.git
cd citibank-account-registration-service
