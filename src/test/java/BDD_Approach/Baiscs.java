package BDD_Approach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.given;

public class Baiscs {

	
	@Test
	public void test() {
		
		RestAssured.baseURI="https://maps.googleapis.com";
		
		given().	
				param("location","Museum%20of%20Contemporary%20Art%20Australia").
				param("inputtype","textquery").
				param("fields","photos,formatted_address,name,rating,opening_hours,geometry").
				param("key","AIzaSyCY5kXv_1HKqAeuJQBwBjTuJjnu2wY0GvI").
		when(). 
			get("/maps/api/place/findplacefromtext/json").
			
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
			
		
		
	}
	
	
	
}
