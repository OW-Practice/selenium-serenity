package pages;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class ScreenPlay {
	@Managed
	WebDriver driver;

	// locators
	private static final Target INPUT_FORMS_LINK = Target.the("Input forms link")
			.locatedBy("//*[text()='Input Forms']");
	private static final Target SIMPLE_FORM_DEMO_LINK = Target.the("Single form demo link")
			.locatedBy("//ul[not(@class)]//li//a[contains(@href, 'basic-first-form')]");
	private static final Target ENTER_MESSAGE = Target.the("Enter message field").locatedBy("[aria-label='message']");
	private static final Target SHOW_MESSAGE = Target.the("Show message button")
			.locatedBy("//button[@onclick='showInput();']");
	private static final Target MESSAGE = Target.the("Show message button").locatedBy("[title='text message']");
	private static final Target ALERTS_AND_MODALS_LINK = Target.the("Alerts and Modals link")
			.locatedBy("//*[text()='Alerts & Modals']");
	private static final Target JAVASCRIPT_ALERT_LINK = Target.the("Javascript alert link")
			.locatedBy("//ul[not(@class)]//li//a[contains(@href, 'javascript-alert-box')]");
	private static final Target ClickMe_Button = Target.the("Single form demo link")
			.locatedBy("[onclick='myAlertFunction()']");

	// testdata
	String SiteURL = "https://demo.seleniumeasy.com/";
	String Message = "Hello, this is Ramya";

	Actor rams = Actor.named("Ramya");

	@Before
	public void launchURLSP() {
		rams.can(BrowseTheWeb.with(driver));
		rams.attemptsTo(Open.url(SiteURL));
	}

	@Test
	public void handlingSingleInputField() {
		rams.attemptsTo(Click.on(INPUT_FORMS_LINK), Click.on(SIMPLE_FORM_DEMO_LINK),
				Enter.theValue(Message).into(ENTER_MESSAGE), Click.on(SHOW_MESSAGE),
				Ensure.that(MESSAGE).text().isEqualTo(Message));
	}

//	@Test
//	public void handlingJavascriptAlertBox() {
//		rams.attemptsTo(Click.on(ALERTS_AND_MODALS_LINK), Click.on(JAVASCRIPT_ALERT_LINK), Click.on(ClickMe_Button));
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		String firstMsg = alert.getText();
//		alert.accept();
//		Assert.assertEquals("I am an alert box!", firstMsg);
//	}
}
