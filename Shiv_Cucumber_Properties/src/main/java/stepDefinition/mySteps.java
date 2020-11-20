package stepDefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class mySteps {

	WebDriver driver;
	ConfigFileReader configIt;

	@Given("^user is on HomePage$")
	public void user_is_on_HomePage() throws Throwable {

		System.setProperty("webdriver.chrome.driver", configIt.getDriverPath());

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(configIt.getImpWait(), TimeUnit.SECONDS);
		driver.get(configIt.getApplicationUrl());

	}

	@When("^user logins to page$")
	public void user_logins_to_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		
	}

	@When("^enters valid Credentials$")
	public void enters_valid_Credentials(DataTable data) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

		for (Map<String, String> mapIt : data.asMaps(String.class, String.class))

		{

			driver.findElement(By.id("user_login")).sendKeys(mapIt.get("userName"));
			driver.findElement(By.id("user_pass")).sendKeys(mapIt.get("password"));

		}
	}

	@When("^clicks on the Login button$")
	public void clicks_on_the_Login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("wp-submit")).click();
	}

	@Then("^Successful login message should be displayed on the console window$")
	public void successful_login_message_should_be_displayed_on_the_console_window() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User login successfully");
	}
}
