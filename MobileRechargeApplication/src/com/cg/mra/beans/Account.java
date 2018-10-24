package com.cg.mra.beans;

public class Account {
	private String accountType;
	private String cutomerName;
	private double accountBalance;
	
	
	public Account(String accountType, String customerName, int accountBalance) {
		// TODO Auto-generated constructor stub
		this.accountType=accountType;
		this.cutomerName=customerName;
		this.accountBalance=accountBalance;
	}

	

	public Account() {
		// TODO Auto-generated constructor stub
	}



	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getCutomerName() {
		return cutomerName;
	}
	
	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	

}
