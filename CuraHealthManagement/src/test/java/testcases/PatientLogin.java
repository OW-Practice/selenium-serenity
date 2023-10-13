package testcases;

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
import steps.VerifyingTheDashboard;

@RunWith(SerenityParameterizedRunner.class )
@UseTestDataFrom(value="src/test/resources/testdata/data.csv")
public class PatientLogin extends PageObject {
	
	private String username;
	private String password;
	
	@Managed(driver="chrome")
	WebDriver driver;
	
	@Steps
	VerifyingTheDashboard dash;
	CustomerLogin cust;
	
	@TestData(columnNames ="Username,Password")
	@Qualifier
    public String qualifier() {
		return " - " + " Username = " + username + " and " + " Password = " + password + " should display ";
		
		
	}
	@Before
	@Title("Patient navigating to landing screen")
	public void patientNavigation() {
		 open();
		dash.validatingTheDashboard();
		cust.customerNavigation();
		
		
	}
	@Title("Patient adding his credentials")
	@Test
	public void patientLoginToApp() {
		cust.enterCredentials(username,password);
		cust.verifyLoginScreen();
	}
	
	@After
	@Title("Patient Clicking on Login Button")
	public void clickOnLogin() {
		cust.clickOnLogin();
	}
	
	

}
