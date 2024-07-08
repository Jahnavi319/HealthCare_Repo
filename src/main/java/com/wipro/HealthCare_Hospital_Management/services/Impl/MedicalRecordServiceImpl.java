package com.wipro.HealthCare_Hospital_Management.services.Impl;

import java.util.List;

import org.springframework.stereotype.Service;


import com.wipro.HealthCare_Hospital_Management.Mapping.MedicalRecordMapping;

import com.wipro.HealthCare_Hospital_Management.dto.MedicalRecordDto;

import com.wipro.HealthCare_Hospital_Management.entity.MedicalRecord;
import com.wipro.HealthCare_Hospital_Management.repository.MedicalRecordRepository;
import com.wipro.HealthCare_Hospital_Management.services.MedicalRecordService;



@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {
	
	private MedicalRecordRepository medicalRecordRepository;

	public MedicalRecordServiceImpl(MedicalRecordRepository medicalRecordRepository) {
		super();
		this.medicalRecordRepository = medicalRecordRepository;
	}
	
	@Override 
	public MedicalRecordDto createMedicalRecord(MedicalRecordDto medicalRecordDto) {
		
		
		MedicalRecord medicalRecord = MedicalRecordMapping.mapToMedicalRecord(medicalRecordDto);
		MedicalRecord savedMedicalRecord = medicalRecordRepository.save(medicalRecord);
		return MedicalRecordMapping.mapToMedicalRecordDto(savedMedicalRecord);
		
	}
	
	@Override
	public MedicalRecordDto getMedicalRecordById(Long id) {
		MedicalRecord medicalRecord = medicalRecordRepository.findById(id).orElseThrow(()->new RuntimeException("Appointment does not exist "));
		
		return MedicalRecordMapping.mapToMedicalRecordDto(medicalRecord);
	}
	

}

