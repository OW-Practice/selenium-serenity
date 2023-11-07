package cucumberSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import steps.SlotBooking;

public class PatientBookAppointment {
	
	SlotBooking slot;
	
	@Then("^Patient select the required date from calendar$")
	public void patient_select_the_required_date_from_calendar() {
		
	    slot.selectRequiredDate();
	}

	@And("^Patient add his (.*) into Comment box$")
	public void patient_add_his_Comment_into_Comment_box(String comment) {
		
		slot.fillPatientData(comment);
	    
	}

	@And("^Patient Will Click on Book Appointment$")
	public void patient_Will_Click_on_Book_Appointment() {
		
		slot.clickOnBook();
	    
	}

	@Then("^Patient Navigate to Appointment Confirmation Page$")
	public void patient_Navigate_to_Appointment_Confirmation_Page() {
	    
		slot.verifyConfirmationpage();
	}


}
