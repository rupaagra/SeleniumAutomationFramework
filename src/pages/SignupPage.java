package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	WebDriver driver;
	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	
	@FindBy(css = "#content > div > div.wmx4.ta-center.fs-title.mx-auto.mb24")
	WebElement matter;
	//By matter = By.cssSelector("#content > div > div.wmx4.ta-center.fs-title.mx-auto.mb24");
	
	@FindBy(css = "#display-name")
	WebElement displayName;
	//By displayName = By.cssSelector("#display-name");
	By email = By.cssSelector("#email");
	By password = By.cssSelector("#password");
	
	
	//Methods
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public String getMatter() {
		return matter.getText();
	}
	
	public void setSignUpDetails() {
		displayName.sendKeys("Rajesh");
		driver.findElement(email).sendKeys("email@email.com");
		driver.findElement(password).sendKeys("Password@123");
	}
	
}
