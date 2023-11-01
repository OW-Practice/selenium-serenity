package pages;

import locaters.CartLocaters;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddShippingDetails extends PageObject {
	
	CartLocaters cart;
	
	public void verifyCartInformationPage() {
		
		WebElementFacade info = $(cart.txtcartinformation);
		info.isDisplayed();
		System.out.println(info.getText());
	}
	public void addCustomerFirstName(String firstname) {
		WebElementFacade username=$(cart.fldFirstName);
		username.type(firstname);
		
	}
	public void addCustomerLastName(String lastname) {
		WebElementFacade userlastname=$(cart.fldLastName);
		userlastname.type(lastname);
		
	}
	public void addCustomerZipcode(String zipcode) {
		WebElementFacade userzipcode=$(cart.fldPincode);
		userzipcode.type(zipcode);
		
	}
	public void clickonContinueButton() {
		$(cart.btnContinue).waitUntilClickable().click();
	}
	

}
