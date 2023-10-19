package steps;

import net.serenitybdd.core.pages.PageObject;
import pages.PlaceOrder;

public class AddToCard extends PageObject {
	
	PlaceOrder order;
	
	
	public void buyOrder(){
		
		order.purchaseOrder();
		order.completeOrder();
	}

}
