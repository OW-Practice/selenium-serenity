package pages;

import locaters.CartLocaters;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VerifyTheConfirmationPage extends PageObject {
	
	CartLocaters loc;
	
	public void verifyOverview() {
		WebElementFacade over=$(loc.txtCheckoutoverview);
		over.isDisplayed();
		System.out.println(over.getText());
	}
	public void verifyPaymentInfo() {
		WebElementFacade payment=$(loc.txtPaymentInformation);
		payment.isDisplayed();
		System.out.println(payment.getText());
	}
	public void verifyShippingInfo() {
		WebElementFacade shipping=$(loc.txtShippingInformation);
		shipping.isDisplayed();
		System.out.println(shipping.getText());
	}
	public void verifyFinishButton() {
		WebElementFacade finish=$(loc.btnFinish);
		finish.isDisplayed();
	}
	public void clickOnFinishButton() {
		WebElementFacade finishBtn =$(loc.btnFinish);
		finishBtn.waitUntilClickable().click();
	}
	public void verifyCompleteCartscreen() {
		WebElementFacade complete=$(loc.txtComplete);
		complete.isDisplayed();
		System.out.println(complete.getText());
	}
	public void verifyConfirmationPopup() {
		WebElementFacade confirm=$(loc.txtConfirmation);
		confirm.isDisplayed();
		System.out.println(confirm.getText());
	}
	public void clickOnBackToHomeButton() {
		$(loc.btnBackToHome).waitUntilClickable().click();
	}

}
