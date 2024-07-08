package com.wipro.healthcare_hospital_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.healthcare_hospital_management.dto.PatientDto;
import com.wipro.healthcare_hospital_management.service.PatientService;


@RestController
@RequestMapping("/api/patient")
public class PatientController {

	private PatientService patientService;

	public PatientController(PatientService patientService) {
		super();
		this.patientService = patientService;
	}
	@PostMapping("/insert")
	public ResponseEntity<PatientDto> addPatient(@RequestBody PatientDto patientDto){
		
        System.out.println(patientDto);
		return new ResponseEntity<>(patientService.createPatient(patientDto),HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PatientDto> getPatientById(@PathVariable Long id){
		
		PatientDto patientDto = patientService.getPatientById(id);
		return ResponseEntity.ok(patientDto);
		
	}
	
}
