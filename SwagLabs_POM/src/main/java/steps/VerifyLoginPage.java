package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.AddUsername;
import pages.VerifyLoginScreen;

public class VerifyLoginPage extends PageObject {
	
	VerifyLoginScreen screen;
	AddUsername user;
	
	@Step
	public void validateLoginScreen() {
		screen.verifyHeaderText();
	}
	@Step
	public void validateUsername() {
		screen.verifyUsername();
	}
	@Step
	public void validatePassword() {
		screen.verifyPassword();
	}
	@Step
	public void validateLoginButton() {
		screen.verifyLoginButton();
	}

}
