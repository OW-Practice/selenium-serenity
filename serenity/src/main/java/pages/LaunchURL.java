package pages;

import org.openqa.selenium.remote.server.handler.SendKeys;

import locaters.DemoBlazeLocaters;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class LaunchURL extends PageObject {
	
	DemoBlazeLocaters dash;
	
	public  void verifyingTheDashboard() {
		
		WebElementFacade brandlogo=$(dash.brandLogo);
		brandlogo.isDisplayed();
		//Serenity.takeScreenshot();
	}
}
	
	

