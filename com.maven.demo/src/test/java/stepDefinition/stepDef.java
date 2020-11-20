package stepDefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;

/**
 * Unit test for simple App.
 */
public class stepDef 

{
public static WebDriver driver;


@Given("^user is on HomePage$")
public void user_is_on_HomePage() throws Throwable {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\TLP 62\\Documents\\Shiv\\NewChromeDriver\\chromedriver.exe");

 driver = new ChromeDriver();


}

@When("^user logins to page$")
public void user_logins_to_page() throws Throwable {
	
	driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	
}

//@When("^enters valid userName and Password$")
//public void enters_valid_userName_and_Password() throws Throwable {
//	
//	driver.findElement(By.id("user_login")).sendKeys("opensourcecms");
//	driver.findElement(By.id("user_pass")).sendKeys("opensourcecms");
//}




@When("^enters valid Credentials$")

public void enters_valid_Credentials(DataTable data) throws Throwable {
	
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//
//	for(Map<String, String> mapIt :  data.asMaps(String.class,String.class))
//		
//	{
//		
//		driver.findElement(By.id("user_login")).sendKeys(mapIt.get("userName"));
//		driver.findElement(By.id("user_pass")).sendKeys(mapIt.get("password"));
//		
//	}
	
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	
	login.enterUserName();
	login.enterPassword();
	//login.clickLogin();
	
}

@When("^clicks on the Login button$")
public void clicks_on_the_Login_button() throws Throwable {
	driver.findElement(By.id("wp-submit")).click();
}

@Then("^Successful login message should be displayed on the console window$")
public void successful_login_message_should_be_displayed_on_the_console_window() throws Throwable {
   System.out.println("User login successfully");
}
}
