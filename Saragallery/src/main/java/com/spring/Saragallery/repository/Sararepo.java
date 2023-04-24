package com.spring.Saragallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Saragallery.Model.Saragallery;
@Repository

public interface Sararepo extends JpaRepository<Saragallery, Integer> {

}
