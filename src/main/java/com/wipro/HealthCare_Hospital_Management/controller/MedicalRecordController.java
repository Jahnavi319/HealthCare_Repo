package com.wipro.HealthCare_Hospital_Management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.HealthCare_Hospital_Management.dto.MedicalRecordDto;
import com.wipro.HealthCare_Hospital_Management.entity.MedicalRecord;
import com.wipro.HealthCare_Hospital_Management.repository.MedicalRecordRepository;

@RestController
@RequestMapping("/api/medical_record")
public class MedicalRecordController {
	
	private MedicalRecordRepository medicalRecordRepository;

	public MedicalRecordController(MedicalRecordRepository medicalRecordRepository) {
		super();
		this.medicalRecordRepository = medicalRecordRepository;
	}

	@RequestMapping("/insert")
	public MedicalRecordDto createMedicalRecord(@RequestBody MedicalRecordDto medicalRecordDto) {
		
		return medicalRecordRepository.save(medicalRecordDto);
		
	}
	
	@GetMapping
	public List<MedicalRecord> getAllMedicalRecord(){
		return medicalRecordRepository.findAll();
		
	}
}
