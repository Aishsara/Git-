package com.spring.Saragallery.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spring.Saragallery.Model.Saragallery;
import com.spring.Saragallery.repository.Sararepo;

@Service

public class Saraservice {
	
	@Autowired
	private Sararepo repo;
	
	public List<Saragallery> getSaragalleries()
	{
		return repo.findAll();
	}
	
	public Optional<Saragallery> getSaragallery(int sno)
	{
		return repo.findById(sno);
				
	}
	
	public Saragallery addSaragallery(Saragallery sg)
	{
		return repo.save(sg);
	}
	
	public Saragallery editSaragallery(Saragallery sg,int sno)
	{
		Saragallery sara = repo.findById(sno).orElse(null);
		if(sara!= null)
		{
			sara.setArtname(sg.getArtname());
			sara.setArtist(sg.getArtist());
			sara.setArtsize(sg.getArtsize());
			sara.setArttype(sg.getArttype());
			sara.setExhibitcount(sg.getExhibitcount());
			sara.setCountry(sg.getCountry());
			sara.setContact(sg.getContact());
			sara.setNoofart(sg.getNoofart());
			sara.setPrice(sg.getPrice());
			return repo.saveAndFlush(sara);
		}
		else {
			return null;
		}
	}
	
	public String deleteSaragallery(int sno)
	{
		repo.deleteById(sno);
		return sno+"Deleted";
	}
	
	public List<Saragallery> sorting(String artist)
	{
		return repo.findAll(Sort.by(artist).descending());
	}
	
	public List<Saragallery> pagination(int num,int size)
	{
		Page<Saragallery> p = repo.findAll(PageRequest.of(num, size));
		return p.getContent();
	}
	
	public List<Saragallery> pagesorting(int num,int size,String artist)
	{
		Page<Saragallery> p = repo.findAll(PageRequest.of(num, size,Sort.by(artist).descending()));
		return p.getContent();
	}
	
	
	
	
	
	

}
