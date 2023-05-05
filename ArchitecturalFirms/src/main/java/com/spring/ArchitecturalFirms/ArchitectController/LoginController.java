package com.spring.ArchitecturalFirms.ArchitectController;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ArchitecturalFirms.ArchitectModel.LoginModel;
import com.spring.ArchitecturalFirms.Service.LoginService;

@RestController

public class LoginController {
	
	@Autowired
	public LoginService gservice;
	
	@PostMapping("/login")
	public 	String login(@RequestBody Map<String, String> loginData )
	{
		String username = loginData.get("username");
		String password = loginData.get("password");
		String result = gservice.checklogin(username, password);
		return result ;
	}
	
	@PostMapping("/add")
	public LoginModel Add(@RequestBody LoginModel sara)
	{
		return gservice.addUser(sara);
	}
	
	@GetMapping("/get")
	public List<LoginModel> listall()
	{
		return gservice.getUser();
	}
	@DeleteMapping("/deleteid/{id}")
	public String delete(@PathVariable int id)
	{
		return gservice.deleteById(id);
	}
	


}
