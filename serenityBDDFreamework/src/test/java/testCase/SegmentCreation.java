package testCase;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Steps.CreateCompany;
import Steps.Dashboard;
import Steps.LoginPageSteps;
import Steps.LogoutTest;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import testDataDriven.TestData;
@RunWith(SerenityRunner.class)
public class SegmentCreation extends PageObject{
	@Managed(driver="chrome")
	WebDriver driver;
	@Steps
	LoginPageSteps login;
	Dashboard dashboard;
	CreateCompany companies;
	TestData data;
	LogoutTest logout;
	@Before
	public void login() {
        open();
		login.verifyLoginPageIsDisplayed();
		login.enterUsername(data.username);
		login.clickProceedButton();
		login.verifyPasswordFiledDisplayed();
		login.enterPassword(data.password);
		login.clickonSubmitButton();
		
	}
	
	@After
	public void logout() {
		logout.clickOnProfile();
		logout.clickOnLogout();
		logout.verifyLogoutPageDisplayed();
	}
	
	public void createSegment() {
		dashboard.clickPeopleDropdown();
		dashboard.selectCompaniesOption();
		companies.clickAddnewButton();
	}
}
