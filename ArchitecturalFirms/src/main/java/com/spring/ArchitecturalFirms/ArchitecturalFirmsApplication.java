package com.spring.ArchitecturalFirms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication

@OpenAPIDefinition(
		info =@Info(
				title = "Architect Firm",
				version = "1.1.2",
				description = "Firm Project",
				contact = @Contact(
						name = "Aishwarya",
						email = "aishwaryas2307@gmail.com"
						)
				)
		)
public class ArchitecturalFirmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchitecturalFirmsApplication.class, args);
	}

}
