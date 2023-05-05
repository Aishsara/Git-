package com.spring.ArchitecturalFirms.ArchitectModel;

import jakarta.persistence.*;

@Entity

public class TopBuildings {

	@Id
	private int bno;
	private String bname;
	private String location;
	private String associates;
	private int year;
	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAssociates() {
		return associates;
	}
	public void setAssociates(String associates) {
		this.associates = associates;
	}
	
	
}
