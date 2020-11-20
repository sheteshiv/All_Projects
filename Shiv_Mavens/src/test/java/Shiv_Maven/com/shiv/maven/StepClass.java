package Shiv_Maven.com.shiv.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepClass {

	public static WebDriver driver;
	
	@Given("^User is on Homepage$")
	public void user_is_on_Homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TLP 62\\Documents\\Shiv\\Selenium_jars\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	}

	@When("^user enters valid Credentials$")
	public void user_enters_valid_Credentials() throws Throwable {
		driver.findElement(By.id("user_login")).sendKeys("opensourcecms");

		driver.findElement(By.id("user_pass")).sendKeys("opensourcecms");
	}

	@When("^click on the Login button$")
	public void click_on_the_Login_button() throws Throwable {
		driver.findElement(By.id("wp-submit")).click();
	}

	@Then("^successful login message should be displayed on the console window$")
	public void successful_login_message_should_be_displayed_on_the_console_window() throws Throwable {
		System.out.println("user login successfully");
	}


}