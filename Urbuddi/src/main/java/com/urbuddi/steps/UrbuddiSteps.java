package com.urbuddi.steps;

import com.urbuddi.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class UrbuddiSteps {
	LoginPage login;

	@Step
	public void launchURL() {
		login.open();
	}

	@Step
	public void verifyIsLoginPageDisplayed() {
		login.verifyIsLoginPageDisplayed();
	}

	@Step
	public void inputCredentials(String email, String password) {
		login.inputCredentials(email, password);
	}

	@Step
	public void clickOnLoginButton() {
		login.clickOnLoginButton();
	}

	@Step
	public void verifyIsHomePageDisplayed() {
		login.verifyIsHomePageDisplayed();
	}

	@Step
	public void verifyIsRequiredTextDisplayed() {
		login.verifyIsRequiredTextDisplayed();
	}
}
