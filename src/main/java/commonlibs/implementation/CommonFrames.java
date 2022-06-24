package commonlibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonlibs.contracts.IFrames;

public class CommonFrames implements IFrames {
	
	private WebDriver driver;
	public CommonFrames(WebDriver driver) {
		this.driver= driver;
	}

	@Override
	public void switchtoframe(WebElement element) throws Exception {
		// TODO Auto-generated method stub
	driver.switchTo().frame(element);	
	}

	@Override
	public void switchttoframe(int index) throws Exception {
		// TODO Auto-generated method stub
		driver.switchTo().frame(index);
		
	}

	@Override
	public void switchtoframe(String id) throws Exception {
		// TODO Auto-generated method stub
		driver.switchTo().frame(id);
	}

	@Override
	public void switchtoprintpage() throws Exception {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		
	}
	
}
