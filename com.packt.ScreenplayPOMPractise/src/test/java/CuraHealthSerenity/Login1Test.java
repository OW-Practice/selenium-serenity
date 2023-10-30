package CuraHealthSerenity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class Login1Test extends UtilitiesTest{

	
	@Managed
	WebDriver driver;
	LocCHTest locatorsCuraHealth;
	UtilitiesTest utilitiesClass;
	
	@Test
	public void CHPatientLogin(String username,String password)
	{
		
		getDriver().get("https://katalon-demo-cura.herokuapp.com/");
		utilitiesClass.assertionforpagetitle("CURA Healthcare Service");
		System.out.println("Page Title assertion is passed");
		
//		utilitiesClass.waitTimeforPageLoad(2000);
		utilitiesClass.elementPresence(LocCHTest.MAKE_APPOINTMENT_BUTTON_ON_LAUNCH_PAGE);
		utilitiesClass.click(LocCHTest.MAKE_APPOINTMENT_BUTTON_ON_LAUNCH_PAGE);
		utilitiesClass.elementPresence(LocCHTest.USER_NAME_FIELD);
		utilitiesClass.type(LocCHTest.USER_NAME_FIELD,username);
		utilitiesClass.elementPresence(LocCHTest.PASSWORD_FIELD);
		utilitiesClass.type(LocCHTest.PASSWORD_FIELD,password);
		utilitiesClass.elementPresence(LocCHTest.LOGIN_BUTTON);
		utilitiesClass.click(LocCHTest.LOGIN_BUTTON);
		
		
		System.out.println("Patient Login into Cura Health Care Application is success");
	}
}
