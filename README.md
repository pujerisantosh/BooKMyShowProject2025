# 📽️ BooKMyShowProject2025

This project is a low-level design and implementation of a movie ticket booking platform, conceptually similar to BookMyShow. It provides core functionalities for user management, movie and show administration, theatre setup, streamlined seat booking, and a simulated payment process.

## 🌟 Project Overview

`BooKMyShowProject2025` aims to demonstrate a robust backend system for a movie ticketing application, focusing on clear architectural design and efficient data handling.

## 🚀 Tech Stack

The project is built using modern Java ecosystem technologies:

* **Java 17+**: The core programming language.
* **Spring Boot**: For rapid application development and simplified configuration.
* **Maven**: Dependency management and build automation.
* **MySQL (or H2 for in-memory)**: Relational database for persistent storage.
* **JPA/Hibernate**: For Object-Relational Mapping (ORM) to interact with the database.
* **Postman/RestAssured**: Tools for testing the REST APIs.

## 🧩 Features

The application supports the following key functionalities:

* ✅ **User Registration/Login**: Secure user authentication and authorization.
* 🎬 **Browse Movies & Theatres**: Users can view available movies and the theatres where they are playing.
* 🕒 **Show Management (Timing, Screens)**: Admins can manage show timings and assign them to specific screens within a theatre.
* 💺 **Seat Selection & Booking**: Users can select desired seats and proceed with the booking.
* 💳 **Payment Simulation**: A simulated payment gateway for completing transactions.
* 📜 **Booking History**: Users can view their past booking details.

## ⚙️ Modules (Project Structure in `src/main/java`)

The project follows a standard layered architecture for clear separation of concerns:

* `controller/` – Houses the REST API endpoints, handling incoming HTTP requests and returning responses.
* `service/` – Contains the core business logic and orchestrates operations between controllers and repositories.
* `model/entity/` – Defines the database entities and their relationships.
* `repository/` – Spring Data JPA interfaces for data access and persistence operations.
* `exception/` – Custom exception classes for structured error handling.

## 🗃️ Database Design

The relational database schema is designed to efficiently manage all aspects of the booking system:

**Tables:**

* `User`: Stores user details.
* `Movie`: Stores movie information.
* `Theatre`: Stores theatre details.
* `Screen`: Represents individual screens within a theatre.
* `Show`: Details about a specific movie showing at a particular screen and time.
* `Seat`: Individual seats within a screen.
* `Booking`: Records of user bookings.
* `Payment`: Payment transaction details.

**Key Relationships:**

* One `Theatre` → Many `Screens`
* One `Screen` → Many `Shows`
* One `Show` → Many `Seats` (Represents available/bookable seats for a specific show)
* One `User` → Many `Bookings`

## ⚠️ Booking Concurrency (In Progress)

A critical aspect of a booking system is handling concurrent requests. A **seat locking mechanism** is planned and currently under development to prevent multiple users from simultaneously attempting to book the same seat, ensuring data integrity and a smooth user experience.

## 🧪 Testing

The API endpoints have been thoroughly tested to ensure correct functionality:

* ✅ **APIs tested using Postman**: Manual testing of REST endpoints.
* 🧪 **Unit tests in `src/test` (TBD)**: Planned for comprehensive code coverage and reliability.

## 🛠️ Run Locally

To get the BooKMyShowProject2025 up and running on your local machine:

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/pujerisantosh/BooKMyShowProject2025.git](https://github.com/pujerisantosh/BooKMyShowProject2025.git)
    cd BooKMyShowProject2025
    ```

2.  **Run the Application:**
    This command uses Maven Wrapper to build and run the Spring Boot application.
    ```bash
    ./mvnw spring-boot:run
    ```
    The application should start on its default port (usually 8080). You can then use Postman or any API client to interact with the endpoints.
