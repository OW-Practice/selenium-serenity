package CuraHealthScreenplayProject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.Pages;

@RunWith(SerenityRunner.class)
public class CuraHealthTest extends PageObject{
	
	@Managed
	WebDriver driver;
	
	Actor curahealth=Actor.named("cura.herokuapp");
	@Before
	public void setThebrowser()
	{
		OnStage.setTheStage(new OnlineCast());
		driver.manage().window().maximize();
	}
	
	@Test
	public void CuraHealthLogin()
	{
		
			curahealth.can(BrowseTheWeb.with(driver));
//			curahealth.attemptsTo(Open.browserOn().the(CuraHealthURLTest.class));
			curahealth.attemptsTo(Open.browserOn().thePageNamed("ch	pages.react"));
			curahealth.attemptsTo(CHloginTest.predefinedcredentials());
			curahealth.attemptsTo(BookAppCHTest.patientBook());
			curahealth.attemptsTo(CHLogoutTest.lgout());
			
		}
	}


