package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import questions.HomePageHeader;
import tasks.LoginToApplication;

@RunWith(SerenityRunner.class)
public class UserLoginToApplication {
	
	@Managed(driver="chrome")
    WebDriver driver;
	
	Actor tana= Actor.named("user");
	LoginToApplication lg;
	
	@Before
	@Title("user launching the website")
	public void openApp() {
		tana.can(BrowseTheWeb.with(driver));
		tana.attemptsTo(Open.url("https://www.saucedemo.com/"));
	}
	@Title("user logi into application")
	@Test
	public void customerLogin() {
		tana.attemptsTo(
				
				lg.login("standard_user", "secret_sauce")
				
				);
		Target headerLocator = Target.the("Header").locatedBy("[class=\"login_logo\"]");
        String expectedHeader = "Products";

		/*
		 * tana.should(
		 * GivenWhenThen.seeThat("The displayed header matches the expected header",
		 * HomePageHeader.header(headerLocator), Text.of(headerLocator).toString())
		 * .isEqualTo(expectedHeader) );
		 */
	}
	
}

