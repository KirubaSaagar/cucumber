package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Demo_Class {
	
	@Test
	private void username() {

		String name = "Starc";
		
		String ActualName = "Starc";
		
		Assert.assertEquals(name, ActualName);
	}
	
	@Test
	private void password() {

		String password = "Starc123";
		
		String ActualPassword = "Starc";
		
		Assert.assertEquals(password, ActualPassword);
	}

}
