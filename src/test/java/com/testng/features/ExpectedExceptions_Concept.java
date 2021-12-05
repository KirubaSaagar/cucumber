package com.testng.features;

import org.testng.annotations.Test;

public class ExpectedExceptions_Concept {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void demo() {

		int a=10;
		
		System.out.println(a/0);
	}

}
