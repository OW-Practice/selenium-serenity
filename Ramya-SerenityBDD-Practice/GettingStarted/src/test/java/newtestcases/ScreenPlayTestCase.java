package newtestcases;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import pages.ScreenPlay;

@RunWith(SerenityRunner.class)
public class ScreenPlayTestCase {
	ScreenPlay sp;
	@Managed(driver = "chrome")
	WebDriver driver;

	@Test
	@DisplayName("Login using valid creds")
	public void launchURLUsingScreenplay() {
		sp.launchURLSP();
	}

	public void simpleFormDemo() {
		sp.openInputFormsSP();
		sp.clickOnSimpleFormDemo();
	}
}
