package com.qacart.todo.Pages;

import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qacart.todo.base.BasePage;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.testCases.creataccountTest;

import io.qameta.allure.Step;
import net.bytebuddy.asm.Advice.Return;

public class LoginPage  extends BasePage{
	creataccountTest creataccounttest = new creataccountTest();


	
	public LoginPage(WebDriver driver) {
		super(driver);
	}


	// THIS is all elements in login page
	
	@FindBy(css  = "[data-testid=\"email\"]")
    private	WebElement emailInput;
	
	@FindBy(css = "[data-testid=\"password\"]")
	private	WebElement passwordInput;
	
	@FindBy(css = "[data-testid=\"submit\"]")
	private	WebElement submitButton;
	
	@Step("Loade the login page ")
	public void load() {


		driver.get("https://qacart-todo.herokuapp.com/");
		
	}
	@Step("Enter the email and password")
	public void loginoperation(String email, String password) {

		emailInput.sendKeys(email);
      passwordInput.sendKeys(password);
      submitButton.click();
      
	}
	
	
	
	
	

	
}
