package com.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Response_Code_Validation {
	
	@Test
	private void data_Validation() {

		RestAssured.baseURI = "https://reqres.in";
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		Response response = requestSpecification.get("/api/users?page=2");
		
		String response_Body = response.asString();
		
		System.out.println(response_Body);

		int statusCode = response.getStatusCode();
		
		String statusLine = response.getStatusLine();
		
		ResponseBody body = response.body();
		
		String contentType = response.getContentType();
		
		String sessionId = response.getSessionId();
		
		Headers headers = response.getHeaders();
		
		long time = response.getTime();
		
		System.out.println("time : "+time);
		
		System.out.println("Headers : "+headers);
		
		System.out.println("session id : "+sessionId);
		
		System.out.println("content type : "+contentType);
		
		System.out.println("Body : "+ body);
		
		System.out.println("status line : "+ statusLine);
		
		System.out.println("status code : "+ statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		System.out.println("Data validation successful");
		
	}

}
