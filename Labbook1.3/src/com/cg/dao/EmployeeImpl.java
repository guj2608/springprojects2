package com.cg.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;


@Repository("rep")
public class EmployeeImpl implements Employee {

	@Value("15")
	int empid;
	
	@Value("NITISH")
	int empname;
	
	@Value("150000")
	double salary;
	
	
	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public int getEmpname() {
		return empname;
	}


	public void setEmpname(int empname) {
		this.empname = empname;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public void getedetails() {
		// TODO Auto-generated method stub
		System.out.println("eId"+empid);
		System.out.println("eName"+empname);
		System.out.println("eId"+salary);
		
		
		
	}

}
