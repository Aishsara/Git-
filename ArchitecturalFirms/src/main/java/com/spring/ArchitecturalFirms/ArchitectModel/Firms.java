package com.spring.ArchitecturalFirms.ArchitectModel;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity

public class Firms {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int firmno;
	private String  fname;
	private String styleofwork;
	private String  headquarters;
	private int founded;
	private String keyfounder;
	private String revenue;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<TopBuildings> details;
	public int getFirmno() {
		return firmno;
	}
	public void setFirmno(int firmno) {
		this.firmno = firmno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public List<TopBuildings> getDetails() {
		return details;
	}
	public void setDetails(List<TopBuildings> details) {
		this.details = details;
	}
	public String getHeadquarters() {
		return headquarters;
	}
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}
	public String getStyleofwork() {
		return styleofwork;
	}
	public void setStyleofwork(String styleofwork) {
		this.styleofwork = styleofwork;
	}
	public int getFounded() {
		return founded;
	}
	public void setFounded(int founded) {
		this.founded = founded;
	}
	public String getKeyfounder() {
		return keyfounder;
	}
	public void setKeyfounder(String keyfounder) {
		this.keyfounder = keyfounder;
	}
	public String getRevenue() {
		return revenue;
	}
	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}
	
	
	

}
