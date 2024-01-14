package com.qacart.todo.testCases;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qacart.todo.Pages.LoginPage;
import com.qacart.todo.Pages.TodoPage;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.Driverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
@Feature("login feature")

public class LoginTest extends BaseTest {

	@Feature("Authntication")
    @Description("This method to make login using Email and Password")

	@Story("Login With Email And Password which alredy created")
    @Test(description = "Test The login functionality using Email and Password")
    public void LoginWithemailAndPassword() {
    	
    	
    	
        
    	
        // Take An object from LOginPage Class
        LoginPage loginpage = new LoginPage(getDriver());
        // visit the website
        loginpage.load();
     
        
        loginpage.loginoperation("rahma@gmail.com","@Test123");
        TodoPage todopage = new TodoPage(getDriver());
       boolean isWelcomemsgDesplay=     todopage.isWelcomeMassageDisplaied();
        Assert.assertTrue(isWelcomemsgDesplay);
       
        
       
        


       
    }

	
    
    

}