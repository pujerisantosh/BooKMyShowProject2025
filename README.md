📽️  BooKMyShowProject2025


A backend movie-ticket booking platform (Low-Level Design) built with Java + Spring Boot






🌟 Overview
This project is a low-level design and implementation of a movie-ticket booking system similar to BookMyShow. It focuses on:

Clear backend architecture

Efficient data modeling

Robust API design

Real-world booking flow & concurrency challenges

🚀 Tech Stack
Java 17+ — Core language

Spring Boot 3.x — REST API development

Maven — Build & dependency management

MySQL (or H2 in-memory) — Persistent storage

JPA/Hibernate — ORM for DB operations

Postman / RestAssured — API testing

JUnit + Mockito (Planned) — Automated unit testing

Docker (Future) — Deployment packaging

🧩 Features
User Authentication — Secure signup/login

Browse Movies & Theatres — Filter by movie or location

Show & Screen Management — Admin feature to schedule shows

Seat Selection & Booking — User can lock & confirm seats

Simulated Payment Gateway — Fake payment integration for bookings

Booking History — Retrieve past bookings

Concurrency Handling (In Progress) — Prevent double booking

⚙️ Architecture
Layered Approach:

nginx
Copy
Edit
Controller → Service → Repository → Database
Controller — REST endpoints

Service — Business logic

Repository — DB access using JPA

Entity — Database model

Exception — Custom error handling

🗃️ Database Design
Key Tables:

User — User details

Movie — Movie information

Theatre — Theatres & locations

Screen — Screens in each theatre

Show — Movie timings & screen assignments

Seat — Seat layout

Booking — User bookings

Payment — Transaction records

Relationships:

One Theatre → Many Screens

One Screen → Many Shows

One Show → Many Seats

One User → Many Bookings

(ER Diagram — To be added)

📜 Booking Flow
User logs in

Selects a movie & theatre

Picks a show time & seats

Seat lock applied (to prevent race conditions)

Simulated payment processed

Booking confirmed & stored in DB

🧪 Testing
Postman Collection — Manual API testing

RestAssured Scripts (Planned) — Automated API verification

JUnit/Mockito (Planned) — Unit & integration tests

🛠️ How to Run Locally
bash
Copy
Edit
# Clone repository
git clone https://github.com/pujerisantosh/BooKMyShowProject2025.git
cd BooKMyShowProject2025

# Build & run
./mvnw spring-boot:run
App runs on http://localhost:8080

📦 Future Improvements
✅ Implement Redis-based distributed seat locking

✅ Add Dockerfile & Docker Compose setup

✅ Deploy to AWS ECS/Elastic Beanstalk

✅ Add caching for movie listings

✅ Integrate with email/SMS notifications

📌 Author
Santosh Kumar Pujeri
📧 Email: your-email@example.com
💼 LinkedIn: linkedin.com/in/pujerisantosh
📂 GitHub: github.com/pujerisantosh
