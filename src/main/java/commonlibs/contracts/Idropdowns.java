package commonlibs.contracts;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface Idropdowns {

	public void selectviavisibletext(WebElement element, String Visibletext) throws Exception;
	public void selectviavalue(WebElement element, String value) throws Exception;
	public void selectviaindex(WebElement element, int index) throws Exception;
public List<WebElement> getalloptions(WebElement element) throws Exception;

}
