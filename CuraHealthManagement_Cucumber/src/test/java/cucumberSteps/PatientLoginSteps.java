package cucumberSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.CustomerLogin;
import steps.VerifyingTheDashboard;

public class PatientLoginSteps {
	
	CustomerLogin log;
	 VerifyingTheDashboard dash;
	
	@Given("^Patient navigate to login screen$")
	public void patient_navigate_to_login_screen() {
		
		log.verifyLoginScreen();
	}

	@When("^Patient login with (.*) and (.*)$")
	public void patient_login_with_username_and_password(String username ,String password) {
		
	   log.enterCredentials(username, password);
	}

	@Then("^Patient click on Login Button$")
	public void patient_click_on_Login_Button() {
	    log.clickOnLogin();
	}

	@And("^Patient Naviagte to Home screen$")
	public void patient_Naviagte_to_Home_screen() {
	   dash.validatingTheDashboard();
	}


}
