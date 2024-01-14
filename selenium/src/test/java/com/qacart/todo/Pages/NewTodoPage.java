

package com.qacart.todo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qacart.todo.base.BasePage;

import io.qameta.allure.Step;

public class NewTodoPage extends BasePage {
	 public NewTodoPage(WebDriver driver) {
	        super(driver);
	        // TODO Auto-generated constructor stub
	    }
	 // The elements in the new todo page
	 @FindBy(css = "[data-testid=\"add\"]")
	    private WebElement addTask;
//    @FindBy(css = "[data-testid=\"add\"]")
//    private WebElement addTask;

    @FindBy(css = "[data-testid=\"new-todo\"]")
    private WebElement newTodo;

    @FindBy(css = "[data-testid=\"submit-newTask\"]")
    private WebElement submitNewTask;

   

	@Step("Add new to do")
    public void newTodoOperation(String newtodo) {
        addTask.click();
        newTodo.sendKeys(newtodo);
        submitNewTask.click();
    }
    
    
     // The elements in the delete the task page 
    @FindBy(css = "[data-testid=\"delete\"]")
    private WebElement deleteTask;
    
    // Methode for Delete the Task
	@Step("Make Delete")
    public void deleteTask() {
    	deleteTask.click();
    	
    }
    
    // The no todo msg is displaied
    @FindBy(css = "[data-testid=\"no-todos\"]")
    private WebElement notodomsg;
	@Step("Check the deleted massage is displayed")
    public boolean notodomsgisDisplay() {
    	
    	return 	notodomsg.isDisplayed();
    	
    }
    
    

    
}

