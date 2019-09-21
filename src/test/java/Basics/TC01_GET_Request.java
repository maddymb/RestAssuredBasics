package Basics;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC01_GET_Request {

	@Test
	public void getWeatherDetails() {
		
		// Specify the base URI
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		// Request Object
		RequestSpecification httpRequest=RestAssured.given();
		
		// Response Object 
		Response httpResponse=httpRequest.request(Method.GET,"/Pune");
		
		System.out.println("Response "+httpResponse.getBody().asString());
		
		//Status Code Validation
		
		System.out.println("Status Code "+httpResponse.getStatusCode());
		
		// Status Line Validation
		
		System.out.println("Status Line "+httpResponse.getStatusLine());
		
		//Getting Specific Json Value 
		System.out.println("Temperature " +httpResponse.jsonPath().get("Temperature"));
		
		//Getting Headers
		
		System.out.println(httpResponse.getHeaders());
		
		//Getting Header Value
		
		System.out.println("Content-Type Value "+httpResponse.header("Content-Type"));
		
		//Verifying Response Body
		
		Assert.assertEquals(httpResponse.getBody().asString().contains("Pune"),true);
		
	}
	@Test
	public void getEmployees() {
		
		// Specify the base URI
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees";
		
		// Request Object
		RequestSpecification httpRequest=RestAssured.given();
		
		// Response Object 
		Response httpResponse=httpRequest.request(Method.GET);
		
		System.out.println("Response "+httpResponse.getBody().asString());
		
		//Status Code Validation
		
		System.out.println("Status Code "+httpResponse.getStatusCode());
		
		// Status Line Validation
		
		System.out.println("Status Line "+httpResponse.getStatusLine());
		
		//Getting Specific Json Value 
		System.out.println("Temperature " +httpResponse.jsonPath().get("Temperature"));
		
		//Getting Headers
		
		System.out.println(httpResponse.getHeaders());
		
		//Getting Header Value
		
		System.out.println("Content-Type Value "+httpResponse.header("Content-Type"));
		
		//Verifying Response Body
		
		Assert.assertEquals(httpResponse.getBody().asString().contains("Pune"),true);
		
	}
	
	
	
}
