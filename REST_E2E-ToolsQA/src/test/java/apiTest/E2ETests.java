package apiTest;

import java.util.List;
import java.util.Map;

import org.omg.CORBA.RepositoryIdHelper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class E2ETests {
	
	
	public static void main(String[] args) {
		
		
		String userID = "9b5f49ab-eea9-45f4-9d66-bcf56a531b85" ;
		String userName = "TOOLSQA-Test";
		String password ="Test@@123";
		String baseUrl = "https://bookstore.toolsqa.com";
		
		//Step 1: Generate a token for the given user
		
		RestAssured.baseURI =baseUrl;
		
		RequestSpecification request =  RestAssured.given();
		
		request.header("Content-Type","application/json");
		
		Response response =  request.body("userName" + userName+"password" + password ).post("/Account/v1/GenerateToken");
		
		System.out.println(response);
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		String jasonString =  response.asString();
		
		String token =  JsonPath.from(jasonString).get("token");
		
		//Step 2: get List of books
		
		request.get("BookStore/v1/Books");
			
		Assert.assertEquals(response.getStatusCode(), 200);
		
		jasonString =  response.asString();
		
		List<Map<String, String>> mapIt =  JsonPath.from(jasonString).get("books");
		
		Assert.assertTrue(mapIt.size()>0);
		
		String isbn =  mapIt.get(0).get("isbn");
		
		//Add a book per the Auth
		
		request.header("Content-Type","application/json");
		
		request.body("{ \"userId\": \"" + userID + "\", " +
                "\"collectionOfIsbns\": [ { \"isbn\": \"" + bookId + "\" } ]}")
                .post("/BookStore/v1/Books");
		
		
		"{ \"userId\": \"" + userID + "\", " +
                "\"collectionOfIsbns\":"
                + " [ { \"isbn\": \"" + bookId + "\" } ]}
		
		request.body("userID" + userID+)
	
		{
			  "userId": "string",
			  "collectionOfIsbns": [
			    {
			      "isbn": "string"
			    }
			  ]
			}
		
		
		
	}

}
