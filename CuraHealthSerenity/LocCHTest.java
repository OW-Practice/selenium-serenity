package CuraHealthSerenity;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class LocCHTest extends PageObject {

	public By USER_NAME_FIELD = By.cssSelector("input#txt-username");
//	public static By USER_NAME_FIELD 									= By.cssSelector("placeholder='Username']:nth-child(1)");

	public static By PASSWORD_FIELD = By.xpath("//input[@id='txt-password']");
	public static By LOGIN_BUTTON = By.xpath("//button[@id='btn-login']");
	public static By MENU_BUTTON_ON_LAUNCH_PAGE = By.cssSelector("a#menu-toggle");
	public static By MENU_BUTTON_ON_LOGIN_LINK = By.cssSelector("a[href='profile.php#login']");
	public static By MAKE_APPOINTMENT_ON_LAUNCH_PAGE = By.cssSelector("a#btn-make-appointment");
	public static By MENU_BUTTON_ON_LOGOUT_LINK = By.xpath("//a[@href='authenticate.php?logout']");
	public static By FACILITY_DROPDOWN_FIELD_IN_MAKE_APPOINTMENT = By.xpath("//select[@id='combo_facility']");
	public static By CHECKBOX_IN_MAKE_APPOINTMENT = By.xpath("//input[@id='chk_hospotal_readmission']");
	public static By HEALTHCARE_PROGRAM_RADIO_BUTTON_MEDICARE_IN_MAKE_APPOINTMENT = By.cssSelector("[#radio_program_medicare]");
	public static By HEALTHCARE_PROGRAM_RADIO_BUTTON_MEDICAID_IN_MAKE_APPOINTMENT = By.cssSelector("[#radio_program_medicaid");
	public static By VISIT_DATE_FIELD_IN_MAKE_APPOINTMENT = By.xpath("//input[@id='txt_visit_date']");
	public static By COMMENTS_FIELD_IN_MAKE_APPOINTMENT = By.xpath("//textarea[@id='txt_comment']");
	public static By SUBMIT_BOOKAPPOINTMENT_IN_MAKE_APPOINTMENT = By.xpath("//button[@id='btn-book-appointment']");
	public static By MAKE_APPOINTMENT_BUTTON_ON_LAUNCH_PAGE = By.xpath("//a[@id='btn-make-appointment']");
	public static By GO_TO_HOMEPAGE_LINK = By.xpath("//a[text()='Go to Homepage']");
	public static By GO_TO_PROFILE_LINK = By.xpath("//a[@href='profile.php#profile']");

}
