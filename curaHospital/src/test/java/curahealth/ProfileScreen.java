package curahealth;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.CustomerLogin;
import steps.PatientProfileUpdate;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src/test/resources/testdata/data.csv")
public class ProfileScreen extends PageObject{
	private String username;
	private String password;
	@Managed(driver="chrome")
	WebDriver drivr;
		
	@Steps
	CustomerLogin cust;
	PatientProfileUpdate profile;
	
	@TestData(columnNames ="Username,Password")
	@Qualifier
    public String qualifier() {
		return " - " + " Username = " + username + " and " + " Password = " + password + " should display ";
		
		
	}
	@Before
	@Title("User Login to application ")
	public void userLogin() {
		open();
		cust.customerNavigation();
		cust.verifyLoginScreen();
		cust.enterCredentials(username, password);
		cust.clickOnLogin();
		
	}
	@Title("User navigate to profile page ")
	@Test()
	
	public void profileUpdate() {
		profile.navigateUserToProfile();
		profile.vefyingPatientProfile();
	}
	
	@After
	@Title("User Logout from appliction")
	public void userLogout() {
		profile.logoutFromProfile();
	}

}
