package com.example.alpha.mock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MockApplication {

    public static void main(String[] args) {
        System.out.println("Mock Starting..");
        SpringApplication.run(MockApplication.class, args);
    }
}
