package com.guru99bank.pages;

import org.openqa.selenium.WebDriver;

import commonlibs.implementation.CommonAlertcontrols;
import commonlibs.implementation.CommonFrames;
import commonlibs.implementation.CommonMouseControl;
import commonlibs.implementation.CommonScreenshot;
//import commonlibs.implementation.Commondriver;
import commonlibs.implementation.Commondropdowns;
import commonlibs.implementation.Commonelement;

public class Basepage {
	
	protected CommonAlertcontrols alertcontrol;
	//protected Commondriver drivercontrol;
	protected Commondropdowns dropdowncontrol;
	protected Commonelement elementcontrol;
	protected CommonFrames framescontrol;
	protected CommonMouseControl mousecontrol;
	protected CommonScreenshot screenshotcontrol;
	
	public Basepage(WebDriver driver) {
		
		alertcontrol = new CommonAlertcontrols(driver);
		dropdowncontrol = new Commondropdowns();
		elementcontrol = new Commonelement();
		framescontrol = new CommonFrames(driver);
		mousecontrol = new CommonMouseControl(driver);
		screenshotcontrol = new CommonScreenshot(driver);
	} 

}
