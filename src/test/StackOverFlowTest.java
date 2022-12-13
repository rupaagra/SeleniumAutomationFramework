package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Library.Utility;
import pages.StackoverflowLandingPage;

public class StackOverFlowTest {

	WebDriver driver;
	StackoverflowLandingPage stackpage;
	
	//Extent Reports: for reporting purpose
	//ExtentReports report;
	//ExtentTest logger;

	// Go to Stackoverflow application
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/Appium_MobileAutomation/jar/v_87/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/");
		//report = new ExtentReports("Reports\\ExtentReport.html", true);
	}

	//verify title, verify URL, verify matter
	@Test
	public void verifyStackoverflowContaints() {
		
		//logger = report.startTest("First Test started");
		stackpage = new StackoverflowLandingPage(driver);
		String stackTitle = stackpage.getTitle();
		String stackURL = stackpage.getCurrentURL();
		String stackMatter = stackpage.getMatter();
		System.out.println(stackTitle);
		System.out.println(stackURL);
		System.out.println("Using PageFactory: " + stackMatter);
		Assert.assertEquals(stackMatter, "Learn, Share, Build1");
	}
	
	@Test
	public void verifyStackoverflowContaints2() {
		
		//logger = report.startTest("Second Test started");
		stackpage = new StackoverflowLandingPage(driver);
		String stackTitle = stackpage.getTitle();
		String stackURL = stackpage.getCurrentURL();
		String stackMatter = stackpage.getMatter();
		System.out.println(stackTitle);
		System.out.println(stackURL);
		System.out.println("Using PageFactory: " + stackMatter);
		Assert.assertEquals(stackMatter, "Learn, Share, Build");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws Exception {
		ITestContext context = result.getTestContext();
		System.out.println("result.getStatus() is: "+ result.getStatus());
		if(result.getStatus() == ITestResult.SUCCESS) {
			System.out.println("Equals passes success");
			//logger.log(LogStatus.PASS, "Test Case Passed");
		}
		else {
			String screenshot = Utility.captureScreenShot(driver, result.getName());
			//String image = logger.addScreenCapture(screenshot);
			//logger.log(LogStatus.FAIL, "Test case failed", image);
			
			//logger.log(LogStatus.FAIL, "Test case failed	", result.getThrowable());
			System.out.println("Context: " +context.getFailedTests());
			System.out.println(" :" + LogStatus.INFO);
		}
		
		//report.endTest(logger);
		//report.flush();
	}
}
