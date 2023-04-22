package com.example.Day1.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex4 {
	
	@Value("${moviename}")
	public String mname;
	
	@GetMapping("/mname")
	@ResponseBody
	public String Movie()
	{
		return "My favourite Movie :"+mname;
	}

}
