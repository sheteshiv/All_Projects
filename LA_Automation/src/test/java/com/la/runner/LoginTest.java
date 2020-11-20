package com.la.runner;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pageObjects.la.LoginObjects;
import com.utility.la.ExcelUtil;
import com.utility.la.Screenshot;

public class LoginTest extends LoginObjects {
	
	
	public static void doLogin() throws IOException {
		
		
		
		String company = ExcelUtil.readData(1, 0);
		String sUserName = ExcelUtil.readData(1, 1);
		
		String sPassword = ExcelUtil.readData(1, 2);
		
		
		
		
		LoginObjects.enterCompanyName(Driver.driver).sendKeys(company);
		Screenshot.takeScreenshot("C:\\Users\\TLP 62\\Documents\\Shiv\\My Work\\Screenshots_Automation\\Login_Page\\company.jpg");
		LoginObjects.enterUserName(Driver.driver).sendKeys(sUserName);
		Screenshot.takeScreenshot("C:\\Users\\TLP 62\\Documents\\Shiv\\My Work\\Screenshots_Automation\\Login_Page\\username.jpg");
		LoginObjects.enterPassword(Driver.driver).sendKeys(sPassword);
		Screenshot.takeScreenshot("C:\\Users\\TLP 62\\Documents\\Shiv\\My Work\\Screenshots_Automation\\Login_Page\\password.jpg");
		LoginObjects.clickLogin(Driver.driver).click();
		Screenshot.takeScreenshot("C:\\Users\\TLP 62\\Documents\\Shiv\\My Work\\Screenshots_Automation\\Login_Page\\loginbutton.jpg");
		
		
		
	}

}
