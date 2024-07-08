package com.wipro.healthcare_hospital_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.healthcare_hospital_management.dto.MedicalRecordDto;
import com.wipro.healthcare_hospital_management.entity.MedicalRecord;



@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {

	MedicalRecordDto save(MedicalRecordDto medicalRecordDto);

	

}
