package com.guru99bank.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.guru99bank.pages.Loginpage;
import com.guru99bank.pages.NewCustomerpage;

import commonlibs.implementation.Commondriver;

public class BaseTestClass {
	Commondriver cmndriver;
	String BrowserType = "Chrome";
	String url = "http://demo.guru99.com/v1";
	Loginpage loginpage;
	NewCustomerpage newcustomerpage;
	WebDriver driver;
	
	@BeforeClass
	public void invokebrowser() throws Exception{
		cmndriver = new Commondriver(BrowserType);
		cmndriver.setPageloadtimeout(60);
		cmndriver.setElementdetectiontimeout(10);
		cmndriver.gotourl(url);
		
		driver = cmndriver.getDriver(); // here we are assigning the cmndriver instance to driver.
	loginpage = new Loginpage(driver);
		newcustomerpage = new NewCustomerpage(driver);
		
		
		
	}
	
	
	@AfterClass
	public void closebrowser() throws Exception {
		//cmndriver.closeallbrowsers();
		
		
	}

}
