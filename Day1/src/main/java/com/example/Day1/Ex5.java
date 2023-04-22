package com.example.Day1;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Ex5 {
	
	private int id;
	private String name;
	@JsonIgnore
	private String city;
	
	public Ex5() {}
		
	public Ex5(int id,String name,String city)
	{
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
	

	
	