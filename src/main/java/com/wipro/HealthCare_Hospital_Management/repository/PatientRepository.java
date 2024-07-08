package com.wipro.healthcare_hospital_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.healthcare_hospital_management.dto.PatientDto;
import com.wipro.healthcare_hospital_management.entity.Patient;



@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

	PatientDto save(PatientDto patientDto);

	//Patient findById(Patient patient);

}
