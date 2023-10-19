package testcases;

import static org.mockito.Mockito.when;

import java.lang.annotation.Target;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import locaters.DemoBlazeLocaters;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.PageObject;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.locators.*;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityParameterizedRunner.class)
@Concurrent(threads="4")
@UseTestDataFrom(value = "D:\\eclipse\\carswaley\\src\\test\\resources\\testdata\\data.csv")
@Narrative(text = { "welcome to google" })
public class LoginTestCase extends PageObject {
	
	@Managed
	private static WebDriver driver;
	public static String username;
	public static String password;
	


	// private static final Target USERNAME_FIELD = (Target)
	// DemoBlazeLocaters.lgnUsername;
	// private static final Target PASSWORD_FIELD = (Target)
	// DemoBlazeLocaters.lgnPassword;
	// private static final Target LOGIN_BUTTON = (Target)
	// DemoBlazeLocaters.btnLogin;
	@TestData(columnNames = "Username,Password")
	
	//@Autowired
	@Qualifier
    public String qualifier(){return " - " + " Username = " + username + " and " + " Password = " + password + " should display " ;}
	

	@Title("welcome to the google search engine")
	@Test
	

	 public static <T extends Actor> void userCanLoginSuccessfully() throws InterruptedException {

		Actor user = new Actor("user");
		user.can(BrowseTheWeb.with(driver));
		user.attemptsTo(Open.url("https://www.demoblaze.com/"));
		//user.attemptsTo(waitFor(DemoBlazeLocaters.txtLogin));
		// user.wait();
		//user.attemptsTo(isElementVisible(DemoBlazeLocaters.txtLogin));
		Click.on(DemoBlazeLocaters.loginButton);
		Enter.theValue(username).into(DemoBlazeLocaters.lgnUsername);
		Enter.theValue(password).into(DemoBlazeLocaters.lgnPassword);
		Click.on(DemoBlazeLocaters.buttonLogin);

		// user.can(BrowseTheWeb.with(ChromeDriver.driver()));

		// givenThat(user).wasAbleTo(OpenGoogleHomePage.open());
		// givenThat(user).wasAbleTo("https://serenity-bdd.github.io/docs/tutorials/screenplay");

	}

}
