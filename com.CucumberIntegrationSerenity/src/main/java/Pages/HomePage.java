package Pages;

import org.junit.Assert;

import base.BasePage;
import base.Locators;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

	BasePage bp;
	Locators loc;

	
	  public void doLogin(String username,String password) throws InterruptedException {
	  Thread.sleep(5000);  
	  bp.waitTimeforElementVisible(5000);
	  bp.typeIntoWebElement(loc.OrangeHRMLoginusername,username);
	  bp.waitTimeforElementVisible(2000);
	  bp.typeIntoWebElement(loc.OrangeHRMLoginpassword, password);
	  bp.waitTimeforElementVisible(2000);
	  bp.clickActionOnWebElement(loc.OrangeHRMLoginbutton); }
	 
//	public void doLogin() throws InterruptedException {
//		Thread.sleep(5000);
//		WebElementFacade usernamefld = $(loc.OrangeHRMLoginusername);
//		usernamefld.waitUntilPresent();
//		usernamefld.typeIntoWebElement("Admin");
//		WebElementFacade passwordfield = $(loc.OrangeHRMLoginpassword);
//		passwordfield.waitUntilPresent();
//		passwordfield.typeIntoWebElement("admin123");
//		$(loc.OrangeHRMLoginbutton).clickActionOnWebElement();
//	}

	public void assertionforpagetitle(String value) {
		String title = getDriver().getTitle();
		System.out.println(getTitle());
		Assert.assertTrue(title.contains(value));
		System.out.println("Page Title assertion is passed");
	}

	public void dashboard() {
		bp.clickActionOnWebElement(loc.OrangeHRMPIMMenu);
		bp.clickActionOnWebElement(loc.PIMAddButton);
	}

	public void AddEmployeeOperations() {
		bp.typeIntoWebElement(loc.PIMAddEmployeeFirstName, "Admin");
		bp.typeIntoWebElement(loc.PIMAddEmployeeMiddleName, "Admin");
		bp.typeIntoWebElement(loc.PIMAddEmployeeLastName, "Admin");
		bp.typeIntoWebElement(loc.PIMAddEmployeeEmployeeID, "Admin");
		bp.clickActionOnWebElement(loc.PIMAddEmployeecheckbox);
	}

	public void createlogincredentials() {
		bp.typeIntoWebElement(loc.PIMAddEmployeeUsernameField, "kashwi");
		bp.typeIntoWebElement(loc.PIMAddEmployeePasswordField, "kashwi");
		bp.typeIntoWebElement(loc.PIMAddEmployeeConfirmPasswordField, "kashwi");
		bp.clickActionOnWebElement(loc.PIMAddEmployeeSaveButton);

	}

	public void createPersonalDetails() {
		bp.clickActionOnWebElement(loc.PersonalDetailsSectionSaveButton);
		bp.clickActionOnWebElement(loc.CustomFieldsSectionSaveButton);
	}

	public void createCustomFieldsDetails() {
		bp.clickActionOnWebElement(loc.CustomFieldsSectionSaveButton);
	}
	
	public void applyleave() {
		bp.clickActionOnWebElement(loc.OrangeHRMLeaveMenu);
		bp.clickActionOnWebElement(loc.OrangeHRMAssignLeavefooterMenu);
		bp.typeIntoWebElement(loc.OrangeHRMAssignLeaveEmpNameField,"Admin");
		WebElementFacade leavetypedropdown = $(loc.OrangeHRMAssignLeaveLeaveTypedropdown);
		leavetypedropdown.click();
		leavetypedropdown.selectByValue("CAN - Personal");
		bp.clickActionOnWebElement(loc.OrangeHRMAssignLeaveConfirmAssignButton);
	
	}
}
