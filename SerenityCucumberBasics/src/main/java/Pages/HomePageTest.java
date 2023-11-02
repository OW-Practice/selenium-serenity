package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import base.BasePageTest;
import base.LocatorsTest;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePageTest extends PageObject {

	BasePageTest bp;
	LocatorsTest loc;

	
	public void loginCred(String username,String password) throws InterruptedException {
		Thread.sleep(5000);
		WebElementFacade usernamefld = $(loc.OrangeHRMLoginusername);
		usernamefld.waitUntilPresent();
		usernamefld.type(username);
		WebElementFacade passwordfield = $(loc.OrangeHRMLoginpassword);
		passwordfield.waitUntilPresent();
		passwordfield.type(password);
		
	}
	
	
	public void submitCred() {
		WebElementFacade logbtn = $(loc.OrangeHRMLoginbutton);
		logbtn.waitUntilPresent();
		logbtn.click();
	}

	public void assertionforpagetitle(String value) {
		String title = getDriver().getTitle();
		System.out.println(getTitle());
		Assert.assertTrue(title.contains(value));
		System.out.println("Page Title assertion is passed");
	}

	public void dashboardPIMclick() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElementFacade PIMbtn = $(loc.OrangeHRMPIMMenu);
		PIMbtn.waitUntilPresent();
		PIMbtn.click();
		
		
	}
	
	public void dashboardAddclick() {
		WebElementFacade Addbtn = $(loc.PIMAddButton);
		Addbtn.waitUntilPresent();
		Addbtn.click();
	}
	
		

	public void AddEmployeeOperations(String firstname,String middlename,String lastname,String employeeid) {
		
		WebElementFacade EmpFirstName = $(loc.PIMAddEmployeeFirstName);
		EmpFirstName.waitUntilPresent();
		EmpFirstName.type(firstname);
		
		WebElementFacade EmpMiddleName = $(loc.PIMAddEmployeeMiddleName);
		EmpMiddleName.waitUntilPresent();
		EmpMiddleName.type(middlename);
		
		WebElementFacade EmpLastName = $(loc.PIMAddEmployeeMiddleName);
		EmpLastName.waitUntilPresent();
		EmpLastName.type(lastname);
		
		WebElementFacade Empid = $(loc.PIMAddEmployeeEmployeeID);
		Empid.waitUntilPresent();
		Empid.type(employeeid);
		
	}
	
	
	
	public void addCreatelogindetails(String NewUsername,String NewPassword,String Confirmpassword) {
		
		WebElementFacade checkbox = $(loc.PIMAddEmployeecheckbox);
		checkbox.waitUntilPresent();
		checkbox.click();
		
		WebElementFacade newusername = $(loc.PIMAddEmployeeUsernameField);
		newusername.waitUntilPresent();
		newusername.type(NewUsername);
		
		WebElementFacade newpasswrd = $(loc.PIMAddEmployeePasswordField);
		newpasswrd.waitUntilPresent();
		newpasswrd.type(NewPassword);
		
		WebElementFacade confrmnewpasswrd = $(loc.PIMAddEmployeeConfirmPasswordField);
		confrmnewpasswrd.waitUntilPresent();
		confrmnewpasswrd.type(Confirmpassword);
		
	}

	public void savelogincredentials() {

		WebElementFacade savebtn = $(loc.PIMAddEmployeeSaveButton);
		savebtn.waitUntilPresent();
		savebtn.click();
		
	}
//
//	public void createPersonalDetails() {
//		bp.clickActionOnWebElement(loc.PersonalDetailsSectionSaveButton);
//		bp.clickActionOnWebElement(loc.CustomFieldsSectionSaveButton);
//	}
//
//	public void createCustomFieldsDetails() {
//		bp.clickActionOnWebElement(loc.CustomFieldsSectionSaveButton);
//	}
//	
//	public void applyleave() {
//		bp.clickActionOnWebElement(loc.OrangeHRMLeaveMenu);
//		bp.clickActionOnWebElement(loc.OrangeHRMAssignLeavefooterMenu);
//		bp.typeIntoWebElement(loc.OrangeHRMAssignLeaveEmpNameField,"Admin");
//		WebElementFacade leavetypedropdown = $(loc.OrangeHRMAssignLeaveLeaveTypedropdown);
//		leavetypedropdown.click();
//		leavetypedropdown.selectByValue("CAN - Personal");
//		bp.clickActionOnWebElement(loc.OrangeHRMAssignLeaveConfirmAssignButton);
//	
//	}
}
