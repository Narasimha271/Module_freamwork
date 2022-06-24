package commonlibs.implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import commonlibs.contracts.Idriver;

public class Commondriver implements Idriver{

	
	private WebDriver driver;
	private int pageloadtimeout;
	private int elementdetectiontimeout;
	// we are denoting these objects as private. if we want to pass the values from outside we can use Getters and setters to get and set the values 
	public WebDriver getDriver() {
		return driver;
	}
	public void setPageloadtimeout(int pageloadtimeout) {
		this.pageloadtimeout = pageloadtimeout;
	}
	public void setElementdetectiontimeout(int elementdetectiontimeout) {
		this.elementdetectiontimeout = elementdetectiontimeout;
	}
	
	public Commondriver(String browsertype) throws Exception{
		pageloadtimeout= 60;
		elementdetectiontimeout=10;
		String currentworkingdirectory = System.getProperty("user.dir");
		
		if(browsertype.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",currentworkingdirectory +"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browsertype.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", currentworkingdirectory +"\\drivers\\msedgedriver.exe");
			driver= new EdgeDriver();
		}
		else {
			throw new Exception("invalid browser type.");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
	}
	@Override
	public void gotofirsturl(String url) throws Exception {
		driver.manage().timeouts().pageLoadTimeout(pageloadtimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(elementdetectiontimeout, TimeUnit.SECONDS);
		url = url.trim(); // the .trim() will remove the white spaces, if they are added accidently
		driver.get(url);
		 //these methods are also known as wrapper methods.

	}
	@Override
	public String gettitile() throws Exception {
		return driver.getTitle();
	}
	@Override
	public String getcurrenturl() throws Exception {

		return driver.getCurrentUrl();
	}
	@Override
	public String getpagesource() throws Exception {
		
		return driver.getPageSource();
	}
	@Override
	public void gotourl(String url) throws Exception {
		driver.manage().timeouts().pageLoadTimeout(pageloadtimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(elementdetectiontimeout, TimeUnit.SECONDS);
		url = url.trim();
		driver.navigate().to(url);
	}
	@Override
	public void goforward() throws Exception {
	driver.navigate().forward();
		
	}
	@Override
	public void goback() throws Exception {
		driver.navigate().back();
		
	}
	@Override
	public void refresh() throws Exception {
		driver.navigate().refresh();
		
	}
	@Override
	public void closebrowser() throws Exception {
		if(driver!=null) {
		driver.close();
		}
		
	}
	@Override
	public void closeallbrowsers() throws Exception {
		if(driver!=null) {
			driver.quit();
			}
			
	}

}
