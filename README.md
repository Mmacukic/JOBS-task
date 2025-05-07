# Court Register Data Fetcher – Backend

## Overview

This is a Spring Boot application designed to periodically fetch data from the Croatian Court Register's public API (v3). The fetched data is mapped into DTOs and entity classes and stored in a local database. The data is exposed via RESTful endpoints for frontend consumption.

## Features

- Scheduled data fetch from the Court Register API
- DTO to Entity mapping using `EndpointProcessor` architecture
- Local data persistence (e.g., PostgreSQL)
- REST API for accessing stored business entity data

## Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL (or other RDBMS)
- Jackson (for JSON processing)
- Lombok
- Swagger/OpenAPI (optional for API docs)


## Getting Started

### Prerequisites

- Java 17+
- Maven or Gradle
- PostgreSQL (or compatible database)

### Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/Mmacukic/JOBS-task.git
   cd court-register-backend
./mvnw spring-boot:run


