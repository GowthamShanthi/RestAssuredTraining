package com.ms.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateEmployeeDetails {
	
	
	@Test
	public void EmployeesUpdate() {
		
		 RestAssured.baseURI = "http://localhost:3000/";
		 
		 RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json").body("{\r\n"
		 		+ "    \"id\": 2,\r\n"
		 		+ "    \"first_name\": \"Mahalakshmi Gowtham\",\r\n"
		 		+ "    \"last_name\": \"Nagaraj\",\r\n"
		 		+ "    \"email\": \"mahalakshminagaraj1197@gmail.com\"\r\n"
		 		+ "  }");
		
		 Response response = requestSpecification.request(Method.PUT,"employees/2");
				 
				 
				 System.out.println("This is the response"+response.asPrettyString());
				 
				 System.out.println("This is the conentline"+response.getStatusLine());
				 System.out.println("This is the statuscode"+response.getStatusCode()); 
				 
//				  
 
		
	}

}
