package pages;

import org.junit.Assert;

import Locators.Logout;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LogoutPage extends PageObject {
	Logout logout;
	public void clickOnMenu() {
		$(logout.menu).click();
	}
	
	public void clickOnLogout() {
		$(logout.logout).click();
	}
}
