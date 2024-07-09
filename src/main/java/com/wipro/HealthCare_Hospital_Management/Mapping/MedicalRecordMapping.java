package com.wipro.healthcare_hospital_management.mapping;

import com.wipro.healthcare_hospital_management.dto.MedicalRecordDto;
import com.wipro.healthcare_hospital_management.entity.MedicalRecord;

public class MedicalRecordMapping {
	
    public static MedicalRecord mapToMedicalRecord(MedicalRecordDto medicalRecordDto) {
		
	    MedicalRecord medicalRecord = new MedicalRecord();
	    
	    medicalRecord.setPatientId(medicalRecordDto.getPatientId());
	    medicalRecord.setPatientName(medicalRecordDto.getPatientName());
	    medicalRecord.setDiagnosis(medicalRecordDto.getDiagnosis());
	    medicalRecord.setTreatment(medicalRecordDto.getTreatment());
	    medicalRecord.setAppointmentId(medicalRecordDto.getAppointmentId());
	    medicalRecord.setAge(medicalRecordDto.getAge());
				
		return medicalRecord;
	}
	
	public static MedicalRecordDto mapToMedicalRecordDto(MedicalRecord medicalRecord) {
		MedicalRecordDto medicalRecordDto = new MedicalRecordDto();
				
		medicalRecordDto.setPatientId(medicalRecord.getPatientId());		
		medicalRecordDto.setPatientName(medicalRecord.getPatientName());		
		medicalRecordDto.setAge(medicalRecord.getAge());
		medicalRecordDto.setDiagnosis(medicalRecord.getDiagnosis());	
		medicalRecordDto.setTreatment(medicalRecord.getTreatment());	
		medicalRecordDto.setAppointmentId(medicalRecord.getAppointmentId());
					
	    return medicalRecordDto;
		
		
	}

}
