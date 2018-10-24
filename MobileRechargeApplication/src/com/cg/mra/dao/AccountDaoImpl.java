package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountException;

public class AccountDaoImpl implements AccountDao{
	Map<String,Account>accountEntry;
	
		public AccountDaoImpl(){
			accountEntry=new HashMap<>();
			accountEntry.put("9010210131",new Account("Prepaid","Vaishali",200));
			accountEntry.put("9823920123",new Account("Prepaid","Megha",453));
			accountEntry.put("9932012345",new Account("Prepaid","Vikas",631));
			accountEntry.put("9010210132",new Account("Prepaid","Anju",521));
			accountEntry.put("9010210133",new Account("Prepaid","Tushar",632));
					
		}

	@Override
	public Account getAccountDetails(String mobileNo)  {
		// TODO Auto-generated method stub
		Account a=new Account();
		 a = accountEntry.get(mobileNo);
		if(a == null){
			System.out.println("ERROR Given Account Id Does Not Exist");
		}
		
		
		return accountEntry.get(mobileNo);
	}
	
	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount)  {
		// TODO Auto-generated method stub
		double amt =0;
		Account a=new Account();
		 a = accountEntry.get(mobileNo);
		if(a == null){
			System.out.println("ERROR Given Account Id Does Not Exist");
		}
		else{
		  amt=a.getAccountBalance();
		  amt += rechargeAmount;
		}

		return amt;
	}
	

}
