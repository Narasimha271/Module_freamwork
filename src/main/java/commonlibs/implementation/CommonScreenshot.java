package commonlibs.implementation;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import commonlibs.contracts.IScreenshot;

public class CommonScreenshot implements IScreenshot{

	TakesScreenshot camera;
	public CommonScreenshot(WebDriver driver) {
			 camera = (TakesScreenshot) driver;
			
	}
	@Override
	public void captureandsavescreenshot(String pathfile) throws Exception {
		 
		pathfile = pathfile.trim();
		
		File imgfile, tempfile;
		imgfile = new File(pathfile); // here we are creating an empty image file at path "pathfile"
		 if (imgfile.exists()) {

			 throw new Exception("Image File with this name Already Exist...");
			 }
		tempfile = camera.getScreenshotAs(OutputType.FILE); //a screenshot is taken in the output type as FILE and saved in "tempfile"
		FileUtils.moveFile(tempfile, imgfile); // We are moving the saved "tempfile" to the empty image File "imgfile"
	}

}
