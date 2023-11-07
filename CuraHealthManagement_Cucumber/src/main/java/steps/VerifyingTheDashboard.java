package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.VerifyUserNavigation;

public class VerifyingTheDashboard extends PageObject {
	VerifyUserNavigation user;
	
	@Step
	public void validatingTheDashboard() {
		user.verifyDashboard();
		user.verifyLeftHamburg();
	}

	
}
