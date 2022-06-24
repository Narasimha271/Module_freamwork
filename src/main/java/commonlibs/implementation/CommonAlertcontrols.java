package commonlibs.implementation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import commonlibs.contracts.IAlerts;
import commonlibs.utilities.Waitutils;

public class CommonAlertcontrols implements IAlerts{

	
	private WebDriver driver;
	public CommonAlertcontrols(WebDriver driver) {
		this.driver=driver;
	}
	
	private Alert getalert() {
	return driver.switchTo().alert();
		
	}
	@Override
	public void acceptAlert() throws Exception {
		
		
		getalert().accept();
	}

	@Override
	public void rejectAlert() throws Exception {

		getalert().dismiss();
		
	}

	@Override
	public String getmessagefromAlert() throws Exception {

		return getalert().getText();
		
		
	}

	@Override
	public boolean checkAlertpresent(int timeoutinSeconds) throws Exception {
		
		try {
			Waitutils.waittillAlertispresent(driver, timeoutinSeconds);
			return true;
		} catch (Exception e) {
		return false;
		}

	}
	

}
