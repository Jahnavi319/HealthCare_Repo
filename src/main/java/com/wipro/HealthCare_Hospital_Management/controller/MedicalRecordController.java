package com.wipro.HealthCare_Hospital_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.HealthCare_Hospital_Management.dto.MedicalRecordDto;
import com.wipro.HealthCare_Hospital_Management.entity.MedicalRecord;
import com.wipro.HealthCare_Hospital_Management.services.MedicalRecordService;



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
	
}


