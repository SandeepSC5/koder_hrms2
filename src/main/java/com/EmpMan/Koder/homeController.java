package com.EmpMan.Koder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class homeController {
	@GetMapping("/")
	public String home()
	{
		// TODO Auto-generated method stub
        return "index";
	}
	
	@GetMapping("/time")
	public String timesheet()
	{
		return "time";
	}
//	
//	@GetMapping("/salary")
//	public String salary()
//	{
//		return "salary";
//	}

}
