package com.spring.MedicineDispenser.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.MedicineDispenser.Model.MedicineModel;
import com.spring.MedicineDispenser.Repositiory.MdeicineRepo;

public class Medicinecontroller {

@RestController
@RequestMapping("/medicine")
public class Controller
{
	@Autowired
	private MdeicineRepo repo;
	
	 @GetMapping("/patient/{patientId}")
	    public ResponseEntity<Optional<MedicineModel>> getMedicineDetailsByPatientId(@PathVariable int patientId) {
		 Optional<MedicineModel> medicine = repo.findById(patientId);
	        if (medicine != null) {
	            return ResponseEntity.ok(medicine);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	 
	    @PostMapping("/add")
	    public MedicineModel addMedicine(@RequestBody MedicineModel medicine) {
	        return repo.save(medicine);
	    }

	    // Get all medicines
	    @GetMapping("/all")
	    public List<MedicineModel> getAllMedicines() {
	        return repo.findAll();
	    }

}
}
