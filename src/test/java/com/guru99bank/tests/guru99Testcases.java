package com.guru99bank.tests;

import org.testng.annotations.Test;


public class guru99Testcases extends BaseTestClass{
	
	@Test
	public void verifylogindetails() throws Exception {
		
		String userid = "mngr325982";
		String passwrd = "gYsymYvfsa";
		loginpage.login(userid, passwrd);

}
}
