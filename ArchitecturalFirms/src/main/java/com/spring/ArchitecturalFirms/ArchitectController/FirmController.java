package com.spring.ArchitecturalFirms.ArchitectController;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ArchitecturalFirms.ArchitectModel.Firms;
import com.spring.ArchitecturalFirms.ArchitectModel.LoginModel;
import com.spring.ArchitecturalFirms.ArchitectRepository.FirmRepo;
import com.spring.ArchitecturalFirms.Service.LoginService;

import io.swagger.v3.oas.annotations.tags.Tag;



@RestController
@RequestMapping("/firm")

public class FirmController {

	@Autowired
	FirmRepo frepo;

	@Tag(name="Adding Details" ,description=" using methods")
	
	@PostMapping("")
	public String saveDetails(@RequestBody Firms f)
	{
		frepo.save(f);
		return "Data is saved";
	}
	
	@Tag(name="Update all details",description=" update details using methods")
	
	@PutMapping("/update/{firmno}/{bno}")
	public Firms editFirms(@RequestBody Firms sg,@PathVariable int firmno,@PathVariable int bno)
	{
		Firms sara = frepo.findById(firmno).orElse(null);
		if(sara!= null)
		{
			sara.setFname(sg.getFname());
			sara.setFounded(sg.getFounded());
			sara.setHeadquarters(sg.getHeadquarters());
			sara.setKeyfounder(sg.getKeyfounder());
			sara.setRevenue(sg.getRevenue());
			sara.setStyleofwork(sg.getStyleofwork());
			sara.setDetails(sg.getDetails());
			return repo.saveAndFlush(sara);
		}
		else {
			return null;
		}
	}
	
	
	//NativeQuery
	
	
	@Autowired
	public FirmRepo repo;
	
	@GetMapping("/query")
	public List<Firms> getAll()
	{
		return repo.get();
	}
	
	
	@GetMapping("/queryget/{firmno}")
	public List<Firms> getdetails(@PathVariable int firmno)
	{
		return repo.getD(firmno);
	}
	
	
	@PutMapping("/queryupdate/{firmno}/{fname}")
	public void updateDetails(@PathVariable int firmno,@PathVariable String fname)
	{
		 repo.update(firmno,fname); 
	}
	
	
	
	@DeleteMapping("/deletequery/{firmno}/{fname}")
	public String deleteDetails(@PathVariable int firmno,@PathVariable String fname)
	{
		
		repo.deleteById(firmno,fname);
		return "Deleted Successfully";
	}
	
	
	@DeleteMapping("/delete/{firmno}")
	public String deleteD(@PathVariable int firmno)
	{
		
		repo.delete(firmno);
		return "Deleted Successfully";
	}
	
	

	
	//jpql
	
		@GetMapping("/jpql/{firmno}")
	public List<Firms> get(@PathVariable int firmno)
	{
		return repo.getDetails(firmno);
	}
	
	
	
	@GetMapping("/jpql/like")
	public List<Firms> getHFirms()
	{
		return repo.getH();
	}
	
	
	

	@GetMapping("/jqpl/between/{firmno}/{firmid}")
	public List<Firms> getR(@PathVariable int firmno,@PathVariable int firmid)
	{
		return repo.getRange(firmno,firmid);
	}
	

	@PutMapping("/jqpl/update/{firmno}/{fname}")
	public void update(@PathVariable int firmno,@PathVariable String fname)
	{
		 repo.updateJpql(firmno,fname);
	}

	@DeleteMapping("/jqpl/delete/{firmno}")
	public void getR(@PathVariable int firmno)
	{
	repo.deleteJpql(firmno);
	}
	
	
	
	@GetMapping("/jqpl/in")
	public List<Firms> getDetails()
	{
		return repo.getD();
	}
	
	
	//Login
	
	@Autowired
	 LoginService gservice;
	
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


