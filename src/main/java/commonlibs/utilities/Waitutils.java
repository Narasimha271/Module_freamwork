package commonlibs.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitutils {

	public static void waittillAlertispresent(WebDriver driver, int timeoutinseconds) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, timeoutinseconds);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public static void waittillelemenetvisible(WebDriver driver, WebElement element, int timeoutinseconds) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, timeoutinseconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static void waittillelemenetclickable(WebDriver driver, WebElement element, int timeoutinseconds) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, timeoutinseconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public static void waittillelemenetSelectable(WebDriver driver, WebElement element, int timeoutinseconds) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, timeoutinseconds);
		wait.until(ExpectedConditions.elementToBeSelected(element));
		
	}
}
	