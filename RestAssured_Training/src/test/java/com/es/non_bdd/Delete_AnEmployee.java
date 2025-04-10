package com.es.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete_AnEmployee {
	

@Test	
public void deleteemployee() {
	
RestAssured.baseURI = "http://localhost:3000/";

RequestSpecification requestSpecification = 
RestAssured.
given();

 Response response =    requestSpecification.
		 request(Method.
				 DELETE,"employees/6");
 
System.out.
println("The Response is"+response.asPrettyString());
System.out.
println("The resposne code is"+response.getStatusCode());









	
}

}
