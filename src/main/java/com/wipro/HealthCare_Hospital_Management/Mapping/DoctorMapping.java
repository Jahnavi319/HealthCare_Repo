package com.wipro.healthcare_hospital_management.mapping;

import com.wipro.healthcare_hospital_management.dto.DoctorDto;
import com.wipro.healthcare_hospital_management.entity.Doctor;

public class DoctorMapping {
	
	public static Doctor mapToDoctor(DoctorDto doctorDto) {
		
		Doctor doctor = new Doctor();
		
		doctor.setDoctorId(doctorDto.getDoctorId());
		doctor.setDoctorName(doctorDto.getDoctorName());
		doctor.setEmail(doctorDto.getEmail());
		doctor.setYearsOfExperience(doctorDto.getYearsOfExperience());
		doctor.setSpecialization(doctorDto.getSpecialization());
		
		
		return doctor;
		
	}
	
	public static DoctorDto mapToDoctorDto(Doctor doctor) {
		
		DoctorDto doctorDto = new DoctorDto();
		
		doctorDto.setDoctorId(doctor.getDoctorId());
		doctorDto.setDoctorName(doctor.getDoctorName());
		doctorDto.setEmail(doctor.getEmail());
		doctorDto.setSpecialization(doctor.getSpecialization());
		doctorDto.setYearsOfExperience(doctor.getYearsOfExperience());
		
		return doctorDto;
		
	}

}
