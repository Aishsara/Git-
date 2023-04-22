package com.example.Day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Day1Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Day1Application.class, args);
		
		Ex5 obj = new Ex5(1,"Aishwarya","Paris");
		
		ObjectMapper map = new ObjectMapper();
		String json = map.writeValueAsString(obj);
		System.out.println(json);
	}

}
