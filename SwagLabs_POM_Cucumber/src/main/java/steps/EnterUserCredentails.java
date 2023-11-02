package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.AddUsername;

public class EnterUserCredentails extends PageObject {
     
	AddUsername add;
	
	@Step
	public void enterUsername(String username) {
		add.addUsename(username);
	}
	@Step
	public void enterPassword(String password) {
		add.addPassword(password);
	}
	
	@Step
	public void clickOnLogin() {
		add.clickOnLogin();
	}
	
}
