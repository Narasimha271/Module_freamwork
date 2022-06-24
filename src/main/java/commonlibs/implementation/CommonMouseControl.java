package commonlibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonlibs.contracts.Imouseops;



public class CommonMouseControl implements Imouseops{
	private Actions action;
	public CommonMouseControl(WebDriver driver) {
	action = new Actions(driver); 
	}
	

	@Override
	public void draganddrop(WebElement source, WebElement target) throws Exception {
		action.dragAndDrop(source, target).build().perform();
	}

	@Override
	public void movetoelement(WebElement element) throws Exception {
		action.moveToElement(element).build().perform();
		
	}

	@Override
	public void rightclick(WebElement element) throws Exception {
		action.contextClick(element).build().perform();
		
	}

	@Override
	public void doubleclick(WebElement element) throws Exception {
		action.doubleClick(element).build().perform();
		
	}

	@Override
	public void movetoElementandClick(WebElement element) throws Exception {
	 action.moveToElement(element).click(element).build().perform();
	}

}
