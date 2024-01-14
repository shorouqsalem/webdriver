package com.qacart.todo.testCases;

import All_API.RegisterAPI;

public class Dummy {

	public static void main(String[] args) {
		
		RegisterAPI registerAPI=new RegisterAPI();
		registerAPI.register();
		

	System.out.println(registerAPI.getToken());	
	System.out.println(registerAPI.getUserId());	 	
	System.out.println(registerAPI.getFirstName());	 	


}}
