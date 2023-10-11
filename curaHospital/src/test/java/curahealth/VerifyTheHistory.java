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
import steps.PatientNavigateToHistory;

@RunWith(SerenityParameterizedRunner.class )
@UseTestDataFrom(value="src/test/resources/testdata/data.csv")
public class VerifyTheHistory extends PageObject {
	private String username;
	private String password;
	
	@Managed()
	WebDriver driver;
	
	@Steps
	PatientNavigateToHistory pat;;
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
		 cust.customerNavigation();
		 cust.verifyLoginScreen();
		 cust.enterCredentials(username, password);
		 cust.clickOnLogin();
		
		
	}
	@Title("User navigate to History screen")
	@Test
	public void navigateToHistoryTab() {
		pat.patientNavigateToHistory();
		pat.verifyingtheHistoryScreen();
	}
	@After
	@Title("User navigate to Home Page")
	public void userBackToHome() {
		pat.patientNavigatebackToHome();
	}
	

}
