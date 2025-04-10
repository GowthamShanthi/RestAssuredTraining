package com.ms.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployeess {
	
	@Test
	public void getAlEmployees() {
	/*	
		RestAssured.baseURI = "http://localhost:3000/";
		
		RequestSpecification requestspecification = RestAssured.given();
		
		Response response = requestspecification.request(Method.GET, "employees");
		
		System.out.println("This is he response"+response.asPrettyString());
		
		System.out.println("This is the status code \t"+response.getStatusLine());
		
		*/
		
		
		
		RestAssured.baseURI = "http://localhost:3000/";
		
		RequestSpecification  requestspecification = RestAssured.given();
		
		Response response = requestspecification.request(Method.GET,"employees");
		
		System.out.println("This is the received response"+response.asPrettyString());
		
		
		
		
		
		
		
	}

}
