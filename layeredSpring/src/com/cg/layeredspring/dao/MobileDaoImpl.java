package com.cg.layeredspring.dao;

import org.springframework.stereotype.Repository;




@Repository("mobiledao")
public class MobileDaoImpl implements iMobileDao {

	@Override
	public void getAllDaoMobile() {
		// TODO Auto-generated method stub
		System.out.println("in dao");
	}

}
