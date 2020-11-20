import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class API_Testting {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		 
		
		//RestAssured.baseURI ="https://scrum-tpi.leaseaccelerator.com/lease_accelerator/api.html";
		
		//RequestSpecification httpRequest= RestAssured.given();
		
		//JsonObject json = new JsonObject();
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TLP 62\\Documents\\Shiv\\Drivers\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://scrum-tpi.leaseaccelerator.com/lease_accelerator/api.html");
		
		//driver.findElement(By.id("apiURL")).sendKeys("https://scrum-tpi.leaseaccelerator.com/lease_accelerator");
		
		
		driver.findElement(By.id("token")).sendKeys("gVijK1YarW//cwre/uIy4ZS+ghpXja5AivOSDCIvCKdv1ZmtkL71ITrPOSGzPy0IjG+AQS9IQq6txyJ/dah6ND1GEvoCVXxVHgqMwyLVm3TSZ7P9WNdDfDEwPm3GnPdG+l/E3c+3fxyECT6yNlW7lSWpESn3jj4E+UuPlJ97yCI= ");
		
		driver.findElement(By.id("requestId")).sendKeys("1234567");
		Thread.sleep(2000);
		
		WebElement operation = driver.findElement(By.id("operation"));
		
		
		
		Select oselect_operation = new Select(operation);
		
		oselect_operation.selectByValue("ImportDeals");
		
		List<WebElement> listIt = oselect_operation.getOptions();
		
		System.out.println(listIt.size());
		
		Thread.sleep(2000);
		WebElement file_path = driver.findElement(By.id("file"));
		
		file_path.sendKeys("C:\\Users\\TLP 62\\Documents\\Shiv\\XML\\import_deals_b.xml");
		Thread.sleep(2000);
		
		driver.findElement(By.id("submitButton")).click();
	}

}
