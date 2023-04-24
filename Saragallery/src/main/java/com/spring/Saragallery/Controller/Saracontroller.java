package com.spring.Saragallery.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Saragallery.Model.Saragallery;
import com.spring.Saragallery.service.Saraservice;

@RestController
@RequestMapping("/api")
public class Saracontroller {
	
	@Autowired
	private Saraservice service;
	
	@GetMapping
	public  List<Saragallery> read()
	{
		return service.getSaragalleries();
	}
	@GetMapping("/{sno}")
	public Optional<Saragallery> readbyId(@PathVariable int sno)
	{
		return service.getSaragallery(sno);
	}
	@PostMapping
	public Saragallery create(@RequestBody Saragallery sg)
	{
		return service.addSaragallery(sg);
		}
	
	@PutMapping("/{sno}")
	public Saragallery update(@RequestBody Saragallery sg,@PathVariable int sno){
		return service.editSaragallery(sg, sno);
		
	}
	
	@DeleteMapping("/{sno}")
	public String delete(@PathVariable int sno)
	{
		return service.deleteSaragallery(sno);

	}
	
}
