package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountException;

public interface AccountService {
	public Account getAccountDetails(String mobileNo);
	public double rechargeAccount(String mobileNo,double rechargeAmount);
	public boolean validatemobileNo(String mob);
	public boolean validatename(String name) ;

}
