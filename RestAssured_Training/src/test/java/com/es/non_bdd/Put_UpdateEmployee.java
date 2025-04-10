package com.es.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put_UpdateEmployee {

	@Test
	public void updateemployee() {
		
		RestAssured.baseURI = "http://localhost:3000/";
		RequestSpecification requestSpecification = RestAssured
				.given()
				.header("Content-Type","application/json").body("{\r\n"
						+ "    \"first_name\": \"GowthamFirstupdated\",\r\n"
						+ "    \"last_name\": \"VelumaniFirstUpdated\",\r\n"
						+ "    \"email\": \"gowtham123.shanthi@gmail123.com\",\r\n"
						+ "    \"id\": 4\r\n"
						+ "}");
	Response response = 	requestSpecification.request(Method.PUT,"employees/4");
		
		System.out.println(response.asPrettyString());
		

				
		
	}
}
