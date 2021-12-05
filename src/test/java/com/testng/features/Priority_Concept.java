package com.testng.features;

import org.testng.annotations.Test;

public class Priority_Concept {
	
	@Test(priority = -1)
	private void women() {
		
      System.out.println("women");
	}
	
	@Test(priority = 1,enabled = false)
	private void tshirts() {

		System.out.println("Tshirts");
		
	}
	
	@Test(priority = 0)
	private void dresses() {

		System.out.println("Dresses");
		
	}
	
	@Test(priority = 2)
	private void pants() {

		System.out.println("pants");
	}

}
