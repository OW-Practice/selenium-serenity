package newtestcases;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.ScreenPlay;
import steps.InspifySteps;

@RunWith(SerenityRunner.class)
public class ScreenPlayTestCase {
	@Managed
	WebDriver driver;
	ScreenPlay sp;

	@Test
	@DisplayName("Login using valid creds")
	public void launchURLUsingScreenplay() {
		sp.launchURLSP();
	}
}
