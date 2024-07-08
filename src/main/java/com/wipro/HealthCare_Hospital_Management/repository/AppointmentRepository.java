package com.wipro.healthcare_hospital_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.healthcare_hospital_management.dto.AppointmentDto;
import com.wipro.healthcare_hospital_management.entity.Appointment;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	AppointmentDto save(AppointmentDto appointmentdto);

	//Appointment findById(Appointment appointment);

}

