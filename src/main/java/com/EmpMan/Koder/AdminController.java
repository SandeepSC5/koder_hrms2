package com.EmpMan.Koder;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
	private AdminService1  adminservice1;

    @GetMapping("/admin1")
    public List<EmployeeSummary> getAlluser(@RequestParam LocalDate startDate,
                                            @RequestParam LocalDate endDate) {
        return adminservice1.employeedetails(startDate, endDate);
    }
    
	
	
}
