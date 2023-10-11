package testCase;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
public class CompaniesCreationTestSuite extends PageObject {

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
	
	@Test
	public void companytCreation() {
		//driver.get("https://app.emlen-staging.io/login");
		/*open();
		login.verifyLoginPageIsDisplayed();
		login.enterUsername(data.username);
		login.clickProceedButton();
		login.verifyPasswordFiledDisplayed();
		login.enterPassword(data.password);
		login.clickonSubmitButton();
		//dashboard.verifyDashboardPageDisplayed();
		//dashboard.verifyPeopleDropdownDisplayed(); */
		dashboard.clickPeopleDropdown();
		dashboard.selectCompaniesOption();
		companies.clickAddnewButton();
		//companies.verifyCreateCompaniesPopupDisplayed();
		companies.enterDetailsinCreateCompanyPopup(data.name,data.street,data.streeetNumber,data.city,data.state,data.postCode);
		companies.clickSaveButton();
		/*logout.clickOnProfile();
		logout.clickOnLogout();
		logout.verifyLogoutPageDisplayed();*/
		
	}
}
