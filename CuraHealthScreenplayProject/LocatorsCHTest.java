package CuraHealthScreenplayProject;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LocatorsCHTest {
	
	static Target USER_NAME_FIELD					=	Target.the("user_name_field").locatedBy("//input[@id='txt-username']");
	static Target PASSWORD_FIELD					=	Target.the("Password_field").locatedBy("//input[@id='txt-password']");
	static Target LOGIN_BUTTON						=	Target.the("login_button").locatedBy("//button[@id='btn-login']");
	static Target MENU_BUTTON_ON_LAUNCH_PAGE		=	Target.the("menu_button_on_launch_page").located(By.cssSelector("a#menu-toggle"));
	static Target MENU_BUTTON_ON_LOGIN_LINK			=	Target.the("menu_button_on_login_link").locatedBy("a[href='profile.php#login']");
	static Target MAKE_APPOINTMENT_ON_LAUNCH_PAGE	=	Target.the("menu_button_on_launch_page").located(By.cssSelector("a#btn-make-appointment"));
	static Target MENU_BUTTON_ON_LOGOUT_LINK			=	Target.the("menu_button_on_logout_link").located(By.xpath("//a[text()='Logout']"));
	static Target FACILITY_DROPDOWN_FIELD_IN_MAKE_APPOINTMENT			=	Target.the("facility_dropdown_field_in_make_appointment").locatedBy("//select[@id='combo_facility']");
	static Target CHECKBOX_IN_MAKE_APPOINTMENT			=	Target.the("checkbox_in_make_appointment").locatedBy("//input[@id='chk_hospotal_readmission']");
	static Target HEALTHCARE_PROGRAM_RADIO_BUTTON_IN_MAKE_APPOINTMENT			=	Target.the("healthcare_program_radio_button_in_make_appointment").locatedBy("//input[@id='radio_program_medicaid']");
	static Target VISIT_DATE_FIELD_IN_MAKE_APPOINTMENT			=	Target.the("visit_date_in_make_appointment").locatedBy("//input[@id='txt_visit_date']");
	static Target COMMENTS_FIELD_IN_MAKE_APPOINTMENT			=	Target.the("comments_field_in_make_appointment").locatedBy("//textarea[@id='txt_comment']");
	static Target SUBMIT_BOOKAPPOINTMENT_IN_MAKE_APPOINTMENT			=	Target.the("submit_bookappointment_in_make_appointment").locatedBy("//button[@id='btn-book-appointment']");}
