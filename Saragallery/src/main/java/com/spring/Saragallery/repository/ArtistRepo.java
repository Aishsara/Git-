package com.spring.Saragallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Saragallery.Model.ArtistDetails;

public interface ArtistRepo extends JpaRepository<ArtistDetails, Integer> {

}
