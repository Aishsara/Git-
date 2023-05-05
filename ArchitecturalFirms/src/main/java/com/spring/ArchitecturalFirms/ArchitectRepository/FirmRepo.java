package com.spring.ArchitecturalFirms.ArchitectRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.ArchitecturalFirms.ArchitectModel.Firms;


import jakarta.transaction.Transactional;

public interface FirmRepo extends JpaRepository<Firms, Integer> {

	//native
	
		@Query(value="select * from firms ",nativeQuery=true)
		public List<Firms> get();
		
		@Query(value="select * from firms where firmno = ?1", nativeQuery = true)
		public List<Firms> getD(@Param("firmno") int firmno);
		
		@Modifying
		@Transactional
		@Query(value="update firms set firmno =:firmno where fname =:fname",nativeQuery=true)
		public void  update(@Param("firmno") int firmno,@Param("fname") String fname);
		
	
		@Modifying
		@Transactional
		@Query(value="delete from firms where firmno=:firmno and fname =:fname",nativeQuery=true)
		Integer deleteById(@Param("firmno") int firmno,@Param("fname") String fname);
		
		@Modifying
		@Transactional
		@Query(value="delete from firms where firmno=:firmno ",nativeQuery=true)
		Integer delete(@Param("firmno") int firmno);
		
	
	
	

		//jpql
		
		@Query(value="select c from Firms c where firmno =?1",nativeQuery = false)
		public List<Firms> getDetails(@Param("firmno") int firmno);
		
		@Query(value="select f from Firms f where  fname like '%i'",nativeQuery = false)
		public List<Firms> getH();
		
		@Query(value="select f from Firms f where  firmno between ?1 and ?2",nativeQuery=false)
		public List<Firms> getRange(@Param("firmno") int firmno,@Param("firmno") int firmid);
		
		
		@Query(value="select f from Firms f where  fname  in ('Gensler') ",nativeQuery=false)
		public List<Firms> getD();
		
		@Query(value="update Firms f set  firmno=:firmno where fname=:fname")
		public void updateJpql(@Param("firmno") int firmno,@Param("fname") String fname);
		
		@Query(value="delete from Firms where firmno=:firmno ")
		public Integer deleteJpql(@Param("firmno")int firmno);
}

