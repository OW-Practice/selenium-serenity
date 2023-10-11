package Steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.CreateContactPage;

public class CreateContact extends PageObject{
	
	CreateContactPage contact;
	

	@Step
	public void clickAddContact() {
		contact.clickAddContact();
	}
	@Step
	public void verifyCreateContactOptionDisplayed() {
		contact.verifyCreateContactOptionDisplayed();
	}
	public void clickCreateContactOption() {
		contact.clickCreateContactOption();
	}
	@Step
	public void verifyCreateContactPopupDisplayed() {
		contact.verifyCreateContactPopDisplayed();
	}
	@Step
	public void enterRequeredDetailsCreateContactPopup(String firstname,String lastname, String email) {
		contact.enterRequeredDetailsCreateContactPopup(firstname,lastname,email);
	}
	@Step
	public void clickSaveButton() {
		contact.clickSaveButton();
	}
	

}
