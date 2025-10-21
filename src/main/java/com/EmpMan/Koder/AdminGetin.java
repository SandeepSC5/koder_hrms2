package com.EmpMan.Koder;





	import java.time.LocalDate;

	import java.time.LocalTime;

	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	
	//@Table(name="employeeCheckin") //table name inside DB koder2025
	public class AdminGetin {
	@Id
		private long id ;
		private String name;
		private long employeeid;
		private long totalHr;
		public long getEmployeeid() {
			return employeeid;
		}
	
		private LocalDate date;
		private char status;
		
		
		public long getTotalHr() {
			return totalHr;
		}
	
		public char getStatus() {
			return status;
		}
	
		public long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public long getEmpID() {
			return employeeid;
		}
	
		public LocalDate getDate() {
			return date;
		}
	

		
		
		
		
	}
