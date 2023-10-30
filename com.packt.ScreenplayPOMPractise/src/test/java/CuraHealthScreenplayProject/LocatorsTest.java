package CuraHealthScreenplayProject;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LocatorsTest {
	
	public static Target USER_NAME_FIELD					=	Target.the("user_name_field").locatedBy("//input[@id='txt-username']");
	public static Target PASSWORD_FIELD					=	Target.the("Password_field").locatedBy("//input[@id='txt-password']");
	public static Target LOGIN_BUTTON						=	Target.the("login_button").locatedBy("//button[@id='btn-login']");
	public static Target MENU_BUTTON_ON_LAUNCH_PAGE		=	Target.the("menu_button_on_launch_page").located(By.cssSelector("a#menu-toggle"));
	public static Target MENU_BUTTON_ON_LOGIN_LINK			=	Target.the("menu_button_on_login_link").locatedBy("a[href='profile.php#login']");
	public static Target MAKE_APPOINTMENT_ON_LAUNCH_PAGE	=	Target.the("menu_button_on_launch_page").located(By.cssSelector("a#btn-make-appointment"));
	public static Target MENU_BUTTON_ON_LOGOUT_LINK			=	Target.the("menu_button_on_logout_link").located(By.xpath("//a[text()='Logout']"));
	public static Target FACILITY_DROPDOWN_FIELD_IN_MAKE_APPOINTMENT			=	Target.the("facility_dropdown_field_in_make_appointment").locatedBy("//select[@id='combo_facility']");
	public static Target CHECKBOX_IN_MAKE_APPOINTMENT			=	Target.the("checkbox_in_make_appointment").locatedBy("//input[@id='chk_hospotal_readmission']");
	public static Target HEALTHCARE_PROGRAM_RADIO_BUTTON_IN_MAKE_APPOINTMENT			=	Target.the("healthcare_program_radio_button_in_make_appointment").locatedBy("//input[@id='radio_program_medicaid']");
	public static Target VISIT_DATE_FIELD_IN_MAKE_APPOINTMENT			=	Target.the("visit_date_in_make_appointment").locatedBy("//input[@id='txt_visit_date']");
	public static Target COMMENTS_FIELD_IN_MAKE_APPOINTMENT			=	Target.the("comments_field_in_make_appointment").locatedBy("//textarea[@id='txt_comment']");
	public static Target SUBMIT_BOOKAPPOINTMENT_IN_MAKE_APPOINTMENT			=	Target.the("submit_bookappointment_in_make_appointment").locatedBy("//button[@id='btn-book-appointment']");
	public static Target GO_TO_HOMEPAGE_BUTTON			=	Target.the("GoToHomepagebutton").locatedBy("//a[text()='Go to Homepage']");
	public static Target HISTORY_IN_MENU_SECTION			=	Target.the("historyInMenuSection").locatedBy("//a[href='history.php#history']");
	public static Target SELECTED_FACILITY_DROPDOWNVALUE_DISPLAYED_IN_HISTORY			=	Target.the("selected_facility_dropdownvalue_displayed_in_history").locatedBy("//p[@id='facility']");
	public static Target SELECTED_APPLYFORHOSPITALADMISSION_DISPLAYED_IN_HISTORY			=	Target.the("selected_applyforhospitaladmission_displayed_in_history").locatedBy("//p[@id='hospital_readmission']");
	public static Target SELECTED_HEALTHCAREPROGRAM_DISPLAYED_IN_HISTORY			=	Target.the("selected_healthcareprogram_displayed_in_history").locatedBy("//p[@id='program']");
	public static Target COMMENTS_DISPLAYED_IN_HISTORY			=	Target.the("comments_displayed_in_history").locatedBy("//p[@id='comment']");
	
	
	
	


}
