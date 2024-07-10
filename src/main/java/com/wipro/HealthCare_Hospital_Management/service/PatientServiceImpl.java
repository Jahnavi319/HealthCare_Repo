package com.wipro.healthcare_hospital_management.service;

import org.springframework.stereotype.Service;

import com.wipro.healthcare_hospital_management.dto.AppointmentDto;
import com.wipro.healthcare_hospital_management.dto.DoctorDto;
import com.wipro.healthcare_hospital_management.dto.PatientDto;
import com.wipro.healthcare_hospital_management.entity.Appointment;
import com.wipro.healthcare_hospital_management.entity.Doctor;
import com.wipro.healthcare_hospital_management.entity.Patient;
import com.wipro.healthcare_hospital_management.mapping.AppointmentMapping;
import com.wipro.healthcare_hospital_management.mapping.PatientMapping;
import com.wipro.healthcare_hospital_management.repository.PatientRepository;


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
	
	@Override
    public Patient updatePatient(Long id, PatientDto patientDto) {
        Patient existingPatient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found with id: " + id));
        existingPatient.setFullName(patientDto.getFullName());
        existingPatient.setage(patientDto.getAge());
        existingPatient.setContactNumber(patientDto.getContactNumber());
        existingPatient.setAppointments(patientDto.getAppointments());
        existingPatient.setGender(patientDto.getGender());
        existingPatient.setPatientId(patientDto.getPatientId());
        existingPatient.setMedicalHistory(patientDto.getMedicalHistory());
        existingPatient.setUserName(patientDto.getUsername());
        existingPatient.setPassword(patientDto.getPassword());
        existingPatient.setNatureOfVisit(patientDto.getNatureOfVisit());
        
        Patient savedPatient = patientRepository.save(existingPatient);
        return patientRepository.save(savedPatient);
     
    }




	@Override
	public void deletePatient(Long id) {
		if (!patientRepository.existsById(id)) {
            throw new RuntimeException("patient does not exist");
        }
        patientRepository.deleteById(id);
		
	}


	
}
