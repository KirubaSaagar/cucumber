package com.testng.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest2 {
	
	@Test
	@Parameters({"sername","jerseyno"})
	private void credentials(@Optional("hitman")String username, String jerseyno) {

		System.out.println("username is "+ username);
		
		System.out.println("jerseyno is "+ jerseyno);
		
		int parseInt = Integer.parseInt(jerseyno);
		
		System.out.println(parseInt+65);
	}

}
