import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

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
	
	public static void openCalculator() {
		
		//We need to set the desired capabilities for the Device Name,UdId,Platform Name,Platform Version,
		// appPackage,AppActivity and URL
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "OnePlus 6");
		
		cap.setCapability("udid", "7a5e9832");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.oneplus.calculator");
		cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");
		
		URL url = new UrlChecker("https://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("APplication Started....");
	
		
	}

}
