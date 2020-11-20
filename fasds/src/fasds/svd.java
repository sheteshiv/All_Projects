package fasds;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class svd {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TLP 62\\Documents\\Shiv\\NewChromeDriver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://scrum-re.leaseaccelerator.com/lease_accelerator/");
		
		driver.findElement(By.id("appid")).sendKeys("Acme");
		driver.findElement(By.id("username")).sendKeys("test_user_s");
		driver.findElement(By.id("clearPwd")).sendKeys("Lessa@123");
		driver.findElement(By.id("loginout")).click();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[@class='pageMainContent']//a[@class='settings']"))).build().perform();
		
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.linkText("LOG OUT"))).click().perform();
		
		
	}

}
