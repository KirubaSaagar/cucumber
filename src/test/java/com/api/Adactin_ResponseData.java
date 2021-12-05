package com.api;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseclass.nov.Base_Class;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Adactin_ResponseData extends Base_Class {

	@Test
	private void adactin_StatusCode() throws IOException {

		String baseuri = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\Adactin-Postman.xlsx", 0, 4, 0);
		
		RestAssured.baseURI = baseuri;
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		String hotelurl = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\Adactin-Postman.xlsx", 0, 5, 1);
		
		Response response = requestSpecification.get(hotelurl);
		
		int statusCode = response.getStatusCode();
		
		String expectedresponse = ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\Adactin-Postman.xlsx", 0, 4, 3);
	
		int parseInt = Integer.parseInt(expectedresponse);
		
		Assert.assertEquals(statusCode, parseInt);
		
		System.out.println("Data validation successfull");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
