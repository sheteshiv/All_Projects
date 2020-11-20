package com.la.runner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.configuration.la.Config;
import com.utility.la.ExcelUtil;
import com.utility.la.Screenshot;


public class Driver {
	
	public static WebDriver driver;
	
	//@Parameters("browser")
	@BeforeMethod
	
	public void beforeMethod() {
		
		//if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", Config.chromeDriver);
			
			driver= new ChromeDriver();
			
		//}
		/*else if (browser.equalsIgnoreCase("ie")) {
			
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			  
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
			capabilities.setCapability(InternetExplorerDriver.
			  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			System.setProperty("webdriver.ie.driver", Config.ieDriver);
			
			driver = new InternetExplorerDriver();
			
		*/
		
		
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get(Config.baseUrl);
		
			
	}
	
	@Test()
	
	public void driverMethod() throws InterruptedException, IOException {
		
		ExcelUtil.gotoFilePath(Config.filePaths, "Sheet1");
		
		LoginTest.doLogin();
		
		Assert.assertEquals(driver.getTitle(), "Lease Accelerator");
		
		LogoutTest.doLogouts();
		
	}
	
	/*
	@DataProvider(name="configDataProvider")
	
	public Object[][] provideData()
	{
		
		//Object[][] configData= ExcelUtil.filePath(Config.filePaths, "Sheet1");
		//return configData;
		 return new Object[][] {
			 
			 
			 { "TestCaseName", "TestCase_One" },
	            { "UserName", "test_user_s" },
	            { "Password", "Lessa@123" }
		 };
				 
	}
	
	*/
	
	@AfterMethod
	public void tearDown() throws IOException {
	driver.close();
	ExcelUtil.writeData(1, 3, "Pass");

	}
}
