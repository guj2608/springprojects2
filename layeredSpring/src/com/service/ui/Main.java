package com.service.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.layeredSpring.service.MobileServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext app=new ClassPathXmlApplicationContext("spring4.xml");
    MobileServiceImpl mob=(MobileServiceImpl) app.getBean("mobileservice");
    mob.getAllMobile();
	}

}
