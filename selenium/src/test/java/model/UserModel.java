package model;
//  .... This class for write the "response body" dynamiclly

public class UserModel {
	//THis is the POJO class && All POJO calass contain ( attribute / geter/ seter and constructer)
	
	// Attribute
	private String Email;
	private String Password;
	private String FirstName;
	private String LastName;
	
	// Constructer 
	public UserModel( String email,String password,String firstName,String lastName) {
		 this.Email= email;
		 this.Password=password;
		this.FirstName=firstName;
		 this.LastName=lastName;
	
	}
	// Seter and geter
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	

}
