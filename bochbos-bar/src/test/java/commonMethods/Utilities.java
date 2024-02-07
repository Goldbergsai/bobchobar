package commonMethods;

import java.io.IOException;

import com.jayway.jsonpath.JsonPathException;


import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;

public class Utilities {
	
	static ResponseBody res;
	
	public static ResponseBody apiRequest(String URL, String method, String body)
			throws IOException, JsonPathException {
	
//		String values[] = header.split(":");

		// Hitting the Post Request
		if (method.equalsIgnoreCase("Post")) {
			res = RestAssured.given().body(body).with().contentType("application/json")
					.then().when().post(URL);
		}
		// Hitting the put Request

		else if (method.equalsIgnoreCase("Put")) {
			res = RestAssured.given().body(body).with().contentType("application/json")
					.then().when().put(URL);
			
			// Hitting the get Request
		}else if(method.equalsIgnoreCase("Get")) {
			
			res = RestAssured.given().with().contentType("application/json").then().when()
					.get(URL);
			
		}

		return res;

	}

}
