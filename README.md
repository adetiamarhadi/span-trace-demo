# Spring Boot Tracing Demo

This is a simple Spring Boot application that demonstrates how to print trace IDs and span IDs in logs without sending trace data to Zipkin.

## Features

- **Spring Boot 3.3.3**: The application is built using Spring Boot 3.3.3.
- **Micrometer Tracing**: Uses Micrometer Tracing to handle distributed tracing.
- **Logging Trace IDs**: Logs trace IDs and span IDs in the application logs.
- **No Zipkin Export**: Configured not to export trace data to Zipkin or any other tracing backend.

## Prerequisites

- Java 17 or higher
- Maven

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/adetiamarhadi/span-trace-demo.git
cd span-trace-demo
```

### Run Apps

```bash
mvn spring-boot:run
```

### Hit Endpoint

```bash
curl -X GET http://localhost:8080/v1
curl -X POST http://localhost:8080/v1
```