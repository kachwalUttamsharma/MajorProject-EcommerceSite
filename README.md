# Major Project - E-commerce Site

## Overview

This project is a microservice-based e-commerce platform built using Java Spring Boot. It includes services for user authentication, product catalog, payment processing, email notifications, and service discovery.

## Microservices

1. **User Authentication Service**: Handles user registration, login, and authentication.
2. **Product Catalog Service**: Manages product listings and categories.
3. **Payment Service**: Handles transactions and payment processing.
4. **Email Service**: Sends order confirmations and notifications.
5. **Service Discovery**: Registers and locates services dynamically.

## Tech Stack

- **Java Spring Boot**
- **Maven**
- **Spring Cloud Netflix Eureka** (Service Discovery)
- **MySQL** (Database)
- **RabbitMQ** (Message Queue)
- **Docker**

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/kachwalUttamsharma/MajorProject-EcommerceSite.git
   ```
2. Navigate to each microservice and run:
   ```bash
   mvn clean install
   ```
3. Start services using Docker Compose:
   ```bash
   docker-compose up
   ```

## Features

- User registration and authentication
- Product browsing and search
- Payment integration
- Email notifications for transactions

## Contributing

Feel free to raise issues or contribute through pull requests.

## License

This project is licensed under the MIT License.
