package Utils;

import com.github.javafaker.Faker;

import model.UserModel;

public class RandomGeneration {
	
	public UserModel GenerateRandomInformations () {
	
	String email =new Faker().internet().emailAddress();
	String password =new Faker().internet().password();
	String firstName =new Faker().name().firstName();
	String lastname =new Faker().name().lastName();
	
	UserModel user =new UserModel(email, password, firstName, lastname);
	return user;
	
	}
}
