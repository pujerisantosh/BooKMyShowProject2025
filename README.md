🎬 BookMyShow Project 2025
📌 Overview
This project is a Low-Level Design (LLD) and Implementation of a Movie Ticket Booking System similar to BookMyShow.
It supports movie catalog browsing, theatre and screen management, seat booking, payments, cancellations, and dynamic pricing — designed for scalability and concurrency.

🚀 Features
User Management (Registration, Login, Profile Management)

Movie Catalog (Search by movie, theatre, or location)

Theatre & Screen Management

Seat Booking System (Locking, Payment, Confirmation)

Dynamic Pricing (Time-based and seat-type pricing)

Cancellation & Refund

Bulk Booking Support

Facilities Information for theatres (e.g., parking, food, accessibility)

🛠 Tech Stack
Layer	Technology Used
Language	Java 17
Framework	Spring Boot
Database	MySQL / In-Memory H2 (for testing)
API Testing	Rest Assured
Build Tool	Maven
Version Control	Git, GitHub
CI/CD	Bitbucket Pipelines / Jenkins
Cloud	AWS (Lambda, EC2, RDS)

📂 Project Structure
bash
Copy
Edit
BooKMyShowProject2025/
│── src/
│   ├── main/
│   │   ├── java/com/bookmyshow/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   ├── model/
│   │   │   └── exceptions/
│   └── test/
│       ├── java/com/bookmyshow/
│       │   ├── apitests/
│       │   └── unittest/
│
│── pom.xml
│── README.md
📜 API Endpoints (Sample)
Method	Endpoint	Description
GET	/movies	Fetch all movies
GET	/movies/{id}	Get movie details
POST	/bookings	Create a booking
DELETE	/bookings/{id}	Cancel a booking
GET	/theatres/{id}/shows	Get shows for a theatre

🔗 How to Run Locally
bash
Copy
Edit
# Clone repo
git clone https://github.com/pujerisantosh/BooKMyShowProject2025.git

# Navigate to project
cd BooKMyShowProject2025

# Build project
mvn clean install

# Run application
mvn spring-boot:run
App will be available at: http://localhost:8080

✅ Testing
bash
Copy
Edit
# Run all tests
mvn test
Includes:

Unit Tests (JUnit)

API Tests (Rest Assured)

Integration Tests

📈 Future Enhancements
Multi-currency & multilingual support

Gift cards & wallet integration

AI-powered movie recommendations

Cross-platform mobile app

👨‍💻 Author
Santosh Pujeri
Senior QA Automation Engineer | AWS Certified Solutions Architect – Associate

📧 Email: santoshpujeri@example.com
🔗 LinkedIn: linkedin.com/in/santoshpujeri
