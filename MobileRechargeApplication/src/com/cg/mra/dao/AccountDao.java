package com.cg.mra.dao;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountException;

public interface AccountDao {
	
	public Account getAccountDetails(String mobileNo) ;
	public double rechargeAccount(String mobileNo,double rechargeAmount) ;
	

}
