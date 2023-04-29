package com.spring.Saragallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Saragallery.Model.GalleryModel;
@Repository
public interface GalleryRepo extends JpaRepository<GalleryModel, Integer> {
	
	GalleryModel  findByusername(String username);

}
