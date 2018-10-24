package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.Employee;



@Service("service")
public class SbuImpl implements Sbu{

	@Autowired
	Employee emp;
	
	
	
	
	@Override
	public void getsbu() {
		// TODO Auto-generated method stub
		
	}

}
