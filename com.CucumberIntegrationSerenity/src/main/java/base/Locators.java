package base;

import org.openqa.selenium.By;

public class Locators {
//	public   By  OrangeHRMLoginusername= "cssSelector=[name='username']";
//	public   By  OrangeHRMLoginpassword="xpath=//input[@name='password']";
//	public   By  OrangeHRMLoginbutton= "cssSelector=button.orangehrm-login-button";
//	public   By OrangeHRMPIMMenu= By.xpath("//ul[@class='oxd-main-menu'] //li //span[text()='PIM']");
	public By PIMAddButton = By.cssSelector("div.orangehrm-header-container button[type='button']");
	public By PIMAddEmployeeFirstName = By.cssSelector("input[name='firstName']");
	public By PIMAddEmployeeMiddleName = By.cssSelector("input[name='middleName']");
	public By PIMAddEmployeeLastName = By.cssSelector("input[name='lastName']");
	public By PIMAddEmployeeEmployeeID = By.cssSelector("div.oxd-grid-2 input.oxd-input--active");
	public By PIMAddEmployeecheckbox = By.cssSelector("input[type='checkbox']");
	public By PIMAddEmployeeUsernameField = By.xpath("//label[text()='Username']//following::input)[1]");
	public By PIMAddEmployeePasswordField = By.cssSelector("div.user-password-cell input[type='password']");
	public By PIMAddEmployeeConfirmPasswordField = By
			.xpath("//label[text()='Confirm Password']//following::input[@type='password']");
	public By PIMAddEmployeeSaveButton = By.cssSelector("button[type='submit']");
	public By PersonalDetailsSectionSaveButton = By.cssSelector(".orangehrm-vertical-padding button[type=submit]");
	public By CustomFieldsSectionSaveButton = By.cssSelector(".orangehrm-custom-fields button[type='submit']");
	public By OrangeHRMLoginusername = By.cssSelector("[name='username']");
	public By OrangeHRMLoginpassword = By.xpath("//input[@name='password']");
	public By OrangeHRMLoginbutton = By.cssSelector("button.orangehrm-login-button");
	public By OrangeHRMPIMMenu = By.xpath("//ul[@class='oxd-main-menu'] //li //span[text()='PIM']");
	public By OrangeHRMLeaveMenu = By.xpath("//ul[@class='oxd-main-menu'] //li //span[text()='Leave']");
	public By OrangeHRMAssignLeavefooterMenu = By.xpath("//a[text()='Assign Leave']");
	public By OrangeHRMAssignLeaveEmpNameField = By.cssSelector("input[placeholder='Type for hints...']");
	public By OrangeHRMAssignLeaveLeaveTypedropdown = By.cssSelector(".oxd-select-text-input");
	public By OrangeHRMAssignLeaveFromDateCalendarField = By
			.xpath("(//label[text()='From Date']//following::input[@placeholder='yyyy-mm-dd'])[1]");
	public By OrangeHRMAssignLeaveToDateCalendarField = By
			.xpath("(//label[text()='To Date']//following::input[@placeholder='yyyy-mm-dd'])[1]");
	public By OrangeHRMAssignLeaveCommentsField = By.cssSelector("textarea.oxd-textarea");
	public By OrangeHRMAssignLeaveConfirmAssignButton = By.cssSelector("button[type='submit']");

}
