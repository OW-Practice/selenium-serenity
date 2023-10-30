package CuraHealthSerenity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
@RunWith(SerenityRunner.class)

public class History4Test extends PageObject {
	@Managed
	WebDriver driver;
	LocCHTest locatorsCuraHealth;
	UtilitiesTest utilitiesClass;
	public String ActualFInput;

	@Test
	public void historychck() {
		utilitiesClass.elementPresence(LocCHTest.GO_TO_HOMEPAGE_LINK);
		utilitiesClass.click(LocCHTest.GO_TO_HOMEPAGE_LINK);
		utilitiesClass.elementPresence(LocCHTest.MENU_BUTTON_ON_LAUNCH_PAGE);
		utilitiesClass.click(LocCHTest.MENU_BUTTON_ON_LAUNCH_PAGE);
		utilitiesClass.elementPresence(LocCHTest.GO_TO_PROFILE_LINK);
		utilitiesClass.click(LocCHTest.GO_TO_PROFILE_LINK);
		
		utilitiesClass.elementPresence(LocCHTest.GO_TO_HISTORY_LINK);
		utilitiesClass.click(LocCHTest.GO_TO_HISTORY_LINK);
		
		WebElementFacade faclitytext=$(By.xpath("p//[@id='facility']"));
		String displayedfailityinput=faclitytext.getText();
		System.out.println("Facility input selected from dropdown is:" +displayedfailityinput);
		
		if(displayedfailityinput!= null)
		{
			displayedfailityinput = ActualFInput;
		}else
		{
			System.out.println("Selected dropdown is not displayed in History tab");
		}
		
	}

}
