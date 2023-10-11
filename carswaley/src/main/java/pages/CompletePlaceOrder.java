package pages;

import locaters.DemoBlazeLocaters;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CompletePlaceOrder extends PageObject {
	
	DemoBlazeLocaters db;
	
	public void completeOrder() {
		WebElementFacade place=$(db.btnPlaceOrder);
		place.isPresent();
		place.click();
		$(db.cstmrName).type("Optimworks Private Ltd Pvt");
		$(db.cstmCardNumber).type("41111111111110");
		$(db.cstmrCardMonth).type("1240");
		$(db.cstmrCardyear).type("2043");
		$(db.btnPurchaseOrder).click();
		WebElementFacade confirmationPopup=$(db.successPopup);
		confirmationPopup.isDisplayed();
	//	Serenity.takeScreenshot();
		
	}
	
	

}
