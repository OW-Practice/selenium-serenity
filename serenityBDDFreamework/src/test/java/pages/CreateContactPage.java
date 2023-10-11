package pages;

import Locators.ContactsPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateContactPage extends PageObject {
	
	ContactsPage contact;
	
	public void clickAddContact() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElementFacade AddcontactButton = find(contact.addContactButton);
		AddcontactButton.shouldBeVisible();
		AddcontactButton.click();
	}
	public void verifyCreateContactOptionDisplayed() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElementFacade CreatecontactButton = find(contact.createContact);
		CreatecontactButton.shouldBePresent();
		CreatecontactButton.shouldBeVisible();
		
	}
	
	public void clickCreateContactOption() {
		WebElementFacade CreatecontactButton = find(contact.createContact);
		CreatecontactButton.shouldBeVisible();
		CreatecontactButton.click();
	}
	
	public void verifyCreateContactPopDisplayed() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElementFacade CreatecontactPopup = find(contact.contactPopup);
		CreatecontactPopup.shouldBeVisible();
	}
	
	public void enterRequeredDetailsCreateContactPopup(String firstname,String lastname, String email) {
	typeInto($(contact.firstname),firstname);
	typeInto($(contact.lastname),lastname);
	typeInto($(contact.email),email);
	}
	
	public void clickSaveButton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElementFacade saveButton = find(contact.saveButton);
		//saveButton.shouldBeVisible();
		saveButton.click();
	}

}
