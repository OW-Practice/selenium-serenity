package testcases;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.EnterUserCredentails;
import steps.VerifyLoginPage;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src/test/resources/testdata/data.csv")
@Narrative(text= {"In order to ensure login page from Swag lab application",
		"Here am testing the login functionality with valid credentails"
})

public class CustomerLogin extends PageObject{

	@Managed(driver="chrome")
	WebDriver driver;
	
	private String username;
	private String password;
	
	@Steps
	EnterUserCredentails user;
	VerifyLoginPage page;
	
	@TestData(columnNames ="Username , Password")
	@Qualifier
	public String qualifier() {
	
		 return " - " + " Username = " + username + " and " + " Password = " + password +  " should display ";
	}
	@Before
	@Title("verify the login page")
	public void verifyLoginPage() {
		open();
		page.validateLoginScreen();
	    page.validateUsername();
		page.validatePassword();
		page.validateLoginButton();
	}
	@WithTag("userlogin into application with valid credentails")
	@Title("Customer Login into application")
	@Test
	public void customerLogin() {
		user.enterUsername(username);
		user.enterPassword(password);
		user.clickOnLogin();
	}
	
}
