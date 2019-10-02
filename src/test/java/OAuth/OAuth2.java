package OAuth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuth2 {

	
	@Test
	
	public void OAuthTest() {
		
		Response res = RestAssured.given()
			.auth()
			.oauth2(OAuth2GenerateAccessToken.getAcessToken())
			.post("http://coop.apps.symfonycasts.com/api/450/chickens-feed");
		
		
		System.out.println("Status Code "+res.statusCode());
		System.err.println("Body "+ res.getBody().asString());
		
		
	}
	
	
	
}
