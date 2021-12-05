package com.testng.features;

import org.testng.annotations.Test;

public class Timeout_Concept {

	@Test(timeOut = 5000)
	private void login() throws InterruptedException {

		System.out.println("browser launched");
		
		Thread.sleep(3000);
		
		System.out.println("url passed");
		
		//Thread.sleep(3000);
		
		System.out.println("user enter user name,password");
		
		System.out.println("user clicked the login button");
		
		System.out.println("Homepage opens");
	}
	
}
