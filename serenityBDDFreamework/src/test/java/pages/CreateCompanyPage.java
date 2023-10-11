package pages;

import Locators.Companies;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateCompanyPage extends PageObject{
	Companies company;
	
	
	public void clickAddnewButton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElementFacade createNewButton = find(company.createNewButton);
		createNewButton.shouldBeVisible();
	    createNewButton.click();
	}
	
	public void verifyCreateCompaniesPopupDisplayed() {
		WebElementFacade createCompanyPopup = find(company.createCompanyPopup);
		createCompanyPopup.shouldBeVisible();
	}
	public void enterDetailsCreateCompanyPopup(String name,String street,String streetNumber,String city,String state,String postcode) {
		typeInto($(company.nameField),name);
		typeInto($(company.street),street);
		typeInto($(company.streetNumber),streetNumber);
		typeInto($(company.city),city);
		typeInto($(company.state),state);
		typeInto($(company.postCode),postcode);
		}
	
	public void clickSaveButtonCompany() {
		WebElementFacade saveCompany = find(company.saveButton);
		saveCompany.shouldBeVisible();
		saveCompany.click();
	}
}