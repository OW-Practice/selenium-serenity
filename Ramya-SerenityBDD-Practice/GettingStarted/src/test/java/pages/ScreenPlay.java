package pages;

import base.BasePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;

public abstract class ScreenPlay extends BasePage {
	private static final Target INPUT_FORMS_LINK = Target.the("Input Forms link")
			.locatedBy("//*[text()='Input Forms']");
	private static final Target SIMPLE_FORM_DEMO_LINK = Target.the("single form demo link")
			.locatedBy("//ul[not(@class)]//li//a[contains(@href, 'basic-first-form')]");

	Actor toby = Actor.named("Toby");

	public void launchURLSP() {
		toby.can(BrowseTheWeb.with(getDriver()));
		toby.attemptsTo(Open.url("https://demo.seleniumeasy.com/"));
	}

	public void openInputFormsSP() {
		toby.attemptsTo(Click.on(INPUT_FORMS_LINK));
	}

	public void clickOnSimpleFormDemo() {
		toby.attemptsTo(Click.on(SIMPLE_FORM_DEMO_LINK));
	}
}
