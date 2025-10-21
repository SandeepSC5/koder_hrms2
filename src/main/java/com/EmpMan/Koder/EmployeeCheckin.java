package com.EmpMan.Koder;

import java.time.LocalDate;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="employeeCheckin") //table name inside DB koder2025
public class EmployeeCheckin {
@Id
	private long id ;
	private String name;
	private long employeeid;
	private LocalDate date;
	private LocalTime checkinTime;
	private LocalTime checkoutTime;
	private long totalHr;
	public long getTotalHr() {
		return totalHr;
	}
	public void setTotalHr(long totalHr) {
		this.totalHr = totalHr;
	}
	private char status;
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public LocalTime getCheckoutTime() {
		return checkoutTime;
	}
	public void setCheckoutTime(LocalTime checkoutTime) {
		this.checkoutTime = checkoutTime;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getEmpID() {
		return employeeid;
	}
	public void setEmpID(long employeeid) {
		this.employeeid = employeeid;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getCheckinTime() {
		return checkinTime;
	}
	public void setCheckinTime(LocalTime checkinTime) {
		this.checkinTime = checkinTime;
	}
	
	
	
	
}
