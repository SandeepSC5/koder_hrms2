package com.EmpMan.Koder;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService1 {
	@Autowired
	private EmployeeRepo repo;
	public List<EmployeeSummary> employeedetails(LocalDate  startDate, LocalDate endDate) {
        return repo.findByDateBetween(startDate, endDate);

}
}
