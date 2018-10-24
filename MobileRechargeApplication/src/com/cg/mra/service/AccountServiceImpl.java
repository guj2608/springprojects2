package com.cg.mra.service;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.AccountException;


public class AccountServiceImpl implements AccountService {
AccountDao dao;
	
	public AccountServiceImpl(){
		dao = new AccountDaoImpl();
	}

	@Override
	public Account getAccountDetails(String mobileNo) {

			return dao.getAccountDetails(mobileNo);
		
	}

	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) {

		
		return dao.rechargeAccount(mobileNo, rechargeAmount);
	}
	
	@Override
	public boolean validatemobileNo(String mob) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("[0-9]{10}");
		Matcher mat= pat.matcher(mob);
		return mat.matches();
	}
	@Override
	public boolean validatename(String name) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("[Vaishali][Megha][Vikas][Anju][Tushar]");
		Matcher mat= pat.matcher(name);
		return mat.matches();
	
	}
}
