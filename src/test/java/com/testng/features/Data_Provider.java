package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@DataProvider
	private Object[][] data() {

		return new Object[][] {
			
			{"rohit", 45,"hitman"},
			{"virat",18, "king"},
			{"rahul",1,"klassy"}
		};
	}
	
	
	@Test(dataProvider = "data")
	private void credentials(String name, int number, String nick) {
		
		System.out.println("username : "+ name);
		System.out.println("jersey :"+ number);
		System.out.println("nick :"+ nick);
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
