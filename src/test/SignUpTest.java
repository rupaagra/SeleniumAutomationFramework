package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Headers;
import pages.SignupPage;
import pages.StackoverflowLandingPage;

public class SignUpTest {

	WebDriver driver;
	StackoverflowLandingPage stackpage;
	SignupPage signuppage;
	Headers header;

	// Go to Stackoverflow application
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/Appium_MobileAutomation/jar/v_87/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/users/signup?ssrc=head&returnurl=%2fusers%2fstory%2fcurrent");
	}

	@Test
	public void signUpContentCheck() {
		/*
		 * stackpage = new StackoverflowLandingPage(driver); String stackTitle =
		 * stackpage.getTitle(); String stackURL = stackpage.getCurrentURL(); //String
		 * stackMatter = stackpage.getMatter(); System.out.println(stackTitle);
		 * System.out.println(stackURL); //System.out.println(stackMatter);
		 * 
		 * header = new Headers(driver); //header.navigateToSignUp();
		 */
		signuppage = new SignupPage(driver);
		/*
		 * String signupTitle = signuppage.getTitle(); String signupURL =
		 * signuppage.getCurrentURL(); //String signupMatter = signuppage.getMatter();
		 * System.out.println(signupTitle); System.out.println(signupURL);
		 * //System.out.println(signupMatter);
		 */		
		signuppage.setSignUpDetails();
		
		
	}
	
}
