package com.EmpMan.Koder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeCheckinController {

    @Autowired
    private EmployeeCheckinService service; //to reach out to Service layer created an object

    @PostMapping("/checkin")
    public String handleCheckin(@ModelAttribute EmployeeCheckin checkin) {
        service.saveCheckin(checkin);
        return "redirect:/"; // or return a success page
    }
}
