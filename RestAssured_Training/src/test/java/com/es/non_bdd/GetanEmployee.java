package com.es.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetanEmployee {

	
@Test	
public void GetEmployee() {
	
RestAssured.baseURI = "http://localhost:3000/";

RequestSpecification requestSpecification = RestAssured.given();


Response response = requestSpecification.request(Method.GET,"employees/8");

System.out.println("The Response body is  response"+response.asPrettyString());

System.out.println("The status code is"+response.getStatusCode());

//Test
}
	
}
