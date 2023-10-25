package CuraHealthSerenity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class Logout3Test extends PageObject {

	
	@Managed
	WebDriver driver;
	LocCHTest locatorsCuraHealth;
	UtilitiesTest utilitiesClass;
	
	@Test
	public void PatientLogout() {
		
		
		utilitiesClass.clickActionOnWebElement(LocCHTest.GO_TO_HOMEPAGE_LINK);
		utilitiesClass.clickActionOnWebElement(LocCHTest.MENU_BUTTON_ON_LAUNCH_PAGE);
		utilitiesClass.clickActionOnWebElement(LocCHTest.GO_TO_PROFILE_LINK);
		utilitiesClass.clickActionOnWebElement(LocCHTest.MENU_BUTTON_ON_LAUNCH_PAGE);
		utilitiesClass.clickActionOnWebElement(LocCHTest.MENU_BUTTON_ON_LOGOUT_LINK);
		System.out.println("Patient Logout from Cura Health Care Application");
	}
}
