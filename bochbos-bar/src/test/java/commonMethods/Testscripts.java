package commonMethods;

import org.testng.annotations.Test;

import testscripts.CreateOrder;
import testscripts.ViewOrders;

public class Testscripts {

	
	@Test(priority =1)
	public static void createOrders() {

		CreateOrder.createOrder();
	}

	@Test(priority =2,dependsOnMethods="createorders")
	public static void getOrderDetailsById() {

		ViewOrders.getOrderDetailsById();

	}

	@Test(priority =3,dependsOnMethods="createorders")
	public static void getAllOrders() {

		ViewOrders.getallOrderDetails();
	}

}
