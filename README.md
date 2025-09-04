# Product Service

## Overview
A robust RESTful Product Service built with Spring Boot that manages product information with support for multiple data sources including a self-managed database and external fake store integration. The service implements various inheritance strategies and follows clean architecture principles.

## Technologies Used
- Java 23
- Spring Boot 3.4.3
- Spring Data JPA
- Spring Web
- Spring Modulith
- Maven
- JUnit (for testing)
- Spring Dev Tools

## Features
- CRUD operations for products
- Category management
- Multiple implementation strategies:
  - Self-managed product service
  - FakeStore integration service
- Exception handling with global error handling
- Inheritance demonstrations with different strategies:
  - Joined Table
  - Mapped SuperClass
  - Single Table
  - Table Per Class
- Custom projections for optimized queries
- RESTful API endpoints

## API Endpoints

### Products
- `GET /products` - Retrieve all products
- `GET /products/{id}` - Get a specific product by ID
- `POST /products` - Create a new product
- `PATCH /products/{id}` - Update a product partially

## Project Structure
```
src/
├── main/
│   ├── java/com/service/productservice/
│   │   ├── Configurations/
│   │   ├── Controllers/
│   │   ├── DTOs/
│   │   ├── Exceptions/
│   │   ├── Inheritance/
│   │   ├── Models/
│   │   ├── Repository/
│   │   └── Service/
│   └── resources/
└── test/
    └── java/
        └── com/service/productservice/
```

## Key Components

### Models
- `Product`: Core entity with properties like name, price, description, and image URL
- `Category`: Product categorization
- `BaseModel`: Abstract base class for common entity attributes

### Services
- `ProductService`: Interface defining product operations
- `SelfProductService`: Implementation for self-managed database
- `FakeStoreProductService`: Integration with external fake store

### Controllers
- `ProductController`: REST endpoints for product operations
- Global exception handling with `controllerAdvices`

## Getting Started

### Prerequisites
- JDK 23 or higher
- Maven 3.x

### Installation
1. Clone the repository
2. Navigate to the project directory
3. Run: `mvn clean install`
4. Start the application: `mvn spring-boot:run`

## Testing
The project includes comprehensive test coverage with:
- Unit tests for controllers
- Integration tests for services
- Application tests for end-to-end scenarios

Run tests using: `mvn test`

## Architecture
The project follows a layered architecture:
- Controller Layer: Handles HTTP requests
- Service Layer: Business logic implementation
- Repository Layer: Data access layer
- DTO Layer: Data transfer objects for API responses
- Model Layer: Domain entities

## Features Highlight
- Clean separation of concerns
- Multiple inheritance strategies demonstration
- Flexible service implementation with dependency injection
- Global exception handling
- JPA entity relationships
- RESTful API design
- Comprehensive testing
