package webelements;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

public class HandlingActionEvents extends PageObject {
	@Managed
	WebDriver driver;
	
	@Title("Executing Login Test")
	@Test
	public void mouseOver() {
		driver.get("https://www.way2automation.com/");
	}

}
