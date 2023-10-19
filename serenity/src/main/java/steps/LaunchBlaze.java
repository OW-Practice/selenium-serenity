package steps;

import net.serenitybdd.core.pages.PageObject;
//import net.serenitybdd.screenplay.Performable;
import net.thucydides.core.annotations.Step;
import pages.LaunchURL;
import pages.NewUserRegistration;
import pages.UserLoginPage;

public class LaunchBlaze extends PageObject {

	LaunchURL url;
	NewUserRegistration user;
	UserLoginPage loginPage;

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

		loginPage.navigateToHome(username,password);
	}

	@Step
	public void verifyProductScreen() {
		loginPage.verifyHomeScreen();
		
	}

}
