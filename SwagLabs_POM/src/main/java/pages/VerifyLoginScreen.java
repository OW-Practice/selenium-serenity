package pages;

import locaters.LoginPageLocaters;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VerifyLoginScreen extends PageObject{
	
	LoginPageLocaters log;

	public void verifyHeaderText() {
		
		WebElementFacade header=$(log.swagHeader);
		header.isCurrentlyVisible();
		System.out.println(header.getText()+"is deplayed" );
		
	}
	public void verifyUsername() {
		WebElementFacade username=$(log.userNameField);
		username.isDisplayed();
		System.out.println(username.getText() + "is displayed");
	}
	public void verifyPassword() {
		WebElementFacade password=$(log.passwordField);
		password.isDisplayed();
		System.out.println(password.getText() + "is displayed");
	}
	public void verifyLoginButton() {
		WebElementFacade loginButton=$(log.buttonLogin);
		loginButton.isDisplayed();
		System.out.println(loginButton.getText() + "is displayed");
	}
}

