package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.MakeAppointment;

public class SlotBooking extends PageObject {
	
	MakeAppointment ap;
	
	@Step
	public void patientToApplication(String username,String password) {
		ap.patientLogin(username, password);
	}
	
	@Step
	public void verifyMakeAppointmentScreen() {
		
		ap.verifyPatientDetailPage();
	}
	@Step
	public void fillPatientData(String comment) {
		
	    ap.selectReadmissioncheckbox();
		ap.selectVisitDate();
		ap.addComment(comment);
		
	}
	@Step
	public void clickOnBook() {
		ap.clickOnBookButton();
	}
	public void verifyConfirmationpage() {
		ap.verifytheBookedAppointment();
	}

}
