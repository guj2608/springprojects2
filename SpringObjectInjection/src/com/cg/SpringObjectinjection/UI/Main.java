package com.cg.SpringObjectinjection.UI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.SpringObjectinjection.service.Mobile;

public class Main {
	public static void main(String args[]){
	ApplicationContext app=new ClassPathXmlApplicationContext("Spring2.xml");
	Mobile mobile=(Mobile)app.getBean("mob");
	mobile.printmobiledetails();
	

}
}