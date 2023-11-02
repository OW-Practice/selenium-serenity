package pages;

import Locators.LoginPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class Login extends PageObject{
	
	LoginPage log;
	/*public void openApplication() {
		
	}*/
		
	
	
	public void enterUsername() {
		
		$(log.username).sendKeys();
		
		
	}
	
	public void enterPassword() {
		$(log.password).sendKeys();
	}
	
	public void clickonLoginButton() {
	    WebElementFacade loginButton = find(log.loginButton);
	    loginButton.shouldBeVisible();
		loginButton.click();

}
	}
