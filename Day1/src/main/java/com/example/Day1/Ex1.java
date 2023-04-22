package com.example.Day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex1 {
	@GetMapping("/display")
	@ResponseBody
	public String display()
	{
		return "Welcome to Spring tool";
	}
	

}
