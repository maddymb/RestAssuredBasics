package Basics;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC02_POST_Request {

	@SuppressWarnings("unchecked")
	@Test
	public void registrationApiTest() {
		
		RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1";
		
		RequestSpecification httpRequest=RestAssured.given();
		
		//Request Payload
		JSONObject requestParam = new JSONObject();
		
		requestParam.put("name", "MadhurB");
		requestParam.put("salary", "6");
		requestParam.put("age", "26");
		requestParam.put("id", "5");
		
		httpRequest.header("Content-Type","application/json");
		
		httpRequest.body(requestParam.toJSONString());
		
		Response response=httpRequest.request(Method.POST,"/create");
			
		System.out.println("Status Code "+response.getStatusCode());
		
		System.out.println("Response "+response.getBody().asString());
		
	}
	
	
	
	
}
