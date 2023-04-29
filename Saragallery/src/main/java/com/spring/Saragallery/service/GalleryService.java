package com.spring.Saragallery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Saragallery.Model.GalleryModel;
import com.spring.Saragallery.repository.GalleryRepo;

@Service
public class GalleryService {
	
	@Autowired
	public GalleryRepo repo;
	
	public String checklogin(String username,String password)
	{
		GalleryModel gallery = repo.findByusername(username);
		if(gallery==null)
		{
			return "no user found";
		}
		else {
			if(gallery.getPassword().equals(password))
			{
				return "Login Succefull";
			}
			else {
				
				return "Login Failed";
			}
			
		}
	}
	public GalleryModel addUser(GalleryModel sara)
	{
		return repo.save(sara);
	}
	public List<GalleryModel> getUser()
	{
		return repo.findAll();
	}
	public String deleteById(int id)
	{
		repo.deleteById(id);
		return "Deleted";
	}
	

}
