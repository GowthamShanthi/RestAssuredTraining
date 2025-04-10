package com.es.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateAnEmployee {
	
	
@Test	
public void createemployee() {
	
RestAssured.baseURI = "http://localhost:3000/";

RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json").body(" {\r\n"
		+ "        \r\n"
		+ "        \"first_name\": \"GowthamJun6\",\r\n"
		+ "        \"last_name\": \"VelumaniJun6\",\r\n"
		+ "        \"email\": \"gowtham.shanthi@gmail.com\"\r\n"
		+ "    }");

 Response response =   requestSpecification.request(Method.POST,"employees");
 
 
System.out.println(response.asPrettyString());
System.out.println(response.getHeader("Content-Type"));
System.out.println(response.getStatusCode());



	
}

}
