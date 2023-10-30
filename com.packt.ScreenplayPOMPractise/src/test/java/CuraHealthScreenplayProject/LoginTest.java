package CuraHealthScreenplayProject;

import java.time.Duration;
import java.util.function.Predicate;

import javax.sound.midi.Instrument;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.EventualConsequence;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

import net.serenitybdd.screenplay.GivenWhenThen;

//@RunWith(SerenityRunner.class)
public class LoginTest implements Task {
//	private String username = "John Doe";
	
	private String password = "ThisIsNotAPassword";
	
	public static LoginTest predefinedcredentials() {
//		return Tasks.instrumented(CHloginTest.class);
		return Instrumented.instanceOf(LoginTest.class).withProperties();
	}
	
	/*
	 * public CHloginTest(String username, String password) { this.username =
	 * username; this.password = password; }
	 */
	
	
	@Step("Cura Health Login")
	public <T extends Actor>void performAs(T curahealth)
	{
		
		curahealth.attemptsTo(
		Ensure.thatTheCurrentPage().title().isEqualTo("CURA Healthcare Service"));
//				Open.url("https://katalon-demo-cura.herokuapp.com/"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		curahealth.attemptsTo(
				Ensure.that(LocatorsTest.MAKE_APPOINTMENT_ON_LAUNCH_PAGE).isDisplayed());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		curahealth.attemptsTo(
				
				Click.on(LocatorsTest.MAKE_APPOINTMENT_ON_LAUNCH_PAGE),
				Clear.field(LocatorsTest.USER_NAME_FIELD),
				Enter.theValue("John Doe").into(LocatorsTest.USER_NAME_FIELD)			
//				Enter.theValue("John Doe").into(LocatorsCHTest.USER_NAME_FIELD).thenHit(Keys.ENTER),
				
				//Assertion-Ensure				
//				Ensure.that(LocatorsCHTest.USER_NAME_FIELD).text().isEqualTo("John Doe"),
//				Ensure.that(LocatorsCHTest.USER_NAME_FIELD).not().containsElements("3password"),
//				Ensure.that(LocatorsCHTest.USER_NAME_FIELD).value().isEqualTo("John Doe"),
//				Ensure.that(LocatorsCHTest.USER_NAME_FIELD.waitingForNoMoreThan(Duration.ofSeconds(15))).value().isEqualTo("John Doe"),
				);
		
		Predicate<String> username = new Predicate<String>() { String username = "John Doe";
			@Override
			public boolean test(String t) {
				return username.equals(t);
			}
		};
		
		
		curahealth.should(GivenWhenThen.seeThat("the displayed username", TheUserName.getValue(), username));
		System.out.println("Username matched");
		
		curahealth.attemptsTo(
				Clear.field(LocatorsTest.PASSWORD_FIELD),
				Enter.theValue("ThisIsNotAPassword").into(LocatorsTest.PASSWORD_FIELD),
				//Assertion-Ensure				
				Ensure.that(LocatorsTest.PASSWORD_FIELD).text().isNotEqualTo("IsNotAPassword"),
				Ensure.that("ThisIsNotAPassword").hasSizeGreaterThan(15),
				Click.on(LocatorsTest.LOGIN_BUTTON));
		

		
	}

}

//boolean isNotPresent = curahealth.asksFor(Absence.of());
//Verify_getTextValue.on()
//public CHloginTest(String username, String password) {
//	this.username=username;
//	this.password=password;
//}