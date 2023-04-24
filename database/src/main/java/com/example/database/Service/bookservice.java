package com.example.database.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.database.Model.Bookdetails;
import com.example.database.Repository.bookrepository;

@Service
public class bookservice {

	@Autowired
	public bookrepository book;
	public Bookdetails savenInfo(Bookdetails b)
	{
		return book.save(b);
	}
	public List<Bookdetails> viewInfo(){
		return book.findAll();
	}
}
