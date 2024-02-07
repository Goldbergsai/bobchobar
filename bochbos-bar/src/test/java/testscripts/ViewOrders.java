package testscripts;

import java.io.IOException;

import com.bochbos.uriconstants.URIConstants;
import com.jayway.jsonpath.JsonPathException;

import commonMethods.Utilities;
import io.restassured.response.ResponseBody;

public class ViewOrders {
	
	
	
	public static void getallOrderDetails() {
		
		String base_url = URIConstants.API_BASE_URL;
		String url = base_url+"/api/Order";
		
		 ResponseBody res = null;
		try {
			res = Utilities.apiRequest(url, "Get", "");
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 System.out.println(res.asPrettyString());
	}
	
	
	
	public static void getOrderDetailsById() {
		
		String base_url = URIConstants.API_BASE_URL;
		String url = base_url+"/api/Order/"+CreateOrder.id;
		
		 ResponseBody res = null;
		try {
			res = Utilities.apiRequest(url, "Get","");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(res.asPrettyString());
		
	}

}
