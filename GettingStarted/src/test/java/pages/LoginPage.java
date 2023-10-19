package pages;

import base.BasePage;
import utilities.TestDataLoader;

public class LoginPage extends BasePage {
	String Username = "id=username";
	String Password = "id=password";
	String SigninButton = "xpath=//button[text()='SIGN IN']";

	public InspifyPage login(String username, String password) throws InterruptedException {
		type(Username, username);
		type(Password, password);
		click(SigninButton);
		Thread.sleep(5000);
		getDriver().navigate().refresh();
		Thread.sleep(5000);

		return this.switchToPage(InspifyPage.class);
	}

}
