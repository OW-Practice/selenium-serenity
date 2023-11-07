package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.UserProfileUpdate;

public class PatientProfileUpdate extends PageObject{
	
	UserProfileUpdate up;
	
	@Step
	public void navigateUserToProfile() {
		
		up.navigateToprofile();
	}
	@Step
	public void vefyingPatientProfile() {
		up.verifyProfileScreen();
		
	}
	@Step
	public void logoutFromProfile() {
		
		up.btnLogout();
	}

}
