package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;


public class MainUI {

	public static void main(String[] args) throws AccountException {
		// TODO Auto-generated method stub
		AccountService service = new AccountServiceImpl();
		Account account=new Account(); 
		
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		
		String mobileNo;
		Double amount;
		
		while(ch != 3){
			
			System.out.println("1.Account Balance Enquiry");
			System.out.println("2.Recharge Account");
			System.out.println("3.Exit");
			
			ch = sc.nextInt();
			
			switch(ch) {
			
			
			case 1 :
				
				System.out.println("Enter Mobile No.");
				mobileNo =sc.next();
				
					if( service.validatemobileNo( mobileNo)!=false){}
					else
						
					
						System.out.println("Invalid details entered...");
				
				Account acc=new Account();
				acc= service.getAccountDetails(mobileNo);
				System.out.println("Your Current Balance is Rs."+acc.getAccountBalance());
				break;
			
			
			case 2:
				System.out.println("Enter Mobile No.");
				mobileNo =sc.next();
			
					
					// TODO Auto-generated catch block
		
				System.out.println("Enter Recharge Amount");
				amount =sc.nextDouble();
				
				
				Account acco=new Account();
				double cmount=service.rechargeAccount(mobileNo, amount);
				acco.setAccountBalance(cmount);
				System.out.println("Your Account Recharged successfully");
				System.out.println("hello new Available Balance is"+ acco.getAccountBalance());
				break;
			}
			
	}

	}}
