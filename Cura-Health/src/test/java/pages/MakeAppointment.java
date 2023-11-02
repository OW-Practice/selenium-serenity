package pages;

import java.util.Date;

import com.ibm.icu.text.SimpleDateFormat;

import Locators.AppointmentPage;
import net.serenitybdd.core.pages.PageObject;

public class MakeAppointment extends PageObject{
	AppointmentPage appointment;
	
	
	public void clickOnFacilityDropdown() {
		$(appointment.facilityDropdown).click();
	}
	
	public void selectFacilityType() {
		$(appointment.selectFacilityType).shouldBeVisible();
		$(appointment.selectFacilityType).click();
	}
	public void checkApplyForHospitalReadmission() {
		$(appointment.applyForHospitalReadmission).click();
	}
	public void clickRadioButtonNone() {
		$(appointment.none).click();
	}
	public String selectVisitDate() {
		 Date currentDate = new Date();

	        // Format the date as dd/mm/yyyy
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        String formattedDate = dateFormat.format(currentDate);

	        System.out.println("Current Date: " + formattedDate);
	        return formattedDate;
		//$(appointment.).click();
	}
	public void enterComment() {
		$(appointment.commentBox).sendKeys();
	}
	public void clickBookAppointment() {
		$(appointment.bookApppoinrmnet).click();
	}
	
}
