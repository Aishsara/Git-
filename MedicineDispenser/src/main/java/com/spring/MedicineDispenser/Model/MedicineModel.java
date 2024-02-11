package com.spring.MedicineDispenser.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Prescription")
public class MedicineModel {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int patientId; // Patient ID associated with the medicine
	    private String medicineName;
	    private boolean takeMorning;
	    private boolean takeAfternoon;
	    private boolean takeNight;
	    
	    
	
		public int getPatientId() {
			return patientId;
		}
		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}
		public String getMedicineName() {
			return medicineName;
		}
		public void setMedicineName(String medicineName) {
			this.medicineName = medicineName;
		}
		public boolean isTakeMorning() {
			return takeMorning;
		}
		public void setTakeMorning(boolean takeMorning) {
			this.takeMorning = takeMorning;
		}
		public boolean isTakeAfternoon() {
			return takeAfternoon;
		}
		public void setTakeAfternoon(boolean takeAfternoon) {
			this.takeAfternoon = takeAfternoon;
		}
		public boolean isTakeNight() {
			return takeNight;
		}
		public void setTakeNight(boolean takeNight) {
			this.takeNight = takeNight;
		}
		@Override
		public String toString() {
			return "MedicineModel [patientId=" + patientId + ", medicineName=" + medicineName
					+ ", takeMorning=" + takeMorning + ", takeAfternoon=" + takeAfternoon + ", takeNight=" + takeNight
					+ "]";
		}

	  
	}



