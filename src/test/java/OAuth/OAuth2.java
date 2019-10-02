package OAuth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuth2 {

	
	@Test
	public void OAuthTestValid() {
		
		Response res = RestAssured.given()
			.auth()
			.oauth2(OAuth2GenerateAccessToken.getAcessToken())
			.post("http://coop.apps.symfonycasts.com/api/450/chickens-feed");
		
		
		System.out.println("Status Code "+res.statusCode());
		System.err.println("Body "+ res.getBody().asString());
		
		
	}
	
	@Test
	public void OAuthTestInvalid() {
		
		Response res = RestAssured.given()
			.auth()
			.oauth2(OAuth2GenerateAccessToken.getAcessToken())
			.post("http://coop.apps.symfonycasts.com/api/USER_ID/eggs-collect");
		
		
		System.out.println("Status Code "+res.statusCode());
		System.err.println("Body "+ res.getBody().asString());
		
		
	}
	
	
	
}
