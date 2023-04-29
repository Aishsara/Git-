package com.spring.Saragallery.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Saragallery.Model.GalleryModel;
import com.spring.Saragallery.service.GalleryService;

@RestController
@RequestMapping("/gallery")
public class GalleryController {
	
	
	@Autowired
	public GalleryService gservice;
	
	@PostMapping("/login")
	public 	String login(@RequestBody Map<String, String> loginData )
	{
		String username = loginData.get("username");
		String password = loginData.get("password");
		String result = gservice.checklogin(username, password);
		return result ;
	}
	
	@PostMapping("/add")
	public GalleryModel Add(@RequestBody GalleryModel sara)
	{
		return gservice.addUser(sara);
	}
	
	@GetMapping
	public List<GalleryModel> listall()
	{
		return gservice.getUser();
	}
	@DeleteMapping("/deleteid/{id}")
	public String delete(@PathVariable int id)
	{
		return gservice.deleteById(id);
	}
	

}
