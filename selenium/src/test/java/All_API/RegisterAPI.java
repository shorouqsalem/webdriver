package All_API;

import static io.restassured.RestAssured.given;

import javax.management.RuntimeErrorException;

import Utils.RandomGeneration;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.response.Response;
import model.UserModel;

public class RegisterAPI {
	
	// Any thing is "private" must make geter for it 
	
	private static Cookie RestAssuredCookies;
	private static String accessToken;
	private static String userId;
	private static String firstname;
//----------------------------------------------------//
	public String getToken() {
		return this.accessToken;
	}
	
	public Cookie getCookies() {
		return this.RestAssuredCookies;
	}
	public String getUserId() {
	    return this.userId;  // Corrected method name to getUserId
	}
	
	public String getFirstName() {
	    return this.firstname;  // Corrected method name to getUserId
	}


//----------------------------------------------------//
	
	public  void register() {
	    RandomGeneration randomGenerator = new RandomGeneration(); // Create an instance of RandomGeneration

	 	//UserModel user =new UserModel("shorq@gmail.com", "@Test1234", "shrouq", "Khalil");
		
		UserModel user = randomGenerator.GenerateRandomInformations();
	 	
Response response=		
given()
	        .baseUri("https://qacart-todo.herokuapp.com")
	        .header("Content-Type","application/json")
	        .body(user)
	        .log().all()
.when()
	       .post("/api/v1/users/register")
	       
.then()
	      .log().all().extract().response();

if (response.statusCode() != 201) {
    throw new RuntimeException("Something went wrong in the request");
	
} 
//in this ststuse  Make sure that the " access_token" in the first levele inside the json file // .... Be carfull for this
RestAssuredCookies=response.detailedCookie(accessToken);
accessToken =response.path("access_token");
userId =response.path("userID");
firstname =response.path("firstName");





}


}
