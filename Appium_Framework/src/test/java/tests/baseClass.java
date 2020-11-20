package tests;



import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseClass {
	
	AppiumDriver<MobileElement> driver; 
	
	@BeforeTest
	public  void setup() {
		
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//caps.setCapability("platformName", "Android");
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 6");
		caps.setCapability(MobileCapabilityType.UDID, "92.168.1.109:5555");
		
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
	//	caps.setCapability(MobileCapabilityType.APP, "");
		
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,caps);
		
	}catch (Exception e) {
		
		System.out.println("cause is : "+e.getCause());
		
		System.out.println("message is : "+e.getMessage());
		
		e.printStackTrace();
		}
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver.quit();
		
	}

}
