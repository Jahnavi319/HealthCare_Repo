package com.wipro.healthcare_hospital_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.healthcare_hospital_management.dto.AppointmentDto;
import com.wipro.healthcare_hospital_management.dto.DoctorDto;
import com.wipro.healthcare_hospital_management.dto.MedicalRecordDto;
import com.wipro.healthcare_hospital_management.entity.Doctor;
import com.wipro.healthcare_hospital_management.entity.MedicalRecord;
import com.wipro.healthcare_hospital_management.service.MedicalRecordService;


@RestController
@RequestMapping("/api/medicalrecords")
public class MedicalRecordController {
    
	    private MedicalRecordService medicalRecordService;

	    

	    public MedicalRecordController(MedicalRecordService medicalRecordService) {
			super();
			this.medicalRecordService = medicalRecordService;
		}

	    @PostMapping("/insert")
		public ResponseEntity<MedicalRecordDto> addMedicalRecord(@RequestBody MedicalRecordDto medicalRecordDto){
			
	        System.out.println(medicalRecordDto);
			return new ResponseEntity<>(medicalRecordService.createMedicalRecord(medicalRecordDto),HttpStatus.CREATED);
			
			
		}
	    
	    @GetMapping("/{id}")
		public ResponseEntity<MedicalRecordDto> getMedicalRecordById(@PathVariable Long id){
			
	    	MedicalRecordDto medicalRecordDto = medicalRecordService.getMedicalRecordById(id);
			return ResponseEntity.ok(medicalRecordDto);
			
		}
	    
	    @PutMapping("/update/{id}")
	    public MedicalRecord updateMedicalReocrd(@PathVariable Long id, @RequestBody MedicalRecordDto medicalRecordDto) {
	        return medicalRecordService.updateMedicalRecord(id, medicalRecordDto);
	    }


		@DeleteMapping("/delete/{id}")
		public ResponseEntity<Void> deleteMedicalRecord(@PathVariable Long id) {
			medicalRecordService.deleteMedicalRecord(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

	
}


