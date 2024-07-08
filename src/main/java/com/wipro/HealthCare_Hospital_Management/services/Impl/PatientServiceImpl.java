package com.wipro.HealthCare_Hospital_Management.services.Impl;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;

import com.wipro.HealthCare_Hospital_Management.Mapping.PatientMapping;
import com.wipro.HealthCare_Hospital_Management.dto.PatientDto;
import com.wipro.HealthCare_Hospital_Management.entity.Patient;
import com.wipro.HealthCare_Hospital_Management.repository.PatientRepository;
import com.wipro.HealthCare_Hospital_Management.services.PatientService;
 
@Service
public class PatientServiceImpl implements PatientService{

	private PatientRepository patientRepository;
	

	public PatientServiceImpl(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}
	
	@Override
	public PatientDto createPatient(PatientDto patientDto) {
		
		Patient patient = PatientMapping.mapToPatient(patientDto);
		Patient savedPatient = patientRepository.save(patient);
		return PatientMapping.mapToPatientDto(savedPatient);
	} 
	@Override
	public PatientDto getPatientById(Long id) {
		Patient patient = patientRepository.findById(id).orElseThrow(()->new RuntimeException("Patient does not exist "));
		
		return PatientMapping.mapToPatientDto(patient);
		
	}
}
	
