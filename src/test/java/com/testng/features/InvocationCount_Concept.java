package com.testng.features;

import org.testng.annotations.Test;

public class InvocationCount_Concept {
	
	@Test(priority = 6)
	private void browserLaunch() {

		System.out.println("Browser Launched");
	}
	
	@Test(priority = 7, invocationCount = 3)
	private void refresh() {

		System.out.println("refresh");
	}
	
	@Test(priority = 8, invocationCount = 2)
	private void click() {

		System.out.println("click");
	}

}
