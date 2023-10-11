package testCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Steps.LoginPageSteps;
import Steps.LogoutTest;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.DashboardPage;
import testDataDriven.TestData;
@RunWith(SerenityRunner.class)
public class LogoutTestSuite extends PageObject{
	@Managed(driver = "firefox")
	WebDriver driver;
	@Steps
	LoginPageSteps login;
	DashboardPage dashboard;
	LogoutTest logout;
	TestData data;	
	@Test
	public void logoutTestCase(){
		open();
		login.verifyLoginPageIsDisplayed();
		login.enterUsername(data.username);
		login.clickProceedButton();
		login.verifyPasswordFiledDisplayed();
		login.enterPassword(data.password);
		login.clickonSubmitButton();
		dashboard.verifyDashboardPageDisplayed();
		logout.clickOnProfile();
		logout.clickOnLogout();
		logout.verifyLogoutPageDisplayed();
	
	}
}
