package com.spring.Saragallery.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "SaraGallery")
public class Saragallery {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Serialno")
	private int sno;
	@Column(name="artwork name")
	private String artname;
	private String artist;
	private float price;
	@Column(name="artid")
	private int contact;
	private String country;
	@Column(name="artwork type")
	private String arttype;
	@Column(name = "artwork size")
	private String artsize;
	@Column(name="no of Exhibitions")
	private int exhibitcount; 
	@Column(name="no of artworks")
	private int noofart;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<ArtistDetails> art;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getArtname() {
		return artname;
	}
	public void setArtname(String artname) {
		this.artname = artname;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getArttype() {
		return arttype;
	}
	public void setArttype(String arttype) {
		this.arttype = arttype;
	}
	
	public String getArtsize() {
		return artsize;
	}
	public void setArtsize(String artsize) {
		this.artsize = artsize;
	}
	
	public int getExhibitcount() {
		return exhibitcount;
	}
	public void setExhibitcount(int exhibitcount) {
		this.exhibitcount = exhibitcount;
	}

	
	
	public int getNoofart() {
		return noofart;
	}
	public void setNoofart(int noofart) {
		this.noofart = noofart;
	}

	public List<ArtistDetails> getArt() {
		return art;
	}
	public void setArt(List<ArtistDetails> art) {
		this.art = art;
	}
	@Override
	public String toString() {
		return "Saragallery [sno=" + sno + ", artname=" + artname + ", artist=" + artist + ", price=" + price
				+ ", contact=" + contact + ", country=" + country + ", arttype=" + arttype + ", artsize=" + artsize
				+ ", exhibitcount=" + exhibitcount + ", noofart=" + noofart + ", art=" + art + "]";
	}
	
	
	
}
