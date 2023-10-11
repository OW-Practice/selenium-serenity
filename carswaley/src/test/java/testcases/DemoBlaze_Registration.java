package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.LaunchBlaze;

@RunWith(SerenityRunner.class)
public class DemoBlaze_Registration extends PageObject{
	@Managed(driver="chrome")
	WebDriver driver;
	@Steps
	LaunchBlaze browseUrl;
	
	@Title("Custer Navigate to Landing Screen")
	@Test
	public void userActions(String Username,String Password) {
		open();
		browseUrl.userNavigateToDashboard();
		browseUrl.customerRegister(Username,Password);
	}

}
