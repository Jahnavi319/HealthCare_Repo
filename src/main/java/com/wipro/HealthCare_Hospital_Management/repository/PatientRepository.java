package com.wipro.HealthCare_Hospital_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.HealthCare_Hospital_Management.dto.PatientDto;
import com.wipro.HealthCare_Hospital_Management.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

	PatientDto save(PatientDto patientDto);

	//Patient findById(Patient patient);

}
