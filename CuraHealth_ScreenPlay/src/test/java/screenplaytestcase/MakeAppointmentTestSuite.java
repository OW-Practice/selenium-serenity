package screenplaytestcase;

import org.junit.After;
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
import screenplayactions.BookAppointmentActions;
import screenplayactions.VerifyHistoryPageActions;
import screenplaytasks.UserLogin;

@RunWith(SerenityRunner.class)
public class MakeAppointmentTestSuite {
	
	@Managed ( driver="chrome")
	WebDriver driver;

	BookAppointmentActions Bp;
	UserLogin ul;
	VerifyHistoryPageActions act;
	Actor tana = Actor.named("patient");
	
	@Before
	@Title("User logi into application")
	public void userlogin() {
		tana.can(BrowseTheWeb.with(driver));
		tana.wasAbleTo(Open.url("https://katalon-demo-cura.herokuapp.com/profile.php#login"));
        tana.attemptsTo(
				
				UserLogin.log("John Doe", "ThisIsNotAPassword")
				
				);
	}
	@Title("Patient book appointment")
	@Test
	
	public void makeBooking() {
		tana.attemptsTo(
				Bp.appointment("test123_fROM _optimworks")
				
				);
	}
	@After
	@Title("Verify User History Page")
	public void verifyPatientHistoryPage() {
		tana.attemptsTo(
				act.historypage()
				
				);
	}
	
}
