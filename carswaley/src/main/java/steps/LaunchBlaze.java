package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.LaunchURL;
import pages.NewUserRegistration;
import pages.UserLoginPage;

public class LaunchBlaze extends PageObject {

	LaunchURL url;
	NewUserRegistration user;
	UserLoginPage log;

	@Step
	public void userNavigateToDashboard() {
		url.verifyingTheDashboard();

	}

	@Step

	public void customerRegister(String username,String password) {
		user.addNewUser(username,password);
	}

	@Step
	public void userLogin(String username,String password) {

		log.navigateToHome(username,password);
	}

	@Step
	public void verifyProductScreen() {
		log.verifyHomeScreen();
		log.verifyCurrentUsername();
	}

}
