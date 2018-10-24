package com.cg.mra.test;

import org.junit.Assert;
import org.junit.Test;

import com.cg.mra.exception.AccountException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;


public class AccountTest {
	AccountService service = new AccountServiceImpl();
	String number;
	String name;
	boolean result;
	
	
	@Test
	public void test_1()throws AccountException{
		number = "313221";
		result = service.validatemobileNo(number);
		Assert.assertEquals(false,result);
		
	}
		
		@Test
		public void test_2()throws AccountException{
			number = "3132212323";
			result = service.validatemobileNo(number);
			Assert.assertEquals(true,result);
		}
			@Test
			public void test_3()throws AccountException{
				number = "3132212323";
				result = service.validatemobileNo(number);
				Assert.assertEquals(true,result);
		
		
		
		}
			@Test
			public void test_4()throws AccountException{
				name = "ayush";
				result = service.validatename(name);
				Assert.assertEquals(false,result);
		
		
		
		}


	}


