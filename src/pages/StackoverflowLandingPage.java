package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class StackoverflowLandingPage {

	WebDriver driver;
	// Locators
	//PageFactory
	
	@FindBy(css = "body > div.old-hero.z-base > div > div.fl-shrink2 > h1")
	WebElement matter;
	//By matter = By.cssSelector("body > div.old-hero.z-base > div > div.fl-shrink2 > h1");

	public StackoverflowLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Methods
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getCurrentURL() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public String getMatter() {
		
		//String matterText = driver.findElement(matter).getText();
		String matterText = matter.getText();
		return matterText;
	}

}
