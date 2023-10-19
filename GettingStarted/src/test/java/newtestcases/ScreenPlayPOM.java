package newtestcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

import consequences.VerifyMessageText;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import questions.MessageText;
import tasks.ClickOnSingleInputForm;
import utilities.TestDataLoader;

@RunWith(SerenityRunner.class)
public class ScreenPlayPOM {
	@Managed
	WebDriver driver;

	private TestDataLoader testDataLoader = new TestDataLoader();
	String SiteURL = testDataLoader.getSiteURL();

	Faker faker = new Faker();
	String Message = "Hi, this is " + faker.name().name();

	Actor rams = Actor.named("Ramya");

	@Before
	public void launchURLSP() {
		rams.can(BrowseTheWeb.with(driver));
		rams.attemptsTo(Open.url(SiteURL));
	}

	@Test
	public void handleInputForms() throws InterruptedException {
		String expectedTitle = "";
		rams.attemptsTo(ClickOnSingleInputForm.inputMessage(Message));
		String displayedMessage = rams.asksFor(MessageText.displayed());
		rams.attemptsTo(Ensure.that(displayedMessage).contains(expectedTitle));
	}
}
