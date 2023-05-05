package com.spring.Saragallery.MovieRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Saragallery.MovieModel.Movie;
@Repository
public abstract class MovieRepo implements JpaRepository<Movie, Integer> {

}
