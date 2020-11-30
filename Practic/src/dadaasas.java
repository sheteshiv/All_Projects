
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class dadaasas {

	public static void main(String[] args) {


			 
	/*	 
		 RestAssured.baseURI = "https://restapi.demoqa.com/authentication/CheckForAuthentication";
		 RequestSpecification request = RestAssured.given();
		 
		 Response response = request.get();
		 System.out.println("Status code: " + response.getStatusCode());
		 System.out.println("Status message " + response.body().asString());

		 Actions action = new Actions(driver);
		 action.x
		 
		 Reporter.
		 
		 */
		 
		 String s = "Shete";
		 
		 char[] charIt = s.toCharArray();
		 
		 Map<Character, Integer> mapIt = new HashMap<Character, Integer>();
		 
		 for(char c: charIt) {
			 
			 if (mapIt.containsKey(c)) {
				 
				 mapIt.put(c, mapIt.get(c)+1);
				
			}
			 else {
				
				 mapIt.put(c, 1);
			}
			 System.out.println(c + ":"+ mapIt.get(c));
		 }
		 
		
	}

}
