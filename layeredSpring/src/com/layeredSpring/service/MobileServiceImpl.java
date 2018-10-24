package com.layeredSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.layeredspring.dao.iMobileDao;




@Service("mobileservice")
public class MobileServiceImpl implements imobileService{

	@Autowired
    iMobileDao mobiledao;
	
	
	@Override
	public void getAllMobile() {
		// TODO Auto-generated method stub
		System.out.println("in service");
		mobiledao.getAllDaoMobile();
		
	}

}
