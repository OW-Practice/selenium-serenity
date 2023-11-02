package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.AddShippingDetails;
import pages.CartCheckout;
import pages.VerifyTheConfirmationPage;

public class CartcheckoutSteps extends PageObject{
	
	CartCheckout check;
	AddShippingDetails ship;
	VerifyTheConfirmationPage conf;
	
	@Step
	public void verifyCartIcon() {
		check.verifyCartIcon();
	}
	@Step
	public void navigateUserTocart() {
		check.navigateUserToCart();
	}
	@Step
	public void verifyCartScreen() {
		check.verifyCartScreen();
	}
	@Step
	public void removItemFromCart() {
		check.removeItemFromCart();
	}
	@Step
	public void verifyCheckoutButton() {
		check.verifyCheckoutButton();
	}
	@Step
	public void clickOnCheckoutButton() {
		check.clickOnCheckoutButton();
	}
	@Step
	public void verifyCartInformationPage() {
		ship.verifyCartInformationPage();
	}
	@Step
	public void addCustomerFirstName(String firstname) {
		ship.addCustomerFirstName(firstname);
	}
	@Step
	public void addCustomerLastName(String lastname) {
		ship.addCustomerLastName(lastname);
	}
	@Step
	public void addCustomerZipcode(String zipcode) {
		ship.addCustomerZipcode(zipcode);
	}
	@Step
	public void clickonContinueButton() {
	   ship.clickonContinueButton();
	}
	@Step
	public void verifyOverview() {
	   conf.verifyOverview();
	}
	@Step
	public void verifyPaymentInfo() {
	   conf.verifyPaymentInfo();
	}
	@Step
	public void verifyShippingInfo() {
	   conf.verifyShippingInfo();
	}
	@Step
	public void verifyFinishButton() {
	   conf.verifyFinishButton();
	}
	@Step
	public void clickOnFinishButton() {
	   conf.clickOnFinishButton();
	}
	@Step
	public void verifyCompleteCartscreen() {
	   conf.verifyCompleteCartscreen();
	}
	@Step
	public void verifyConfirmationPopup() {
	   conf.verifyConfirmationPopup();
	}
	@Step
	public void clickOnBackToHomeButton() {
	   conf.clickOnBackToHomeButton();
	}
}
