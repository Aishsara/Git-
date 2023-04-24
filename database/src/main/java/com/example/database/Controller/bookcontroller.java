package com.example.database.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.database.Model.Bookdetails;
import com.example.database.Service.bookservice;
@RestController

public class bookcontroller {
	@Autowired
	public bookservice bs;
	@GetMapping()
	public List<Bookdetails> viewDetails(){
		return bs.viewInfo();
	}
	@PostMapping("/bdetails")
	public Bookdetails addDetails(@RequestBody Bookdetails bk)
	{
		return bs.savenInfo(bk);
	}
	

}
