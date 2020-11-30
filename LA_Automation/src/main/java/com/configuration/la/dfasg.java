package com.configuration.la;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dfasg {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TLP 62\\Documents\\Shiv\\Drivers\\ChromeDriver_80\\chromedriver.exe");
				
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
	}

}
