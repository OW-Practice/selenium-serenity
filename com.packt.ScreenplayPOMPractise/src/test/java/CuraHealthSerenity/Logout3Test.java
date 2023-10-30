package CuraHealthSerenity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class Logout3Test extends PageObject {
	String displayedfailityinput;
	@Managed
	WebDriver driver;
	LocCHTest locatorsCuraHealth;
	UtilitiesTest utilitiesClass;
	
	@Test
	public void PatientLogout() {
		
		
//		Assert.assertNotSame("Facility dropdown selected is matched", displayedfailityinput, displayedfailityinput);
		utilitiesClass.elementPresence(LocCHTest.MENU_BUTTON_ON_LAUNCH_PAGE);
		utilitiesClass.click(LocCHTest.MENU_BUTTON_ON_LAUNCH_PAGE);
		utilitiesClass.elementPresence(LocCHTest.MENU_BUTTON_ON_LOGOUT_LINK);
		utilitiesClass.click(LocCHTest.MENU_BUTTON_ON_LOGOUT_LINK);
		System.out.println("Patient Logout from Cura Health Care Application");
	}
}
