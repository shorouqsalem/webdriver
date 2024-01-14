package com.qacart.todo.testCases;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.Driverfactory;

import Utils.RandomGeneration;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import model.UserModel;

@Feature("Auth feture")

public class creataccountTest {
	private   WebDriver driver;
	private String email;
    private String password;
    @Feature("Authntication")
    @Description("This methode to creat account using personal information ")
    @Story("Create A Nwe Account")
	@Test(description = "Create a new account")
	public void creatAcount() {
	    RandomGeneration randomGenerator = new RandomGeneration(); // Create an instance of RandomGeneration
		UserModel user = randomGenerator.GenerateRandomInformations();

		
		// Set up the WebDriver for Edge
		driver = new Driverfactory().initDriver();
        driver.get("https://qacart-todo.herokuapp.com/");
        //CREATE A NEW ACCOUNT
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/h2[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[1]/div/input")).sendKeys(user.getFirstName());
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/div/input")).sendKeys(user.getLastName());
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[3]/div/input")).sendKeys("rahma@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[4]/div/input")).sendKeys("@Test123");
     // Save email and password for later use
         password = user.getPassword();
         email = user.getEmail();

        

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[5]/div/input")).sendKeys("@Test123");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/button/span[1]")).click();
     
        
       

        
		
	}
	
	 public String getEmailAddress() {
	        return email;

	    }

	    public String getPassword() {
	        return password;
	    }
	 
	

}
