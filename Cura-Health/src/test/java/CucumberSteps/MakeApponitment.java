package CucumberSteps;

import Steps.MakeAppointmentSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class MakeApponitment extends PageObject {
	@Steps
	MakeAppointmentSteps appointment;

	@Given("^user wants to verify the make oppintment page displayed$")
	public void user_wants_to_verify_the_make_oppintment_page_displayed() {
		appointment.verifyTheAppointPageDisplayed();
	}


	@When("^user select the facility type$")
	public void user_select_the_facility_type() {
		appointment.selectFacilityType(); 
	}

	@Then("^user check the apply for hospital readmission$")
	public void user_check_the_apply_for_hospital_readmission() {
		appointment.checkApplyForHospitalReadmission();
	}

	@Then("^user wants to select healthcare program is none$")
	public void user_wants_to_select_healthcare_program_is_none() {
		appointment.clickRadioButtonNone();
	}

	@Then("^user enter the visit date$")
	public void user_enter_the_visit_date() {
		appointment.selectVisitDate();
	}

	@Then("^user wants to enter the discription in comment$")
	public void user_wants_to_enter_the_discription_in_comment() {
		appointment.enterComment();
	}

	@And("^user click on make appoint button$")
	public void user_click_on_make_appoint_button() {
		appointment.clickBookAppointment();
	}
	
}
