package Library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static String captureScreenShot(WebDriver driver, String screenshotName) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path = "Screenshots\\"+ screenshotName + ".png";
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
		return path;
	}
	
}
