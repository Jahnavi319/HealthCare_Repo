package com.wipro.healthcare_hospital_management.service;

import com.wipro.healthcare_hospital_management.dto.MedicalRecordDto;
import com.wipro.healthcare_hospital_management.entity.MedicalRecord;

public interface MedicalRecordService {

	

	MedicalRecordDto createMedicalRecord(MedicalRecordDto medicalRecordDto);
	
	MedicalRecordDto getMedicalRecordById(Long Id);

	void deleteMedicalRecord(Long id);

	//MedicalRecord updateMedicalRecord(Long id, MedicalRecordDto medicalRecordDto);

	MedicalRecord updateMedicalRecord(Long id, MedicalRecordDto medicalRecordDto);

	
	


}
