package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Tests extends baseClass {
	
	
	
	public void testOne() {
		
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		System.out.println("Test Completed");
	}

}
