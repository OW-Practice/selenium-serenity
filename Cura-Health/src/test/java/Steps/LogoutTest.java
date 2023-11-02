package Steps;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.LogoutPage;



public class LogoutTest extends PageObject{
   LogoutPage logout;
   
	@Step
	public void clickOnmenu() {
		logout.clickOnMenu();
	}
	
	@Step
	public void clickOnLogout() {
		logout.clickOnLogout();
	}	
}
