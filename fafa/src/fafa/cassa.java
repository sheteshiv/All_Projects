package fafa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class cassa {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C://Users//TLP 62//Documents//Shiv//Drivers//IEDriverServer.exe");

		WebDriver 	driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		
		
	}

}
