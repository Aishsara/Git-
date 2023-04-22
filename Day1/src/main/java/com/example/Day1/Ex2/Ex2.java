package com.example.Day1.Ex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex2 {
		public String name="Aishwarya";
		@GetMapping("/setname")
		public String getName()
		{
			return "Welcome "+name;
		}
}
