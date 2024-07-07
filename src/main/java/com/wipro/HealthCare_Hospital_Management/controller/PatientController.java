package com.wipro.HealthCare_Hospital_Management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.HealthCare_Hospital_Management.dto.PatientDto;
import com.wipro.HealthCare_Hospital_Management.entity.Patient;
import com.wipro.HealthCare_Hospital_Management.repository.PatientRepository;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
	
	private PatientRepository patientRepository;

	public PatientController(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}

	
	@PostMapping("/insert")
	public Patient createPatient(@RequestBody Patient patient) {
		return patientRepository.save(patient);
		
	}
	
	@GetMapping
	public List<Patient> getAllPatient(){
		return patientRepository.findAll();
		
	}
}
