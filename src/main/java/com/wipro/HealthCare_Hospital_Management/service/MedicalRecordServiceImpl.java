package com.wipro.healthcare_hospital_management.service;

import org.springframework.stereotype.Service;

import com.wipro.healthcare_hospital_management.dto.MedicalRecordDto;
import com.wipro.healthcare_hospital_management.entity.MedicalRecord;
import com.wipro.healthcare_hospital_management.mapping.MedicalRecordMapping;
import com.wipro.healthcare_hospital_management.repository.MedicalRecordRepository;



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