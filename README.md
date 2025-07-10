# 📽️ BooKMyShowProject2025

This is a low-level design and implementation of a movie ticket booking platform like BookMyShow. It covers user management, movie/show management, theatre setup, seat booking, and payment simulation.

---

## 🚀 Tech Stack

- Java 17+
- Spring Boot
- Maven
- MySQL (or H2 for in-memory)
- JPA/Hibernate
- Postman/RestAssured (for API testing)

---

## 🧩 Features

- ✅ User Registration/Login
- 🎬 Browse Movies & Theatres
- 🕒 Show Management (Timing, Screens)
- 💺 Seat Selection & Booking
- 💳 Payment Simulation
- 📜 Booking History

---

## ⚙️ Modules (Structure in `src/`)

- `controller` – REST APIs
- `service` – Business logic
- `model/entity` – DB models
- `repository` – Spring Data JPA interfaces
- `exception` – Custom exception handling

---

## 🗃️ Database Design

### Tables
`User`, `Movie`, `Theatre`, `Screen`, `Show`, `Seat`, `Booking`, `Payment`

### Relationships
- One **Theatre** → Many **Screens**
- One **Screen** → Many **Shows**
- One **Show** → Many **Seats**
- One **User** → Many **Bookings**

---

## ⚠️ Booking Concurrency (In Progress)

Seat locking mechanism is planned to prevent multiple users from booking the same seat simultaneously.

---

## 🧪 Testing

- ✅ APIs tested using Postman
- 🧪 Unit tests in `src/test` (TBD)

---

## 🛠️ Run Locally

```bash
git clone https://github.com/pujerisantosh/BooKMyShowProject2025.git
cd BooKMyShowProject2025
./mvnw spring-boot:run
