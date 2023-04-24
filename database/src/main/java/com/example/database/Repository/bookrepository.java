package com.example.database.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.Model.Bookdetails;
@Repository
public interface bookrepository extends JpaRepository<Bookdetails, Integer> {

}
