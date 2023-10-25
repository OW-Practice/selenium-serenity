package CuraHealthSerenity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class Login1Test extends PageObject{

	
	@Managed
	WebDriver driver;
	LocCHTest locatorsCuraHealth;
	UtilitiesTest utilitiesClass;
	
	@Test
	public void CHPatientLogin()
	{
		//open();
		getDriver().get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
		utilitiesClass.waitTimeforPageLoad(2000);
//		utilitiesClass.clickActionOnWebElement(locatorsCuraHealth.MAKE_APPOINTMENT_BUTTON_ON_LAUNCH_PAGE);
		utilitiesClass.typeIntoWebElement(locatorsCuraHealth.USER_NAME_FIELD,"John Doe");
		utilitiesClass.typeIntoWebElement(LocCHTest.PASSWORD_FIELD,"ThisIsNotAPassword");
		utilitiesClass.clickActionOnWebElement(LocCHTest.LOGIN_BUTTON);
		
		
		System.out.println("Patient Login into Cura Health Care Application");
	}
}
