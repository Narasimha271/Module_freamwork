package com.guru99bank.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerpage extends Basepage {
	
	Actions act;
	@FindBy(name = "uid")
	private WebElement Userid;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "btnLogin")
	private WebElement loginbutton;
	
	@FindBy(name = "btnReset")
	private WebElement resetbutton;
	
	@FindBy(linkText = "New Customer")
	private WebElement newcustomer;
	
	@FindBy(name = "name")
	private WebElement customername;
	
	@FindBy(xpath = "//label[@id = 'message']")
	private WebElement customernamemessgae;
	
	@FindBy(name = "addr")
	private WebElement address;
	
	@FindBy(xpath = "//label[@id = 'message3']")
	private WebElement addressmessgae;
	////////////////////////////////////
	
	@FindBy(name = "city")
	private WebElement city;
	
	@FindBy(xpath = "//label[@id = 'message4']")
	private WebElement citymessgae;
	
	@FindBy(name = "state")
	private WebElement state;
	
	@FindBy(xpath = "//label[@id = 'message5']")
	private WebElement statemessgae;
	
	@FindBy(name = "pinno")
	private WebElement pinno;
	
	@FindBy(xpath = "//label[@id = 'message6']")
	private WebElement pinnomessgae;
	
	
	@FindBy(name = "telephoneno")
	private WebElement telephoneno;
	
	@FindBy(xpath = "//label[@id = 'message7']")
	private WebElement telephonenomessgae;
	
	@FindBy(name = "emailid")
	private WebElement emailid;
	
	@FindBy(xpath = "//label[@id = 'message9']")
	private WebElement emailidmessgae;
	
	
	
	public NewCustomerpage(WebDriver driver)  {
		
		super(driver);
		PageFactory.initElements(driver, this);
		
		act= new Actions(driver);
	}
	
	public void login(String userid, String passwrd) throws Exception {
		mousecontrol.movetoElementandClick(Userid);
		elementcontrol.Settext(Userid, userid);
		mousecontrol.movetoElementandClick(password);
		elementcontrol.Settext(password, passwrd);
		mousecontrol.movetoElementandClick(loginbutton);
		
	}
	
	public String newcustomername(String name) throws Exception {
		elementcontrol.clickelement(newcustomer);
		mousecontrol.movetoElementandClick(customername);
		elementcontrol.Settext(customername, name);
		act.sendKeys(Keys.TAB).build().perform();
		return elementcontrol.gettext(customernamemessgae);
		
	}
	
	public String newcustomeraddress(String name) throws Exception {
		
		elementcontrol.clickelement(newcustomer);
		elementcontrol.clickelement(address);
		elementcontrol.Settext(address, name);
		act.sendKeys(Keys.TAB).build().perform();
		return elementcontrol.gettext(addressmessgae);
		
	
	}
	
	public String newcustomercity(String name) throws Exception {
		
		elementcontrol.clickelement(newcustomer);
		elementcontrol.clickelement(city);
		elementcontrol.Settext(city, name);
		act.sendKeys(Keys.TAB).build().perform();
		return elementcontrol.gettext(citymessgae);
		
	
	}
	

	public String newcustomerstate(String name) throws Exception {
	
	elementcontrol.clickelement(newcustomer);
	elementcontrol.clickelement(state);
	elementcontrol.Settext(state, name);
	act.sendKeys(Keys.TAB).build().perform();
	return elementcontrol.gettext(statemessgae);
	

	}
	
	public String newcustomerpinno(String name) throws Exception {
		
		elementcontrol.clickelement(newcustomer);
		elementcontrol.clickelement(pinno);
		elementcontrol.Settext(pinno, name);
		act.sendKeys(Keys.TAB).build().perform();
		return elementcontrol.gettext(pinnomessgae);
		

		}
	
	public String newcustomerteleno(String name) throws Exception {
		
		elementcontrol.clickelement(newcustomer);
		elementcontrol.clickelement(telephoneno);
		elementcontrol.Settext(telephoneno, name);
		act.sendKeys(Keys.TAB).build().perform();
		return elementcontrol.gettext(telephonenomessgae);

		}
	public String newcustomeremailid(String name) throws Exception {
		
		elementcontrol.clickelement(newcustomer);
		elementcontrol.clickelement(emailid);
		elementcontrol.Settext(emailid, name);
		act.sendKeys(Keys.TAB).build().perform();
		return elementcontrol.gettext(emailidmessgae);

		}
}
