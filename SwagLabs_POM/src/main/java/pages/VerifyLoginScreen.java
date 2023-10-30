package pages;

import locaters.LoginPageLocaters;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VerifyLoginScreen extends PageObject{
	
	LoginPageLocaters log;

	public void verifyHeaderText() {
		
		WebElementFacade header=$(log.swagHeader);
		header.isCurrentlyVisible();
		System.out.println(header+"is deplayed" );
		
	}
	public void verifyUsername() {
		WebElementFacade username=$(log.userNameField);
		username.isDisplayed();
		System.out.println(username + "is displayed");
	}
	public void verifyPassword() {
		WebElementFacade password=$(log.passwordField);
		password.isDisplayed();
		System.out.println(password + "is displayed");
	}
	public void verifyLoginButton() {
		WebElementFacade loginButton=$(log.buttonLogin);
		loginButton.isDisplayed();
		System.out.println(loginButton + "is displayed");
	}
}

