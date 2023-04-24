package com.example.database.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bookdetails {
	
	@Id
	private int sno;
	private String bname;
	private String aname;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Bookdetails [sno=" + sno + ", bname=" + bname + ", aname=" + aname + "]";
	}
	

}
