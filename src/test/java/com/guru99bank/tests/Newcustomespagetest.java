package com.guru99bank.tests;





import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commonlibs.implementation.CommonExcelsheet;


public class Newcustomespagetest extends BaseTestClass{

 CommonExcelsheet data = new CommonExcelsheet("C:\\Users\\Chinna\\Documents\\test.xlsx");
 String expected = "adjhhbfvhj";
 String name = "jkdvbfcsj";
 @BeforeMethod
	public void verifylogindetails() throws Exception {
		
		String userid = "mngr325982";
		String passwrd = "gYsymYv";
		newcustomerpage.login(userid, passwrd);
}

	@Test
	
	public void newcustomernametest() throws Exception {
		for(int i = 0; i<7; i++) {
	String testdata = data.getdatafromExcel(0, i, 0);
	String Actual =	newcustomerpage.newcustomername(testdata);
	System.out.println(Actual);
	assertEquals(Actual, "Numbers are not allowed");
	}
	}
}