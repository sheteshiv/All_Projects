package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LoginPage {
	
	
	public static WebDriver driver;
	
	public LoginPage(WebDriver driver)
	
	{
		
		this.driver = driver;
		
	}
	
	
	@FindBy(how=How.ID, using="user_login")
	
	private WebElement userName;
	
@FindBy(how=How.ID, using="user_pass")
	
	private WebElement passWord;


//@FindBy(how=How.ID, using="wp-submit")

//private WebElement loginButton;



public void enterUserName()
{
	userName.sendKeys("opensourcecms");
}

public void enterPassword() {
	
	passWord.sendKeys("opensourcecms");
	
}

//public void clickLogin() {
	
	//loginButton.click();
	
	
//}

}
