package com.qacart.todo.base;
// في هذا الكلاس بحط االكودات اللي رح تتكرر في كل 
//page

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	protected WebDriver driver;
	
	// The driver that inside the  condtructer make (bring the value from test case then store it in  (private WebDriver driver;)
	
	// Constructor for this class
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
//--------------------------------------------------------------------------------------------------------------
     // To initionlization the Elements Must use "initElements" method without it the elements is not initionlization
	// The "initElements" method take Two arguments (driver , the page that contain the element)
	// this == LoginPage
//--------------------------------------------------------------------------------------------------------------
		
		PageFactory.initElements(driver, this);
		
	}

}
