package screenplaytestcase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import screenplaytasks.UserLogin;

@RunWith(SerenityRunner.class)
public class PatientDriveToLoginScreen {

	@Managed(driver="chrome")
	WebDriver driver;
	UserLogin ul;
	Actor tana=Actor.named("patient");
	
	@Before
	@Title("Patient launch browser")
	public void patientLaunchingURL() {
		tana.can(BrowseTheWeb.with(driver));
		tana.wasAbleTo(Open.url("https://katalon-demo-cura.herokuapp.com/profile.php#login"));
	}
	@Title("patient navigate to login page")
	@Test
	public void usernaviage() {
		tana.attemptsTo(
				
				UserLogin.log("John Doe", "ThisIsNotAPassword")
				
				);
	
	}
	
}
