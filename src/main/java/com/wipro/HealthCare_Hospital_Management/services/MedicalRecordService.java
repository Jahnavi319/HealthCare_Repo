package com.wipro.HealthCare_Hospital_Management.services;


import com.wipro.HealthCare_Hospital_Management.dto.MedicalRecordDto;

public interface MedicalRecordService {

    MedicalRecordDto createMedicalRecord(MedicalRecordDto medicalRecordDto);
	
	MedicalRecordDto getMedicalRecordById(Long Id);
}
