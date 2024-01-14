package com.qacart.todo.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.expectThrows;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qacart.todo.Pages.LoginPage;
import com.qacart.todo.Pages.NewTodoPage;
import com.qacart.todo.Pages.TodoPage;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.Driverfactory;

import All_API.RegisterAPI;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import io.restassured.http.Cookie;

public class NewTodoTest extends BaseTest {
    
    TodoPage todopage = new TodoPage(getDriver());
    @Feature("To do functions")    
    @Story("Add todo (New Task)")
    @Description("This method to make new to do and comparasion <actual result> with <expected result>  ")

    @Test(description = "Should be able to add a new todo correctly")
    public void TestToDos() {
        LoginPage loginpage = new LoginPage(getDriver());
        loginpage.load();
        loginpage.loginoperation("rahma@gmail.com", "@Test123");

//        // ADD A NEW TODO
        NewTodoPage newtodopage = new NewTodoPage(getDriver());
        newtodopage.newTodoOperation("My first todo");


     // Retrieve the text and use appropriate encoding
        TodoPage todopage = new TodoPage(getDriver());
        String actualResult = todopage.getTodoText();
        String expectedText = "My first todo";

        // Use the appropriate assertion method that supports Unicode
        Assert.assertEquals(actualResult, expectedText, "Todo text does not match");
    }
    @Feature("To do functions")
    @Story("Delete todo")
    @Description("This method to delete to do")
	@Test(description = "Must delete the todo")
    public void DeleteTheTodo() {

      
      //Login
     // Take An object from LOginPage Class
        LoginPage loginpage = new LoginPage(getDriver());
        loginpage.load();
        loginpage.loginoperation("rahma@gmail.com","@Test123");
        
        
       
        // ADD A NEW TODOS
        NewTodoPage newtodopage = new NewTodoPage(getDriver());
        newtodopage.newTodoOperation("My first todo");
          
        
		 // Delete the todos
        newtodopage.deleteTask();
     
          
//        boolean isnoToDomassageDesplaied= newtodopage.notodomsgisDisplay();
//        Assert.assertTrue(isnoToDomassageDesplaied);

	        
	        
	}

}
