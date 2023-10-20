package steps;

import net.serenitybdd.core.pages.PageObject;
import pages.OrderPlace;

public class AddToCard extends PageObject {
	
	OrderPlace order;
	
	
	public void buyOrder(){
		
		order.purchaseOrder();
		order.completeOrder();
	}

}
