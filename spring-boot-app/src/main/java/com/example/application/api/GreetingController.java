package com.example.application.api;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/hello")
    public GreetingResponse hello() {
        return new GreetingResponse("Hello from Spring Boot", Instant.now());
    }

    @GetMapping("/health")
    public HealthResponse health() {
        return new HealthResponse("UP");
    }

    public record GreetingResponse(String message, Instant timestamp) {
    }

    public record HealthResponse(String status) {
    }
}