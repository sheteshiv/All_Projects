package com.pageObjects.la;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.configuration.la.Config;
import com.utility.la.ExcelUtil;

public class LoginObjects {
	
	
	
	/*public LoginObjects( WebDriver driver) {
		
		this.driver=driver;
		
	}
	*/
	
	public static WebElement enterCompanyName(WebDriver driver) {
		
		
		return driver.findElement(By.id("appid"));
	}
	
	public static WebElement enterUserName(WebDriver driver) {
		
		return driver.findElement(By.id("username"));
		
		
	}
	
	public static WebElement enterPassword(WebDriver driver) {
		
		return driver.findElement(By.id("clearPwd"));
		
	}
	
	public static WebElement clickLogin(WebDriver driver) {
		
		return driver.findElement(By.id("loginout"));
	}
	
}

	/*
	@FindBy(how =How.ID,using="appid")
	public WebElement company;
	
	@FindBy(how =How.ID,using="username")
	public WebElement username;
	
	@FindBy(how =How.ID,using="clearPwd")
	public WebElement password;
	
	@FindBy(how =How.ID,using="loginout")
	public WebElement loginbutton;
	
	String company = ExcelUtil.readData(1, 0);
	String sUserName = ExcelUtil.readData(1, 1);
	
	String sPassword = ExcelUtil.readData(1, 2);
	
	public  void enterCompanyName()
		{company.sendKeys("Acme");
		}
	
	public  void enterUserName() {username.sendKeys(keysToSend);}
	public  void enterPassword() {}
	public  void clickLogin()
	
	*/

