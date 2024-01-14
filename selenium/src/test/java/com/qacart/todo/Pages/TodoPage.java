package com.qacart.todo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qacart.todo.base.BasePage;

public class TodoPage extends BasePage {

	public TodoPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css  = "[data-testid=\"welcome\"]")
    private	WebElement welcomeMassage;
	
	
	public boolean isWelcomeMassageDisplaied() {
	return	welcomeMassage.isDisplayed();
		
	}
	// todo element (the text that entered by user)
	
	@FindBy(css  = "[data-testid=\"todo-item\"]")
    private	WebElement todoItem;
	
	
	
	public String  getTodoText() {
		return todoItem.getText();
		
	}
	
	
	

}
