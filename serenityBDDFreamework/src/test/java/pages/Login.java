package pages;

import org.junit.Assert;

import Locators.LoginPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Login extends PageObject {
	
	LoginPage loc;
	
	
	
	public void verifyTitle() {
		String title=getDriver().getTitle();
		Assert.assertTrue(title.contains("emlen"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
	
	
	public void enterUsername(String username) {
		//loc.username
		$(loc.username).sendKeys(username);
		
		
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
		$(loc.password).shouldBeVisible();
	}
	
	public void enterPassword(String password) {
		$(loc.password).sendKeys(password);
	}
	
	public void clickonSubmitButton() {
	    WebElementFacade submitButton = find(loc.submitButton);
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
