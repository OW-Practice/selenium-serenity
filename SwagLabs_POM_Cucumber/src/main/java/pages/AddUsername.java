package pages;

import locaters.LoginPageLocaters;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddUsername extends PageObject{
	
	LoginPageLocaters log;
	
	public void addUsename(String username) {
		
		WebElementFacade usernamefld =$(log.userNameField);
		usernamefld.type(username);
	}
	public void addPassword(String password) {
		WebElementFacade passwordfld=$(log.passwordField);
		passwordfld.type(password);
	}
	public void clickOnLogin() {
		WebElementFacade buttonSign=$(log.buttonLogin);
		buttonSign.waitUntilClickable().click();
	}

}
