package APITest;


import static io.restassured.RestAssured.given;

import java.util.Map;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestRequestRunner {
	
	public static Response runRequestWithGivenParams(String userName, String password,Map<String,String> headers,String baseUri,Map<String,String> requestBody) {  
     		 
		 // Building request by using requestSpecBuilder
		 RequestSpecBuilder builder = new RequestSpecBuilder();
		 
		 //Set API's Headers
		 if(headers!=null) {
			 builder.addHeaders(headers); 
		 }

		 //Add required API's parameters
		 builder.addParams(requestBody);
		 
		 //Setting content type as application/json
		 builder.setContentType("application/json; charset=UTF-8");
		 
		 RequestSpecification requestSpec = builder.build();
		
				 
		 //Configure with required parametes and run the service
		 Response response = given() 
		        .auth()
		        .preemptive()
		        .basic(userName, password)
		        .relaxedHTTPSValidation()
				.spec(requestSpec)
			    .when()
				.request(Method.GET,baseUri);
		
	return response;
	}

}
