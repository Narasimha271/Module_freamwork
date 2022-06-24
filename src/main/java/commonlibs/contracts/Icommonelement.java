package commonlibs.contracts;

import org.openqa.selenium.WebElement;

public interface Icommonelement {
public String gettext(WebElement element) throws Exception;
public void clickelement(WebElement element) throws Exception;
public String getattribute(WebElement element, String attribute) throws Exception;
public String getCssvalue(WebElement element, String attribute) throws Exception;
public boolean iselementenabled(WebElement element, String attribute) throws Exception;
public boolean iselementvisible(WebElement element, String attribute) throws Exception;
public boolean iselementselected(WebElement element, String attribute) throws Exception;
public void Settext(WebElement element, String texttowrite) throws Exception;
public void cleartext(WebElement element) throws Exception;
public void changecheckboxstatus(WebElement element, boolean expectedstatus) throws Exception;
public int getxlocation(WebElement element) throws Exception;
public int getylocation(WebElement element) throws Exception;
}
