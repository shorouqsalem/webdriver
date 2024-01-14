package All_API;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response; // Correct import for REST Assured Response class



import model.Task;

public class TaskAPI {
	
	public  void addTask(String token) {
		Task task = new Task("Learn Selenium", false);
Response response =	given()	
	
        .baseUri("https://qacart-todo.herokuapp.com")
        .header("Content-Type","application/json")
        .body(task)
     // to store the bariar token
        .auth().oauth2(token)
	
	.when()
	       .post("/api/v1/tasks")
	       
	       
	       
	  .then()
	         .log().all().extract().response();

if(response.statusCode() != 200) {
	
	throw new RuntimeException("Something went wrong in adding the todo");
}        
       
        
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
        
        
        
        
        
        
        
        
        
	}

}
