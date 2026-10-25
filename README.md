
# 🛒 E-Commerce Marketplace

A full-stack e-commerce marketplace built with **Spring Boot Microservices** and **Angular**. The platform allows clients to browse products and enables sellers to manage their product catalogs and associated media.

The project focuses on microservices architecture, secure authentication, inter-service communication, and modern frontend development.

## ✨ Features

- 👤 **User Management:** Registration, authentication, and role-based access for clients and sellers.
- 📦 **Product Management:** Create, update, delete, and browse products.
- 🖼️ **Media Management:** Upload and manage product images with file validation and size limits.
- 🔐 **Security:** JWT authentication with Spring Security.
- ⚡ **Asynchronous Communication:** Kafka integration for event-driven communication.
- 🎨 **Frontend:** Angular SPA with routing, guards, interceptors, and reactive forms.
- 📊 **Observability:** Logging, health checks, and monitoring.

## 🏗️ Architecture

The application consists of three independent backend microservices:

- **User Service:** Manages user accounts, authentication, and roles.
- **Product Service:** Handles product catalog operations.
- **Media Service:** Manages product images and media uploads.

The Angular frontend communicates with backend services through REST APIs. Kafka can be used for asynchronous communication, while MongoDB provides data persistence.

## 🛠️ Technologies Used

- **Backend:** Java, Spring Boot, Spring Security, Spring Data MongoDB
- **Frontend:** Angular, TypeScript, HTML5, CSS3
- **Database:** MongoDB
- **Messaging:** Apache Kafka
- **Authentication:** JWT
- **Build Tools:** Gradle, npm
- **DevOps:** Git, Docker

## 📁 Project Structure

```text
e-commerce-marketplace/
├── backend/
│   ├── user-service/
│   ├── product-service/
│   └── media-service/
├── frontend/
│   └── ecommerce-ui/
├── infrastructure/
├── docs/
└── README.md
```

*Adapt this structure to match your actual repository.*

## ⚙️ Prerequisites

Make sure you have installed:

- Java JDK-17
- Gradle
- Node.js and npm
- Angular CLI
- MongoDB
- Apache Kafka (if enabled)

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/khirAbdelouahab/marketplace01.git
cd e-commerce-marketplace
```

### 2. Start the Backend

```bash

docker compose up -d
```


### 3. Start the Frontend

Navigate to the Angular application directory:

```bash
cd frontend/ecommerce-ui
npm install
ng serve
```

Open `http://localhost:4200` in your browser.

*Adjust the commands and paths to match your project configuration.*

## 💻 Usage

**Clients**
- Register and log in.
- Browse the product catalog.
- View product details and images.

**Sellers**
- Register and log in with a seller account.
- Create and manage products.
- Upload and manage product images.

## 🔐 Security

- Secure APIs using Spring Security and JWT or OAuth2.
- Enforce role-based access control on the backend.
- Validate uploaded files and enforce size limits.
- Protect sensitive configuration and credentials.
- Restrict sellers to authorized resources.

## 🧪 Testing

Run backend tests from each service directory:

```bash
./gradlew test
```

Run frontend tests using the test command configured in `package.json`.

## 🗺️ Future Improvements

- [ ] Add automated unit and integration tests.
- [ ] Integrate Kafka-based event processing.
- [ ] Add Docker Compose for local deployment.
- [ ] Implement centralized logging and monitoring.
- [ ] Improve API documentation and deployment automation.

## 📄 License

This project is licensed under the **[Choose a License]** license.

## 👨‍💻 Author

**[khir abdelouahab]**

- GitHub: [khir abdelouahab](https://github.com/khirAbdelouahab)
- LinkedIn: [khir abdelouahab](https://www.linkedin.com/in/abdelouahabkhir/)

---

⭐ If you find this project interesting, consider giving it a star!
