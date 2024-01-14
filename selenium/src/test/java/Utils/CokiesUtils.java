package Utils;

import java.util.ArrayList;
import java.util.List;

import io.restassured.http.Cookie;

public class CokiesUtils {
   public List <org.openqa.selenium.Cookie>convertRestAssuredCookiesToSeleniumCookies(List<Cookie> restAssuredCookis){
	   
	   List <org.openqa.selenium.Cookie> seleniumCookies = new ArrayList();
	   for(io.restassured.http.Cookie cookie :restAssuredCookis ) {
		   org.openqa.selenium.Cookie  seleniumCookie = new org.openqa.selenium.Cookie(cookie.getName(), cookie.getValue());
           seleniumCookies.add(seleniumCookie); 

	   } 
	   return seleniumCookies;
	   
	   
   }
}
