package com.wipro.HealthCare_Hospital_Management.Mapping;



import com.wipro.HealthCare_Hospital_Management.dto.MedicalRecordDto;

import com.wipro.HealthCare_Hospital_Management.entity.MedicalRecord;

public class MedicalRecordMapping {
	
public static MedicalRecord mapToMedicalRecord(MedicalRecordDto medicalRecordDto) {
		
	MedicalRecord medicalRecord = new MedicalRecord();
				
	    medicalRecord.setId(medicalRecordDto.getId());		
	    medicalRecord.setPatientName(medicalRecordDto.getPatientName());		
	    medicalRecord.setage(medicalRecordDto.getAge());
	    medicalRecord.setDateOfRecord(medicalRecordDto.getDateOfRecord());	
	    medicalRecord.setTreatment(medicalRecordDto.getTreatment());	
	    medicalRecord.setDiagnosis(medicalRecordDto.getDiagnosis());
				
		return medicalRecord;
	}
	
	public static MedicalRecordDto mapToMedicalRecordDto(MedicalRecord medicalRecord) {
		
		MedicalRecordDto medicalRecordDto = new MedicalRecordDto();
				
		medicalRecordDto.setId(medicalRecord.getId());		
		medicalRecordDto.setPatientName(medicalRecord.getPatientName());		
		medicalRecordDto.setAge(medicalRecord.getage());
		medicalRecordDto.setDateOfRecord(medicalRecord.getDateOfRecord());	
		medicalRecordDto.setTreatment(medicalRecord.getTreatment());	
		medicalRecordDto.setDiagnosis(medicalRecord.getDiagnosis());
					
	    return medicalRecordDto;
		
		
	}

}
