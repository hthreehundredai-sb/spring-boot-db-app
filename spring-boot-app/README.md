# Spring Boot App

A starter Spring Boot application built with Maven and Java.

## Run locally

```bash
mvn -f spring-boot-app/pom.xml spring-boot:run
```

The server listens on `http://localhost:8080` by default. Set `PORT` to use a
different port.

## Endpoints

- `GET /api/health` — returns the application health status
- `GET /api/hello` — returns a sample greeting and timestamp

## Test

```bash
mvn -f spring-boot-app/pom.xml test
```