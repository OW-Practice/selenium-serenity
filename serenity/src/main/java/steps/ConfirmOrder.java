package steps;

import net.serenitybdd.core.pages.PageObject;
import pages.CompletePlaceOrder;

public class ConfirmOrder extends PageObject {

	CompletePlaceOrder finish;
	
	public void paymentOrder() {
		
		finish.completeOrder();
	}
}
