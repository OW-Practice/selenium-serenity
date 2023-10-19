package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import task.serenitytask;

@RunWith(SerenityRunner.class)
@Concurrent(threads = "4")
@UseTestDataFrom(value = "D:\\eclipse\\carswaley\\src\\test\\resources\\testdata\\data.csv")
@Narrative(text = { "welcome to google" })
public class SerenityTestCase extends PageObject {

	

	@Managed
	public WebDriver driver;
	serenitytask task;
	private static Actor user = Actor.named("User");
	

	
	

	@Title("actor login to the demo blaze application in screenplay")
	@Test
	public <T extends Actor> void demoBlazeApplicatrion()   {
		open();
		task.demoblaunch();
		task.performAs(user);
		

		
	}

	

}
