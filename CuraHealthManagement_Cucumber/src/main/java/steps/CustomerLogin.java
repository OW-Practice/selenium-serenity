package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.UserLogin;

public class CustomerLogin extends PageObject{
	
	
	UserLogin user;
	
	@Step
	public void customerNavigation() {
		
		user.userNavigation();
	}

	@Step
	public void verifyLoginScreen() {
		open();
		user.verifyLoginScreen();
	}
	@Step
	public void enterCredentials(String username, String password) {
		
		user.addUserName(username);
		user.addPassword(password);	
	}
	@Step
	public void clickOnLogin() {
		user.verifyLoginButton();
		user.clickONLogin();
	}
}
