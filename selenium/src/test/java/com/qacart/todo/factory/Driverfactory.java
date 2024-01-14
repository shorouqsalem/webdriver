package com.qacart.todo.factory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	 private   WebDriver driver;
	
	
	public WebDriver initDriver() {
		
		// The "browser" argument in getProperty method 
		// same the variable that send by  command "mvn clean test -Dbrowser = chrome" from terminal
		//-----------------------------------------------------------------------------------------
		// the "EDGE" argument is the defult browser
		String browser = System.getProperty("browser","EDGE");
		
		switch (browser) {
		case "CHROME":
			 WebDriverManager.chromedriver().setup();
		      driver = new ChromeDriver();
			
			
			break;
		case "EDGE":
			 WebDriverManager.edgedriver().setup();
		      driver = new EdgeDriver();
			
			
			break;
			
			

		default:throw new RuntimeException("The Browser is not suported");
			
		}
		
		
		
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        return driver ;
	        
	        
	        
	        
	}


}
