package steps;

import net.serenitybdd.core.pages.PageObject;
import pages.FinishPlaceOrder;

public class ConfirmOrder extends PageObject {

	FinishPlaceOrder finish;
	
	public void paymentOrder() {
		
		finish.completeOrder();
	}
}
