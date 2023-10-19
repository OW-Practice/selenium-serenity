package pages;

import base.BasePage;
import utilities.TestDataLoader;

public class LoginPage extends BasePage {
	String Username = "id=username";
	String Password = "id=password";
	String SigninButton = "xpath=//button[text()='SIGN IN']";
	 

	public InspifyPage login(String username, String password) {
		type(Username, username);
		type(Password, password);
		click(SigninButton);
		
		return this.switchToPage(InspifyPage.class);
	}

}
