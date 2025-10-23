package com.EmpMan.Koder;

import java.time.Duration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeCheckinService {
     @Autowired
	private EmployeeCheckinRepository repository;
	public void saveCheckin(EmployeeCheckin checkin) //checkin(obj) came from previous layer : controller
	{
		
		
		
		//Hrs of work employee did as per the feed
		long i=Duration.between(checkin.getCheckinTime(),checkin.getCheckoutTime()).toHours();
		if(i<0)
		{checkin.setTotalHr(0);}
		else checkin.setTotalHr(i);
		
		//status: A=absent; P=Present; H=halfday
		if((i<4)&&(i>1)) checkin.setStatus('H');
		
		else if(i<1) checkin.setStatus('A');
		
		else checkin.setStatus('P');
		
		
		
		//final submission
		repository.save(checkin);
		
	}
	
}
