package com.la.runner;
import com.pageObjects.la.LogOutObjects;

public class LogoutTest {
	
	public static void doLogouts() throws InterruptedException {
		
		LogOutObjects.hoverSettings(Driver.driver);
		Thread.sleep(2000);
		LogOutObjects.clickLogout(Driver.driver);
		
	}

}
