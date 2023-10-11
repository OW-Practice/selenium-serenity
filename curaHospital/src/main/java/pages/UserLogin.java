package pages;

import locaters.LandingScreen;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static java.time.temporal.ChronoUnit.SECONDS;

public class UserLogin extends PageObject {
	
	LandingScreen screen;
	
	public void userNavigation() {
		
		WebElementFacade menu=$(screen.lftHamberg);
		menu.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		WebElementFacade logintab=$(screen.tabLogin);
		logintab.click();
	}
	public void verifyLoginScreen() {
		setImplicitTimeout(40, SECONDS);
		WebElementFacade header =$(screen.loginContant);
		header.isCurrentlyVisible();
		System.out.println();
		WebElementFacade username=$(screen.fldUsername);
		username.isDisplayed();
		WebElementFacade password=$(screen.fldPassword);
		password.isDisplayed();
	}
	public void addUserName(String username) {
		setImplicitTimeout(40, SECONDS);
		WebElementFacade logiName=$(screen.fldUsername);
		logiName.type(username);
	}
	public void addPassword(String password) {
		setImplicitTimeout(40, SECONDS);
		WebElementFacade loginPassword=$(screen.fldPassword);
		loginPassword.type(password);
		
	}
	public void verifyLoginButton() {
		setImplicitTimeout(40, SECONDS);
		WebElementFacade loginButton=$(screen.btnLogin);
		loginButton.isDisplayed();
	}
	public void clickONLogin() {
		setImplicitTimeout(40, SECONDS);
		WebElementFacade loginButton=$(screen.btnLogin);
		loginButton.waitUntilClickable();
		loginButton.click();
	}
	

}
