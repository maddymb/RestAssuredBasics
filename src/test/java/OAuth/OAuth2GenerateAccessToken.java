package OAuth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuth2GenerateAccessToken {

	
	
	public static String getAcessToken() {
		
		Response res = RestAssured
		.given()
		.formParam("client_id", "RestAssuredOAuth2.0")
		.formParam("client_secret", "d80f26a2feb63b9a920551273ddfc618")
		.formParam("grant_type", "client_credentials")
		.post("http://coop.apps.symfonycasts.com/token");
		
		
	//	System.out.println("Status Code "+res.statusCode());
	//	System.err.println("Body "+ res.jsonPath().prettify());
		
		String accessToken= res.jsonPath().get("access_token");
		
	//	System.out.println("Access Token "+accessToken);
		return accessToken;
		
		
		
		
	}
	
	
	
}
