package com.microservice.webapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.microservice"})
public class Webapp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Webapp1Application.class, args);
	}

}
