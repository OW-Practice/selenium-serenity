package CuraHealthSerenity;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

public class BookAppointment2Test extends PageObject {
	
	@Managed
	WebDriver driver;
	LocCHTest locatorsCuraHealth;
	UtilitiesTest utilitiesClass;
	
	public int  getCurrentDate() { 
		 Date d=new Date(); 
		return d.getDay();
		
	}
	@Test
	public void PatientAppointmentBook() {
		utilitiesClass.waitTimeforElementVisible(3000);
		WebElementFacade failitydropdown=$(LocCHTest.FACILITY_DROPDOWN_FIELD_IN_MAKE_APPOINTMENT);
		failitydropdown.click();
		failitydropdown.selectByValue("Hongkong CURA Healthcare Center").click();
		
		utilitiesClass.clickActionOnWebElement(LocCHTest.CHECKBOX_IN_MAKE_APPOINTMENT);
		utilitiesClass.waitTimeforElementVisible(2000);


		WebElementFacade selectVisitDate= $(LocCHTest.VISIT_DATE_FIELD_IN_MAKE_APPOINTMENT);
		selectVisitDate.click();
		WebElementFacade currentDate=$("//*[@class='datepicker-days']//td[text()='"+getCurrentDate()+"']");

		currentDate.waitUntilClickable().click();
		System.out.println(currentDate);
		
		utilitiesClass.typeIntoWebElement(LocCHTest.COMMENTS_FIELD_IN_MAKE_APPOINTMENT,"Please book my appointment on my selected date");
		utilitiesClass.clickActionOnWebElement(LocCHTest.SUBMIT_BOOKAPPOINTMENT_IN_MAKE_APPOINTMENT);
		
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



