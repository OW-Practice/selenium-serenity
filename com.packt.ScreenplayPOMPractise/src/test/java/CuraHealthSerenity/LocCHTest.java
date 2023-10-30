package CuraHealthSerenity;

import net.serenitybdd.core.pages.PageObject;

public class LocCHTest  {

	static String USER_NAME_FIELD = "xpath=//input[@id='txt-username']";
//	String   USER_NAME_FIELD 									=  .cssSelector("placeholder='Username']:nth-child(1)");

	static String PASSWORD_FIELD =  "xpath=//input[@id='txt-password']";
	static String LOGIN_BUTTON = "xpath=//button[@id='btn-login']";
	static String MENU_BUTTON_ON_LAUNCH_PAGE =  "cssSelector=a#menu-toggle";
	static String MENU_BUTTON_ON_LOGIN_LINK =  "cssSelector=a[href='profile.php#login']";
	static String MAKE_APPOINTMENT_ON_LAUNCH_PAGE =  "cssSelector=a#btn-make-appointment";
	static String MENU_BUTTON_ON_LOGOUT_LINK =  "xpath=//a[@href='authenticate.php?logout']";
	static String FACILITY_DROPDOWN_FIELD_IN_MAKE_APPOINTMENT =  "xpath=//select[@id='combo_facility']";
	static String CHECKBOX_IN_MAKE_APPOINTMENT =  "xpath=//input[@id='chk_hospotal_readmission']";
	static String HEALTHCARE_PROGRAM_RADIO_BUTTON_MEDICARE_IN_MAKE_APPOINTMENT =  "cssSelector=[#radio_program_medicare]";
	static String HEALTHCARE_PROGRAM_RADIO_BUTTON_MEDICAID_IN_MAKE_APPOINTMENT =  "cssSelector=[#radio_program_medicaid";
	static String VISIT_DATE_FIELD_IN_MAKE_APPOINTMENT =  "xpath=//input[@id='txt_visit_date']";
	static String COMMENTS_FIELD_IN_MAKE_APPOINTMENT =  "xpath=//textarea[@id='txt_comment']";
	static String SUBMIT_BOOKAPPOINTMENT_IN_MAKE_APPOINTMENT =  "xpath=//button[@id='btn-book-appointment']";
	static String MAKE_APPOINTMENT_BUTTON_ON_LAUNCH_PAGE = "xpath=//a[@id='btn-make-appointment']";
	static String GO_TO_HOMEPAGE_LINK =  "xpath=//a[text()='Go to Homepage']";
	static String GO_TO_PROFILE_LINK =  "xpath=//a[@href='profile.php#profile']";
	static String GO_TO_HISTORY_LINK = "xpath=//a[@href='history.php#history']";
}
