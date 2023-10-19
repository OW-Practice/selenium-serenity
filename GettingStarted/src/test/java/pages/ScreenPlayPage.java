package pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public abstract class ScreenPlayPage implements Task {
	WebDriver driver;

	@Step("Launches 'SiteURL'")
	public <T extends Actor> void performAs(T actor, String SiteURL) {
		actor.can(BrowseTheWeb.with(driver));
		actor.attemptsTo(Open.url(SiteURL));
	}
}
