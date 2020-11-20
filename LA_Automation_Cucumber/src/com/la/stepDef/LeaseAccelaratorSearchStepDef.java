package com.la.stepDef;

import static org.testng.Assert.assertEquals;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.la.Utility.LAbrowserUtility;
import com.la.Utility.PropertiesFileReader;
import com.la.listeners.ExtentReportListener;
import com.la.pageObjects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeaseAccelaratorSearchStepDef  extends ExtentReportListener{
	
	public static WebDriver driver;
	PropertiesFileReader obj =new PropertiesFileReader();
	Properties prop = obj.redProperties();
	
	//private static ExtentReports report =null;
	//private static ExtentTest test=null;
	
	
	@Given("^user is on HomePage$")
	public void user_is_on_HomePage() throws Throwable {
		
		ExtentTest logInfo=null;
		try {
		test= extent.createTest(Feature.class, "Login Functionality");
		test= test.createNode(Scenario.class, "User should be able to login successfully");
		logInfo=	test.createNode(new GherkinKeyword("Given"), "user_is_on_HomePage");
		 
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriver"));
		
		driver= new ChromeDriver();
		}
		catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
		//LAbrowserUtility.utilbrowser(driver, prop.getProperty("browser.name"), prop.getProperty("browser.baseUrl"));	
	}

	@When("^user logins to page$")
	public void user_logins_to_page() throws Throwable {
		
		ExtentTest logInfo=null;
		try {
		
			logInfo= test.createNode(new GherkinKeyword("When"), "user_logins_to_page");
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("browser.baseUrl"));
		
		logInfo.pass("navigated to the url");
		
		logInfo.addScreenCaptureFromPath(takeScreenshot(driver));
		
		
		}
		
		catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	  
		
	}

	@When("^enters valid Credentials$")
	public void enters_valid_Credentials() throws Throwable {
		
		ExtentTest logInfo=null;
		
		try {
		
			logInfo= test.createNode(new GherkinKeyword("When"), "enters_valid_Credentials");
		 
		new LoginPage(driver).loginFunction();
		
		logInfo.pass("login credentials entered");
		logInfo.addScreenCaptureFromPath(takeScreenshot(driver));
		
		}
		
		catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	    
		
		
		
		//driver.findElement(By.id("appid")).sendKeys("Acme");
		
		//driver.findElement(By.id("username")).sendKeys("test_user_s");
		 //driver.findElement(By.id("clearPwd")).sendKeys("Lessa@123");
	}

	@When("^clicks on the Login button$")
	public void clicks_on_the_Login_button() throws Throwable {
		
		ExtentTest logInfo=null;
		
		try {
		
			logInfo=test.createNode(new GherkinKeyword("When"), "clicks_on_the_Login_button");
		 
		new LoginPage(driver).clickLogin();
		
		 logInfo.pass("clicked on the login button");
		 logInfo.addScreenCaptureFromPath(takeScreenshot(driver));
		
		}
		
		catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	    
		
		
	    
		//driver.findElement(By.id("loginout")).click();
	}

	@Then("^Successful login message should be displayed on the console window$")
	public void successful_login_message_should_be_displayed_on_the_console_window() throws Throwable {
	    
		ExtentTest logInfo=null;
		
		try {
		
			logInfo=test.createNode(new GherkinKeyword("Then"), "successful_login_message_should_be_displayed_on_the_console_window");
		 
				System.out.println("User is able to login successfully");
				
				String expected ="LeaseAccelerator - Acme, Inc. - test_user_s - Home";
				
				String actual = driver.getTitle();
				Assert.assertEquals(actual, expected, "login validation failed");
			   //System.out.println(driver.getTitle());
			   	
		 logInfo.pass("displayed message on the console window");
		 System.out.println("user is able to login successfully");
		 logInfo.addScreenCaptureFromPath(takeScreenshot(driver));
		 driver.quit();
		
		}
		
		catch (AssertionError | Exception e) {
			testStepHandle("FAIL", driver, logInfo, e);
		}
	    
	}

}
