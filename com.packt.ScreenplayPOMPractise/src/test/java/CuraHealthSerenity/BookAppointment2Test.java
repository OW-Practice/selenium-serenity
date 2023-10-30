package CuraHealthSerenity;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;

public class BookAppointment2Test extends PageObject {
	public String ActualFInput;
	@Managed
	WebDriver driver;
	LocCHTest locatorsCuraHealth;
	UtilitiesTest utilitiesClass;
    
    @Test
	public void PatientAppointmentBook() {
    	utilitiesClass.waitTimeforPageLoad(2000);
//		utilitiesClass.elementPresence(LocCHTest.FACILITY_DROPDOWN_FIELD_IN_MAKE_APPOINTMENT);
    	WebElementFacade failitydropdown=$(LocCHTest.FACILITY_DROPDOWN_FIELD_IN_MAKE_APPOINTMENT);
		failitydropdown.click();
		failitydropdown.selectByValue("Hongkong CURA Healthcare Center").click();
		String ActualFInput=failitydropdown.getText();
		System.out.println("Facility input selected from dropdown is:" +ActualFInput);
		
		utilitiesClass.elementPresence(LocCHTest.CHECKBOX_IN_MAKE_APPOINTMENT);
		utilitiesClass.click(LocCHTest.CHECKBOX_IN_MAKE_APPOINTMENT);
		
		utilitiesClass.elementPresence(LocCHTest.VISIT_DATE_FIELD_IN_MAKE_APPOINTMENT);
		WebElementFacade selectVisitDate= $(LocCHTest.VISIT_DATE_FIELD_IN_MAKE_APPOINTMENT);
		selectVisitDate.click();
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
		String formattedDate = currentDate.format(formatter);
		System.out.println("Current Date: " + formattedDate);
		WebElementFacade selectCurrentDate=$("//*[@class='datepicker-days']//td[text()='"+formattedDate+"']");
		selectCurrentDate.waitUntilClickable().click();

		utilitiesClass.elementPresence(LocCHTest.COMMENTS_FIELD_IN_MAKE_APPOINTMENT);
		utilitiesClass.type(LocCHTest.COMMENTS_FIELD_IN_MAKE_APPOINTMENT,"Please book my appointment on my selected date");
		utilitiesClass.elementPresence(LocCHTest.SUBMIT_BOOKAPPOINTMENT_IN_MAKE_APPOINTMENT);
		utilitiesClass.click(LocCHTest.SUBMIT_BOOKAPPOINTMENT_IN_MAKE_APPOINTMENT);
		
		System.out.println("Patient Successfully booked appointment in Cura Health Care Application");
	}
}



//WebElementFacade healthcareprogram2radiobutton=$(LocCHTest.HEALTHCARE_PROGRAM_RADIO_BUTTON_MEDICAID_IN_MAKE_APPOINTMENT);
//setCheckbox(healthcareprogram2radiobutton, false);
//System.out.println("MEDICAID radio button is selected");
//healthcareprogram2radiobutton.selectByVisibleText("Medicaid");
//utilitiesClass.waitTimeforElementVisible(2000);
//WebElementFacade healthcareprogram1radiobutton=$(LocCHTest.HEALTHCARE_PROGRAM_RADIO_BUTTON_MEDICARE_IN_MAKE_APPOINTMENT);
//healthcareprogram1radiobutton.click();

//utilitiesClass.clickActionOnWebElement(LocCHTest.HEALTHCARE_PROGRAM_RADIO_BUTTON_MEDICAID_IN_MAKE_APPOINTMENT);
//utilitiesClass.waitTimeforElementVisible(2000);
//utilitiesClass.clickActionOnWebElement(LocCHTest.HEALTHCARE_PROGRAM_RADIO_BUTTON_MEDICARE_IN_MAKE_APPOINTMENT);

//CTRL+SHIFT+L

//utilitiesClass.typeIntoWebElement(LocCHTest.VISIT_DATE_FIELD_IN_MAKE_APPOINTMENT, "28/10/2023");
//Calendar calendar = Calendar.getInstance();
//Date currentDate = calendar.getTime();
//System.out.println(currentDate);
//currentDate.split()
//String CurrentDate = null;
//System.out.println("Today Date: " + CurrentDate);
//String FormattedCurrentDate= dateFormat.format("dd/mm/yyyy");
//System.out.println("Today's date " +FormattedCurrentDate+ "licked");
//selectVisitDate.type(FormattedCurrentDate);
//WebElementFacade selectCurrentDate=$("//*[@class='datepicker-days']//td[text()='"+getCurrentDate()+"']");
//selectCurrentDate.click();
//
//System.out.println("Today's date " +FormattedCurrentDate+ "is clicked");

//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
//System.out.println(dateFormat);
//private String formattedDate() {
//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//String formattedDate = dateFormat.format(CurrentDate);
//return formattedDate;
//}


//public static String selectCurrentDate() {
//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//String FormattedCurrentDate= dateFormat.format(new Date());
//return FormattedCurrentDate;
//}
//public String FormattedCurrentDate;
//public int  getCurrentDate() { 
//	 Date CurrentDate=new Date(); 
//	return CurrentDate.getDay();
//	
//}