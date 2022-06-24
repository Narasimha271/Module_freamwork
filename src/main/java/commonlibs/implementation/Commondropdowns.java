package commonlibs.implementation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonlibs.contracts.Idropdowns;

public class Commondropdowns implements Idropdowns{
	
	private Select getselect(WebElement element) {
		Select select = new Select(element);
		return select;
	
	}

	

	@Override
	public void selectviavisibletext(WebElement element, String Visibletext) throws Exception {
		// TODO Auto-generated method stub

		getselect(element).selectByVisibleText(Visibletext);
	}
	

	@Override
	public void selectviavalue(WebElement element, String value) throws Exception {
		// TODO Auto-generated method stub
		getselect(element).selectByValue(value);
	}

	@Override
	public void selectviaindex(WebElement element, int index) throws Exception {
		// TODO Auto-generated method stub
		getselect(element).selectByIndex(index);
	}
	
	public List<WebElement> getalloptions(WebElement element){
		
		return getselect(element).getOptions();
		
		
	}
 
}

