package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import locaters.LandingScreen;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ensure.web.ElementLocated;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.CustomerLogin;
import steps.VerifyingTheDashboard;

@RunWith(SerenityRunner.class)
public class PatientLoginscreeplay extends PageObject {
	
	@Managed (driver="chrome")
	WebDriver driver;
	Actor user=new Actor("ntr");
	LandingScreen lc;
	private static Target UsenameField=Target.the("username field").located(By.cssSelector("[placeholder=\"Username\"]:nth-child(1)"));
	private static Target PasswordField=Target.the("password field").located(By.cssSelector("[placeholder=\"Password\"]:nth-child(1)"));
	private static Target LoginButton=Target.the("Login Button").located(By.id("btn-login"));
    private static Target txtAppointment=Target.the("conatnt appointment").located(By.xpath("//h2[text()='Make Appointment']"));
    private static Target selectDateField=Target.the("select date field").located(By.cssSelector("[name=\"visit_date\"]"));
    private static Target textComment=Target.the("comment field").located(By.cssSelector("[name=\"comment\"]"));
    private static Target date=Target.the("date").located(By.xpath("//*[@class=\"datepicker-days\"]//td[text()='31']"));
    private static Target buttonBook=Target.the("Book button").located(By.xpath("//button[@id=\"btn-book-appointment\"]"));
	@Before
	@Title("User Login Into application ")
	public <T extends Actor> void naviagteUserToLoginPage(){
		user.can(BrowseTheWeb.with(driver));
		user.attemptsTo(Open.url("https://katalon-demo-cura.herokuapp.com/profile.php#login"));
		user.attemptsTo(SendKeys.of("John Doe").into(UsenameField));
		user.attemptsTo(SendKeys.of("ThisIsNotAPassword").into(PasswordField));
		user.attemptsTo(Click.on(LoginButton));
		
	}
	@Test
	@Title("User book appointment")
	public <T extends Actor >void bookappointment() {
		user.attemptsTo( Ensure.that(txtAppointment).isDisplayed());
		user.attemptsTo(Click.on(selectDateField));
		user.attemptsTo(Click.on(date));
		user.attemptsTo(Ensure.that(textComment).isDisplayed());
		user.attemptsTo(SendKeys.of("hello booking from optimworks").into(textComment));
		user.attemptsTo(Ensure.that(buttonBook).isEnabled());
		user.attemptsTo(Click.on(buttonBook));
	}
	@After
	@Title("Verify appointmet confirmation page ")
	public <T extends Actor> void verifyAppointment() {
		user.attemptsTo(Ensure.thatTheCurrentPage().title().isEqualTo("CURA Healthcare Service"));
	}
	
	
	
}
