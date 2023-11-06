package Steps;

import java.util.Date;

import com.ibm.icu.text.SimpleDateFormat;

import pages.MakeAppointment;

public class MakeAppointmentSteps {
	MakeAppointment makeappiontment;
	
	public void verifyTheAppointPageDisplayed() {
		makeappiontment.verifyTheAppointPageDisplayed();
	}
	
	public void clickOnFacilityDropdown() {
		makeappiontment.clickOnFacilityDropdown();
	}
	public void selectFacilityType() {
		makeappiontment.selectFacilityType();
	}
	public void checkApplyForHospitalReadmission() {
		makeappiontment.checkApplyForHospitalReadmission();
	}
	public void clickRadioButtonNone() {
		makeappiontment.clickRadioButtonNone();
	}
	public void selectVisitDate() {
		makeappiontment.selectVisitDate();
	}
	public void enterComment() {
		makeappiontment.enterComment();
	}
	public void clickBookAppointment() {
		makeappiontment.clickBookAppointment();
	}
}
