package com.wipro.healthcare_hospital_management.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public class AdminDto {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String adminname;
	private String speciality;
	private int Experience;
	private String qalification;
	private String designation;
	
	
	public AdminDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminDto(int id, String adminname, String speciality, int experience, String qalification, String designation) {
		super();
		this.id = id;
		this.adminname = adminname;
		this.speciality = speciality;
		Experience = experience;
		this.qalification = qalification;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	public String getQalification() {
		return qalification;
	}
	public void setQalification(String qalification) {
		this.qalification = qalification;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
