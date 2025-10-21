package com.EmpMan.Koder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service 
public class AdminService {
	@Autowired
	private AdminGetinRepository repos;

	public List<EmployeeCheckin> employeedetails() {
		// TODO Auto-generated method stub
		//System.out.println(repos.findAll());
		
		/*
		 * Gross Salary = Hourly Rate × Working Hours per Day × Working Days per Month

PF Deduction = 12% of Gross Salary
PT Deduction = ₹200 (fixed, varies by state)
TDS (Income Tax) = 5% of Gross Salary (assumed for simplicity)

Net Salary = Gross Salary - (PF + PT + TDS)
*/
	
		
		return repos.findAll();
	}

}
