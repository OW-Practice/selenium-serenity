package newtestcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

import consequences.VerifyMessageText;
import consequences.VerifySum;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import targetlocators.SeleniumEasyPageLocators;
import tasks.CalculateTwoInts;
import tasks.CaptureAlertText;
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
	int a = faker.number().randomDigit();
	int b = faker.number().randomDigit();
	int total = a + b;
	String number1 = Integer.toString(a);
	String number2 = Integer.toString(b);
	String sum = Integer.toString(total);

	Actor rams = Actor.named("Ramya");

	@Before
	public void launchURLSP() {
		rams.can(BrowseTheWeb.with(driver));
		rams.attemptsTo(Open.url(SiteURL));
	}

	@Test
	public void handleInputForms() throws InterruptedException {
		rams.attemptsTo(ClickOnSingleInputForm.inputMessage(Message));
		// String displayedMessage = rams.asksFor(MessageText.displayed());
		// rams.attemptsTo(Ensure.that(displayedMessage).contains(expectedTitle));
		rams.should(new VerifyMessageText(SeleniumEasyPageLocators.MESSAGE, Message));
	}

//	@Test
//	
//	public void handleJavascriptAlert() {
//		rams.attemptsTo(CaptureAlertText.capture());
//	}

	@Test
	public void handleTwoInputForms() {
		rams.attemptsTo(CalculateTwoInts.inputValues(number1, number2));
		// rams.should(new VerifySum(sum));
		rams.should(new VerifyMessageText(SeleniumEasyPageLocators.SumText, sum));
	}
	
//	@Test
//	public void handleTwoInputFormsWithCombinedQuestionAndConsequenceClass() {
//		rams.attemptsTo(CalculateTwoInts.inputValues(number1, number2));
//		rams.should(new VerifyMessageText(SeleniumEasyPageLocators.SumText, sum));
//	}
}
