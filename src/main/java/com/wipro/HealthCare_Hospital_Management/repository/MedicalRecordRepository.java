package com.wipro.HealthCare_Hospital_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.HealthCare_Hospital_Management.dto.MedicalRecordDto;
import com.wipro.HealthCare_Hospital_Management.entity.MedicalRecord;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {

	MedicalRecordDto save(MedicalRecordDto medicalRecordDto);

	//MedicalRecord findById(MedicalRecord medicalRecord);

}
