package com.spring.Saragallery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication

@OpenAPIDefinition(
		info =@Info(
				title = "Sara Gallery",
				version = "1.1.2",
				description = "ArtGallery Project",
				contact = @Contact(
						name = "Aishwarya",
						email = "aishwaryas2307@gmail.com"
						)
				)
		)
public class SaragalleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaragalleryApplication.class, args);
	}

}
