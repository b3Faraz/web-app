Getting Started with Spring Boot
Spring Boot simplifies the process of developing Java applications by eliminating the need for complex configurations. It provides an opinionated setup, built-in server support, and powerful features like auto-configuration and dependency management.

Step 1: Set Up a Spring Boot Project
The easiest way to create a Spring Boot project is by using Spring Initializr:

Go to Spring Initializr.
Select the following configurations:
Project: Maven
Language: Java
Spring Boot Version: Latest stable version
Dependencies: Spring Web (for REST APIs), Spring Boot DevTools (for hot reloading)
Click Generate to download the project as a .zip file.
Extract the project and open it in your preferred IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).
Step 2: Create the Main Application Class
Spring Boot applications start with a main class containing the @SpringBootApplication annotation.


package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
Step 3: Add a REST Controller
To create a simple REST API, define a controller using @RestController:


package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}
Step 4: Run the Application
To start the application, open the terminal and run:

sh

mvn spring-boot:run
or run the main method inside DemoApplication.java from your IDE.

Step 5: Test the API
Once the application starts, open a web browser or use Postman to test the API:

bash

http://localhost:8080/api/hello
You should see the response:


Hello, Spring Boot!
Step 6: Build and Package the Application
To build a JAR file, use:

sh

mvn clean package
Run the JAR file with:

sh

java -jar target/demo-0.0.1-SNAPSHOT.jar
