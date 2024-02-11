package com.spring.MedicineDispenser.Repositiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.MedicineDispenser.Model.MedicineModel;

@Repository
public interface MdeicineRepo extends JpaRepository<MedicineModel, Integer>{
	 @Query(value = "SELECT * FROM MedicineModel  WHERE patientId = ?1", nativeQuery=true)
	 public List<MedicineModel> getId(@Param("patientId") int patientId);
	 
		@Query(value="select * from MedicineModel ",nativeQuery=true)
		public List<MedicineModel> get();

}
