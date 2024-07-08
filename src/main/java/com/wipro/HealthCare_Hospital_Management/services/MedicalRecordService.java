package com.wipro.HealthCare_Hospital_Management.services;

import java.util.List;
import java.util.Optional;

import com.wipro.HealthCare_Hospital_Management.dto.MedicalRecordDto;
import com.wipro.HealthCare_Hospital_Management.entity.MedicalRecord;

public interface MedicalRecordService {

	MedicalRecordDto createMedicalRecord(MedicalRecordDto medicalRecordDto);
	
	MedicalRecordDto getMedicalRecordById(Long Id);
	


}
