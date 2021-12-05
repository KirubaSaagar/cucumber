package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Ignore
	@Test
	private void women() {
		
      System.out.println("women");
	}
	
	@Test(enabled=false)
	private void tshirts() {

		System.out.println("Tshirts");
		
	}
	
	@Test
	private void dresses() {

		System.out.println("Dresses");
		
	}
	
	@Test
	private void casualWear() {
		System.out.println("casual wear");
	}

}
