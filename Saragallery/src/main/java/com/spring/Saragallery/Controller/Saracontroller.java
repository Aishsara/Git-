package com.spring.Saragallery.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.Saragallery.Model.Saragallery;
import com.spring.Saragallery.repository.Sararepo;
import com.spring.Saragallery.service.Saraservice;

import io.swagger.v3.oas.annotations.tags.Tag;



@RestController
@RequestMapping("/api")
@CrossOrigin
public class Saracontroller {
	
	@Autowired
	private Saraservice service;
	
	@GetMapping("/hi")
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
	
	@GetMapping("/sorting/{artist}")
	public List<Saragallery> sorting(@PathVariable String artist)
	{
		return service.sorting(artist);
	}
	@GetMapping("/sortingasc/{artist}")
	public List<Saragallery> sortingAsc(@PathVariable String artist)
	{
		return service.sortingAsc(artist);
	}
	
	@GetMapping("/pagination/{num}/{size}")
	public List<Saragallery> pagination(@PathVariable int num,@PathVariable int size)
	{
		return service.pagination(num, size);
	}
	
	@GetMapping("/pagesorting/{num}/{size}/{artist}")
	public List<Saragallery> pagesorting(@PathVariable int num,@PathVariable int size,@PathVariable String artist)
	{
		return service.pagesorting(num, size, artist);
	}
	
	
	//Native Query
	@Autowired
	public Sararepo repo;
	
	@Tag(name="Get All details",description="gets all the details")
	@GetMapping("/query")
	public List<Saragallery> getAll()
	{
		return repo.get();
	}
	
	@GetMapping("/queryget/{pid}")
	public List<Saragallery> getdetails(@PathVariable int pid)
	{
		return repo.getD(pid);
	}
	
	@Tag(name="Query Update",description=" update the id using native query")
	@PutMapping("/queryupdate/{id}/{country}")
	public void updateDetails(@PathVariable int id,@PathVariable String country)
	{
		 repo.update(id,country);
	}
	
	
	@Tag(name ="Delete Query",description="deletes all details using native query")
	@DeleteMapping("/deletequery/{id}/{artist}")
	public String deleteDetails(@PathVariable int id,@PathVariable String artist)
	{
		
		repo.deleteById(id,artist);
		return "Deleted Successfully";
	}
	
	
	@DeleteMapping("/delete/{firmno}")
	public String deleteD(@PathVariable int firmno)
	{
		
		repo.delete(firmno);
		return "Deleted Successfully";
	}
	
	
	//JQPL
	
	
	@GetMapping("/jpql/{id}")
	public List<Saragallery> getAll(@PathVariable int id)
	{
		return repo.getDetails(id);
	}
	
	
	
	
	@GetMapping("/jpql/like")
	public List<Saragallery> getHSaragalleries()
	{
		return repo.getH();
	}
	
	
	
	
	@GetMapping("/jqpl/between/{id}/{sid}")
	public List<Saragallery> getRSaragalleries(@PathVariable int id,@PathVariable int sid)
	{
		return repo.getRange(id,sid);
	}
	
	
	
	@GetMapping("/jqpl/in")
	public List<Saragallery> getDetails()
	{
		return repo.getD();
	}
	
	
	
	
}

