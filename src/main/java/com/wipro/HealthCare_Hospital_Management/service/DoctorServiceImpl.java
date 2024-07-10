package com.wipro.healthcare_hospital_management.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.wipro.healthcare_hospital_management.dto.AppointmentDto;
import com.wipro.healthcare_hospital_management.dto.DoctorDto;
import com.wipro.healthcare_hospital_management.entity.Appointment;
import com.wipro.healthcare_hospital_management.entity.Doctor;
import com.wipro.healthcare_hospital_management.mapping.AppointmentMapping;
import com.wipro.healthcare_hospital_management.mapping.DoctorMapping;
import com.wipro.healthcare_hospital_management.repository.DoctorRepository;


@Service
public class DoctorServiceImpl implements DoctorService{

	
	private DoctorRepository doctorRepository;
	
	
	
	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}

	
/*	@Override
    public List<DoctorDto> getAllDoctors() {
		//Doctor doctor = DoctorMapping.mapToDoctor(doctorDto);
		
        return (doctorRepository.findAll().stream()).mapToDcotorDto(doctor).collect(Collectors.toList());
    }*/


	@Override
	public DoctorDto createDoctor(DoctorDto doctorDto) {
		Doctor doctor = DoctorMapping.mapToDoctor(doctorDto);
		//System.out.println("++++++++++++++++++++++++++++++++++++++"+doctor);
		Doctor savedDoctor = doctorRepository.save(doctor);
		return DoctorMapping.mapToDoctorDto(savedDoctor);
		
	}
	
	@Override
	public DoctorDto getDoctorById(Long id) {
		
		Doctor doctor = doctorRepository.findById(id).orElseThrow(()->new RuntimeException("doctor does not exist "));
		return DoctorMapping.mapToDoctorDto(doctor);
	}


	 @Override
	    public Doctor updateDoctor(Long id, DoctorDto doctorDto) {
	        Doctor existingDoctor = doctorRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Doctor not found with id: " + id));
	        existingDoctor.setDoctorId(doctorDto.getDoctorId());
	        existingDoctor.setDoctorName(doctorDto.getDoctorName()); 
	        existingDoctor.setEmail(doctorDto.getEmail());
	        existingDoctor.setYearsOfExperience(doctorDto.getYearsOfExperience());
	        existingDoctor.setSpecialization(doctorDto.getSpecialization());
	        Doctor savedDoctor = doctorRepository.save(existingDoctor);
	        return doctorRepository.save(existingDoctor);
	      //  return DoctorMapping.mapToDoctorDto(savedDoctor);
	       // return mapToD(updatedDoctor);
	    }

/*
	@Override
	public DoctorDto updateDoctor(Long id, DoctorDto doctorDto) {
		Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor does not exist"));
        Doctor updatedDoctor = doctorRepository.save(doctor);
        return DoctorMapping.mapToDoctorDto(updatedDoctor);
    }*/
	
	@Override
	public void deleteDoctor(Long id) {
		if (!doctorRepository.existsById(id)) {
            throw new RuntimeException("Doctor does not exist");
        }
        doctorRepository.deleteById(id);
		
	}

/*
	@Override
	public List<DoctorDto> getAllDoctors() {
		// TODO Auto-generated method stub
		return null;
	}
*/

	

}

