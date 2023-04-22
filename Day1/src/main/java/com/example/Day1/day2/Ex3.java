package com.example.Day1.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex3 {
	
	@Value("Interesting World")
	public String x;
	@RequestMapping("/world")
	@ResponseBody
	public String display1()
	{
		return x;
	}

}
