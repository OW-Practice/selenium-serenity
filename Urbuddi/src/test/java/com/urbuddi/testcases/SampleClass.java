package com.urbuddi.testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject; 
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class SampleClass extends PageObject {
	@Managed
	WebDriver driver;

	@Test
	public void launchURL() {
		open();
	}
}
