package com.pageObjects.la;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class LogOutObjects   {
	
	
	
	
	public static void hoverSettings(WebDriver driver) {
		
		
			
		WebElement hover =  driver.findElement(By.xpath("//div[@class='pageMainContent']//a[@class='settings']"));
	
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		
	
	}
	
	public static void clickLogout(WebDriver driver) {
		
		WebElement logOutButton = driver.findElement(By.linkText("LOG OUT"));
				
			Actions action = new Actions(driver);
		action.moveToElement(logOutButton).click().perform();
		
		
	}

}
