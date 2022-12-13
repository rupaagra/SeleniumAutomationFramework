package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Headers {

	WebDriver driver;
	
	public Headers(WebDriver driver) {
		this.driver = driver;
	}
	
	//locators
	By signUpButton = By.cssSelector(".login-link.s-btn.s-btn__primary.py8.btn-topbar-primary");
	
	//methods
	public void navigateToSignUp() {
		driver.findElement(signUpButton).click();
	}
	
}
