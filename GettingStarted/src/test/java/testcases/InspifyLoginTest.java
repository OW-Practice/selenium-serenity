package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.InspifySteps;
import utilities.TestDataLoader;

@RunWith(SerenityRunner.class)
public class InspifyLoginTest {
	private TestDataLoader testDataLoader = new TestDataLoader();
	String username = testDataLoader.getUsername();
	String password = testDataLoader.getPassword();
	
	@Managed
	WebDriver driver;
	
	@Steps
	InspifySteps inspify;
	
	@Title("Login to Inspify")
	@Test
	
	public void login() {
		inspify.launchURL();
		inspify.login(username, password);
	}
}
