package com.guru99bank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Basepage{
	
	
	@FindBy(linkText = "Insurance Project")
	private WebElement InsuranceProjectlink;
	
	@FindBy(linkText = "Agile Project")
	private WebElement AgileProjectlink;
	
	@FindBy(name = "uid")
	private WebElement Userid;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "btnLogin")
	private WebElement loginbutton;
	
	@FindBy(name = "btnReset")
	private WebElement resetbutton;
	
	public Loginpage(WebDriver driver) {
		
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void login(String userid, String passwrd) throws Exception {
		mousecontrol.movetoElementandClick(Userid);
		elementcontrol.Settext(Userid, userid);
		mousecontrol.movetoElementandClick(password);
		elementcontrol.Settext(password, passwrd);
		mousecontrol.movetoElementandClick(loginbutton);
		
	}
	
}
