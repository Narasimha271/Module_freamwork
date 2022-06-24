package commonlibs.implementation;

import org.openqa.selenium.WebElement;

import commonlibs.contracts.Icommonelement;

public class Commonelement implements Icommonelement{

	@Override
	public String gettext(WebElement element) throws Exception {
		
		return element.getText();
	}

	@Override
	public void clickelement(WebElement element) throws Exception {
		element.click();
		
	}

	@Override
	public String getattribute(WebElement element, String attribute) throws Exception {
		
		return element.getAttribute(attribute);
	}

	@Override
	public String getCssvalue(WebElement element, String attribute) throws Exception {
		// TODO Auto-generated method stub
		return element.getCssValue(attribute);
	}

	@Override
	public boolean iselementenabled(WebElement element, String attribute) throws Exception {
		
		return element.isEnabled();
	}

	@Override
	public boolean iselementvisible(WebElement element, String attribute) throws Exception {
		// TODO Auto-generated method stub
		return element.isDisplayed();
	}

	@Override
	public boolean iselementselected(WebElement element, String attribute) throws Exception {
		// TODO Auto-generated method stub
		return element.isSelected();
	}

	@Override
	public void Settext(WebElement element, String texttowrite) throws Exception {
		// TODO Auto-generated method stub
		element.sendKeys(texttowrite);
	}

	@Override
	public void cleartext(WebElement element) throws Exception {
		element.clear();
		
	}

	@Override
	public void changecheckboxstatus(WebElement element, boolean expectedstatus) throws Exception {
		boolean currentstatus = element.isSelected();
		if (currentstatus!= expectedstatus) {
			element.click();
		}
		
		
	}

	@Override
	public int getxlocation(WebElement element) throws Exception {
		
		return element.getLocation().x;
	}

	@Override
	public int getylocation(WebElement element) throws Exception {
		// TODO Auto-generated method stub
		return element.getLocation().y;
	}

}
