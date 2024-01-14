package com.qacart.todo.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qacart.todo.factory.Driverfactory;

import Utils.CokiesUtils;
import io.qameta.allure.Allure;
import io.restassured.http.Cookie;

public class BaseTest {
	
	 protected ThreadLocal<WebDriver>  driver= new ThreadLocal();
	  
	 public void setDriver(WebDriver driver) {
		 
		 this.driver.set(driver);
		 
	 }
	 
public WebDriver getDriver() {
		 
	return	 this.driver.get();
		 
	 }
	 
	 @BeforeMethod
	 public void setup() {
		 WebDriver driver =	driver = new Driverfactory().initDriver();
		 setDriver(driver);

		 

	 }
	 
	 
	 @AfterMethod
	 public void teardown(ITestResult result) {
	//THE "ITestResult" is an class make store the name of any method that call"@AfterMethod" and store it in "result"
		 
		  String testcaseName=      result.getMethod().getMethodName();
		  File destFile = new File ("target"+ File.separator +"ScreenShots"+ File.separator + testcaseName +".pmg");
		 
		  takescreenshot(destFile);
		 
		 getDriver().quit();
		 
		 
	 }
	 
	 public void injectCookisToBrowser(List<Cookie> restAssuredCookies) {
		 
		 CokiesUtils cookiesutils = new CokiesUtils();
		  List < org.openqa.selenium.Cookie> seleniumCookies = cookiesutils.convertRestAssuredCookiesToSeleniumCookies(restAssuredCookies);
		  for(org.openqa.selenium.Cookie cookie : seleniumCookies) {
			  
			  // Add all cookies that converted To selenium by this method "convertRestAssuredCookiesToSeleniumCookies"  to browser
			  getDriver().manage().addCookie(cookie);
		  }
		 
	 }
	 
	public void takescreenshot(File DestinationFile) {
		
		// Take ScreenShot and store it in output as FILE data type
		File fileScreenShot=	 ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			// take cope from file 
			FileUtils.copyFile(fileScreenShot, DestinationFile);
			// convert the copy frome "file" DataType to "InputStream" DataType until I can pass it to "FileInputStream" class
			InputStream is = new FileInputStream(DestinationFile);
			Allure.addAttachment("ScreenSHOTE", is);
			
			System.out.println("Done To Take Screenshot");
		} catch (IOException e) {
			System.out.println("Fail To Take Screenshot");
			e.printStackTrace();
		}
		
		
	}

}
