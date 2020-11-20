import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OperationType {
	
	public static WebDriver driver;
	
	@Test
	public static void selectOperation() {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\TLP 62\\Documents\\Shiv\\Drivers\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://scrum-tpi.leaseaccelerator.com/lease_accelerator/api.html");
		
		//driver.findElement(By.id("apiURL")).sendKeys("https://scrum-tpi.leaseaccelerator.com/lease_accelerator");
		
		
		driver.findElement(By.id("token")).sendKeys("gVijK1YarW//cwre/uIy4ZS+ghpXja5AivOSDCIvCKdv1ZmtkL71ITrPOSGzPy0IjG+AQS9IQq6txyJ/dah6ND1GEvoCVXxVHgqMwyLVm3TSZ7P9WNdDfDEwPm3GnPdG+l/E3c+3fxyECT6yNlW7lSWpESn3jj4E+UuPlJ97yCI= ");
		
		driver.findElement(By.id("requestId")).sendKeys("1234567");
		//Thread.sleep(2000);
		
		WebElement operation = driver.findElement(By.id("operation"));
		
		Select oselect_operation = new Select(operation);
		
		List<WebElement> listIt = oselect_operation.getOptions();
		
		int listSise = listIt.size();
		
		
		  String value = "ImportDeals"; 
		 /* if(getElement(listIt,value)!=null) {
		 * driver.findElement(By.id("file")).
		 * sendKeys("C:\\Users\\TLP 62\\Documents\\Shiv\\XML\\import_deals_b.xml"); }
		 */
		
		
		  for (int i = 0; i < listSise; i++) {
		  
		  String getOperationName = oselect_operation.getOptions().get(i).getText();
		  
		  System.out.println(getOperationName);
			  
		  if (getOperationName.equals(value)){
		  
			  //System.out.println(getOperationName);
			  oselect_operation.selectByValue(getOperationName);
			  driver.findElement(By.id("file")).sendKeys("C:\\Users\\TLP 62\\Documents\\Shiv\\XML\\import_deals_b.xml");
			  break;
			  
			 
		  }
		  
		  
		 //break;
		  
		  }
		  //driver.findElement(By.id("file")).sendKeys("C:\\Users\\TLP 62\\Documents\\Shiv\\XML\\import_deals_b.xml");
		  
		 // else {
		  
		 // throw new RuntimeException("Not able to find the file for given operation");
		 // }
		  
		  driver.findElement(By.id("submitButton")).click();
		  
		  }
		 
		
		
	}
	
	/*
	 * public static WebElement getElement(List<WebElement> list,String value) { for
	 * (WebElement webElement : list) { if(value==webElement.getText()) return
	 * webElement; } return null; }
	 */

