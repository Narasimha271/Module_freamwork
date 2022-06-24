package commonlibs.contracts;

import org.openqa.selenium.WebElement;

public interface IFrames {

	
	public void switchtoframe(WebElement element) throws Exception;
	public void switchttoframe(int index) throws Exception;
	public void switchtoframe(String id) throws Exception;
	public void switchtoprintpage() throws Exception;
	
}
