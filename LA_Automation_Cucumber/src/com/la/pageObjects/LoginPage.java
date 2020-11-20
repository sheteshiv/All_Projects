package com.la.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import sun.security.krb5.internal.PAEncTSEnc;

public class LoginPage {
	
	WebDriver driver;
	
	 public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how =How.ID,using="appid")
	public WebElement company;
	
	@FindBy(how =How.ID,using="username")
	public WebElement userName;
	
	@FindBy(how =How.ID,using="clearPwd")
	public WebElement password;
	
	@FindBy(how =How.ID,using="loginout")
	public WebElement loginbutton;
	
	public void loginFunction() {
		
		company.sendKeys("Acme");
		userName.sendKeys("test_user_s");
		password.sendKeys("Lessa@123");
		
		
	}
	
	public void clickLogin() {
		loginbutton.click();
		
	}

}
