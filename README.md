# Catchup-Platform

This project is a platform for managing favorite sources (**FavoriteSource**) using **Java**, **Spring Boot**, and the **CQRS** (Command Query Responsibility Segregation) pattern. The project follows the principles of **Clean Architecture** to ensure a clear separation of responsibilities and facilitate maintenance.
# MEMBERS
## Aarón Alexander Avila Palacios (U201823654)

## Table of Contents

- [Description](#description)
- [Architecture](#architecture)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Technologies](#technologies)
- [Contribution](#contribution)
- [License](#license)

## Description

The platform allows users to manage their favorite sources with CRUD operations (Create, Read, Update, Delete) through a REST API. It implements the **CQRS** pattern to separate responsibilities between commands and queries, improving scalability and code organization.

## Architecture

The project follows the structure of **Clean Architecture**. It is divided into the following layers:

- **Domain**: Contains the core entities, such as `FavoriteSource`, which represent the state of the domain.
- **Application**: Contains the business logic, such as command and query services.
- **Infrastructure**: Contains repositories and the logic related to data persistence.
- **Web**: Contains controllers that handle HTTP requests and expose the REST API.

## Installation

### Prerequisites

- **Java 17** or higher
- **Maven** or **Gradle**
- **Git**

### Installation Steps

1. Clone this repository:
    ```bash
    git clone <repository-url>
    ```

2. Navigate to the project directory:
    ```bash
    cd catchup-platform
    ```

3. Build the project with **Maven**:
    ```bash
    mvn clean install
    ```

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

## Usage

The application exposes a REST API to perform CRUD operations on favorite sources (**FavoriteSource**). By default, it uses an in-memory H2 database, accessible through the H2 console.

### Access the H2 Console:
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- User: `sa`
- Password: *(empty)*

## API Endpoints

| Method | Endpoint            | Description                        |
|--------|---------------------|------------------------------------|
| GET    | `/api/favorites`     | List all favorite sources          |
| GET    | `/api/favorites/{id}`| Get a favorite source by ID        |
| POST   | `/api/favorites`     | Create a new favorite source       |
| PUT    | `/api/favorites/{id}`| Update an existing favorite source |
| DELETE | `/api/favorites/{id}`| Delete an existing favorite source |

### Example request to create a favorite source:

**POST** `/api/favorites`
```json
{
  "name": "News Source",
  "url": "https://example.com",
  "description": "A reliable news source."
}

