package com.EmpMan.Koder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeavesService {

	@Autowired
	private LeavesRepository leavesrepository;
	public void addleaves(LeavesModel leavesmodel) {
		// TODO Auto-generated method stub
		
		leavesrepository.save(leavesmodel);
	}


}
