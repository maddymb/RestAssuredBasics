package Basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC03_Auth_Request {

	@Test
	public void authTest() {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication/";
		
		// Auth Validation
		
		PreemptiveBasicAuthScheme authScheme= new PreemptiveBasicAuthScheme();
		authScheme.setUserName("ToolsQA");
		authScheme.setPassword("TestPassword");
		
		RestAssured.authentication=authScheme;
		
		RequestSpecification request = RestAssured.given();

		Response response = request.get();
		System.out.println("Status code: " + response.getStatusCode());
		System.out.println("Status message " + response.body().asString());
		System.out.println("Status message " + authScheme.getPassword());
		
		
	}
	
	
	
}
