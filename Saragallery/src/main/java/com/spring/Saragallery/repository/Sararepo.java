package com.spring.Saragallery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.spring.Saragallery.Model.Saragallery;

import jakarta.transaction.Transactional;
@Repository

public interface Sararepo extends JpaRepository<Saragallery, Integer> {
	
	
	
	//native
	
	@Query(value="select * from sara_gallery ",nativeQuery=true)
	public List<Saragallery> get();
	
	@Query(value="select * from sara_gallery where serialno = ?1", nativeQuery = true)
	public List<Saragallery> getD(@Param("id") int pid);
	
	@Modifying
	@Transactional
	@Query(value="update sara_gallery set serialno =:id where country =:country",nativeQuery=true)
	public void  update(@Param("id") int id,@Param("country") String country);
	
	
	@Modifying
	@Transactional
	@Query(value="delete from sara_gallery where serialno=:id and artist =:artist",nativeQuery=true)
	Integer deleteById(@Param("id") int id,@Param("artist") String artist);
	
	@Modifying
	@Transactional
	@Query(value="delete from sara_gallery where serialno=:serialno ",nativeQuery=true)
	Integer delete(@Param("serialno") int sno);
	
	
	//jpql
	@Query(value="select c from Saragallery c where sno =?1",nativeQuery = false)
	public List<Saragallery> getDetails(@Param("id") int id);
	
	@Query(value="select c from Saragallery c where  artist like '%e'",nativeQuery = false)
	public List<Saragallery> getH();
	
	@Query(value="select c from Saragallery c where  sno between ?1 and ?2",nativeQuery=false)
	public List<Saragallery> getRange(@Param("sno") int id,@Param("sno") int sid);
	
	
	@Query(value="select c from Saragallery c where  country  in ('Georgia') ",nativeQuery=false)
	public List<Saragallery> getD();
	

	
	}
	
	


