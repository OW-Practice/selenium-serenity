package pages;

import locaters.DemoBlazeLocaters;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CompletePlaceOrder extends PageObject {

	DemoBlazeLocaters locaters;

	public void completeOrder() {
		WebElementFacade place = $(locaters.btnPlaceOrder);
		place.isPresent();
		place.click();
		$(locaters.cstmrName).type("Optimworks Private Ltd Pvt");
		$(locaters.cstmCardNumber).type("41111111111110");
		$(locaters.cstmrCardMonth).type("1240");
		$(locaters.cstmrCardyear).type("2043");
		$(locaters.btnPurchaseOrder).click();
		WebElementFacade confirmationPopup = $(locaters.successPopup);
		confirmationPopup.isDisplayed(); //
		Serenity.takeScreenshot();

	}

}
