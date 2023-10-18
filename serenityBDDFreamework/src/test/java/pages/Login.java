package pages;

import org.junit.Assert;

import Locators.LoginPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Open;

public class Login extends PageObject {
	
	LoginPage loc;
	
	
	public void Url() {
		Open.url("https://app.emlen-staging.io/login");
	}
	
	public void verifyTitle() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String title=getDriver().getTitle();
		Assert.assertTrue(title.contains("Finlink"));
	
		
	}
		
		
	
	
	public void enterUsername(String username) {
		//loc.username
		$(loc.finlinkUsername).sendKeys(username);
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void clickonProceedButton() {
		WebElementFacade proceedButton = find(loc.proceedButton);
		proceedButton.shouldBeEnabled();
		proceedButton.shouldBeVisible();
		proceedButton.click();
		
	}
	
	public void verifyPasswordInputFieldDisplayed() {
		$(loc.finlinkPassword).shouldBeVisible();
	}
	
	public void enterPassword(String password) {
		$(loc.finlinkPassword).sendKeys(password);
	}
	
	public void clickonSubmitButton() {
	    WebElementFacade submitButton = find(loc.loginButton);
	    submitButton.shouldBeVisible();
		submitButton.click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
