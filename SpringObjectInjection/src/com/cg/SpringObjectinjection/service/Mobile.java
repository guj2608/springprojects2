package com.cg.SpringObjectinjection.service;

public class Mobile {
	int  mobileid;
	String mobileName;
	double mobileprice;
	Inventory invent;
	public int getmobileid() {
		return mobileid;
	}
	public void setmobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	public String getmobileName() {
		return mobileName;
	}
	public void setmobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public double getmobileprice() {
		return mobileprice;
	}
	public void setmobileprice(double mobileprice) {
		this.mobileprice = mobileprice;
	}
	public Inventory getInvent() {
		return invent;
	}
	public void setInvent(Inventory invent) {
		this.invent = invent;
	}
	
	
	public void printmobiledetails(){
		System.out.println("ID is"+mobileid+"Mobile Name is "+mobileName+"price is"+mobileprice);
		System.out.println("mobile count"+invent.mobilecount+"mobile company"+invent.mobilecompany);
	}

}
