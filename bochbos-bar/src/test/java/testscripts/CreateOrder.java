package testscripts;

import java.io.IOException;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bochbos.uriconstants.URIConstants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.jayway.jsonpath.JsonPathException;

import commonMethods.Utilities;
import io.restassured.response.ResponseBody;
import pojoclasess.PlaceOrder;

public class CreateOrder {

	// Method to Place a Order
	
	public static int id ;

	public static void createOrder() {

		Faker faker = new Faker();
		String name = faker.name().lastName();
		
		String base_url = URIConstants.API_BASE_URL;
		String url = base_url+"/api/Order";

		String email = name + "@gmail.com";
		

		PlaceOrder placeorder = new PlaceOrder();
		placeorder.setAdult(true);
		placeorder.setEmail(email);
		placeorder.setId(1);
		placeorder.setName(name);
		placeorder.setPrice("1.0");
		placeorder.setQuantity(1);
		placeorder.setTypeId(1);
		placeorder.setDate("2024-02-07T05:58:43.0208914+02:00");

		final ObjectMapper mapper = new ObjectMapper();
		String payloadPbj = null;
		try {
			payloadPbj = mapper.writeValueAsString(placeorder);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}

		ResponseBody res = null;
		try {
			res = Utilities.apiRequest(url, "Post", payloadPbj);
			System.out.println(res.asPrettyString());

		} catch (IOException e) {

			e.printStackTrace();
		}

	//	JsonPathException jsonpath = new JsonPathException(res.asString());
		id = res.path("Id");

		String actualEmailid = res.path("Email");
		String actualName = res.path("Name");

		Assert.assertEquals(email, actualEmailid);
		Assert.assertEquals(name, actualName);

	}

}
