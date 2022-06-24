package commonlibs.contracts;

import org.openqa.selenium.WebElement;

public interface Imouseops {

	public void draganddrop(WebElement source, WebElement target) throws Exception;
	public void movetoelement(WebElement element) throws Exception;
	public void rightclick(WebElement element) throws Exception;
	public void doubleclick(WebElement element) throws Exception;
	public void movetoElementandClick(WebElement element) throws Exception;
}

