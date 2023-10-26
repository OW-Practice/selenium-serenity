package com.urbuddi.testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.urbuddi.steps.UrbuddiSteps;
import com.urbuddi.utilities.TestDataLoader;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class LoginTestCase {

	private TestDataLoader testDataLoader = new TestDataLoader();
	String username = testDataLoader.getUsername();
	String password = testDataLoader.getPassword();

	@Managed
	WebDriver driver;

	@Steps
	UrbuddiSteps urbuddy;

	@Title("Login with valid username and valid password")
	@Test
	public void verifyLoginWithValidCreds() {
		urbuddy.launchURL();
		urbuddy.verifyIsLoginPageDisplayed();
		urbuddy.inputCredentials(username, password);
		urbuddy.clickOnLoginButton();
		urbuddy.verifyIsHomePageDisplayed();
	}

	@Title("Login with empty creds")
	@Test
	public void verifyLoginWithEmptyCreds() {
		urbuddy.launchURL();
		urbuddy.verifyIsLoginPageDisplayed();
		urbuddy.clickOnLoginButton();
		urbuddy.verifyIsRequiredTextDisplayed();
	}
}
