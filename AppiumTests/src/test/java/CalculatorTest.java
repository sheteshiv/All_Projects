import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorTest {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		
		try {
		openCalculator();
		}catch (Exception e) {
			
			e.getCause();
			
			e.getMessage();
			e.printStackTrace();
		}

	}
	
	public static void openCalculator() throws Exception {
		
		//We need to set the desired capabilities for the Device Name,UdId,Platform Name,Platform Version,
		// appPackage,AppActivity and URL
		
		//String baseURL = "http://0.0.0.0";
		//String minorURL = "/wd/hub";
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "OnePlus 6"); 
		
		cap.setCapability("udid", "192.168.1.109:5555");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		//cap.setCapability("appPackage", "com.oneplus.calculator");
		//cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");
		
		cap.setCapability("browserName", "chrome");
		cap.setCapability("noReset", true);
		
		
		//System.out.println("APplication Started....");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TLP 62\\Documents\\Shiv\\Drivers\\chromedriver.exe");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		driver = new AndroidDriver<MobileElement>(url,cap);
		
		driver.get("http://www.google.com");
		
		//driver.findElement(By.id("com.android.chrome:id/search_box_text")).sendKeys("https://uat-trunk.leaseaccelerator.com/lease_accelerator/");
		//driver.get("https://uat-trunk.leaseaccelerator.com/lease_accelerator/");
	//driver.findElement(By.id("appid")).sendKeys("Acme");
	
	//driver.findElement(By.id("username")).sendKeys("shivsandesh");
	//driver.findElement(By.id("clearPwd")).sendKeys("Welcome@123");
	//driver.findElement(By.id("loginout")).click();

	 
	/*
	driver.findElement(By.id("com.oneplus.calculator:id/op_add")).click();
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
	
	driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
	
	//driver.close();
		*/
	
	
	}

}
