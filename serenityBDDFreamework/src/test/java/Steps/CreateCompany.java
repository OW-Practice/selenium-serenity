package Steps;


import net.serenitybdd.core.pages.PageObject;
import pages.CreateCompanyPage;


public class CreateCompany extends PageObject{
	CreateCompanyPage company;
	
	
	public void clickAddnewButton() {
		company.clickAddnewButton();
	}
	public void verifyCreateCompaniesPopupDisplayed() {
		company.verifyCreateCompaniesPopupDisplayed();
	}
	public void enterDetailsinCreateCompanyPopup(String name,String street,String streetNumber,String city,String state,String postcode) {
		company.enterDetailsCreateCompanyPopup(name,street,streetNumber,city,state,postcode);
	}
	public void clickSaveButton() {
		company.clickSaveButtonCompany();
	}
}
