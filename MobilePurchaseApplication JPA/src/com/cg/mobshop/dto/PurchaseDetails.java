package com.cg.mobshop.dto;

import java.util.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
//@Table(name="purchasedetils") if class name is diff
public class PurchaseDetails {

	@Id  //to make attribute primary
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int purchaseId;
	
	@Column(name="cname")
	private String custName;
	
	private String mailId;
	private String phoneNo;
	private int mobileId;
	private Date purchaseDate;
	
	public PurchaseDetails(){
		purchaseDate=new Date();
	}
	
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	
}
