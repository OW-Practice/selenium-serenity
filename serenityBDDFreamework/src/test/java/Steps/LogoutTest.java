package Steps;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.LogoutPage;



public class LogoutTest extends PageObject{
   LogoutPage logout;
   
	@Step
	public void clickOnProfile() {
		logout.clickOnProfile();
	}
	
	@Step
	public void clickOnLogout() {
		logout.clickOnLogout();
	}
	@Step
	public void verifyLogoutPageDisplayed() {
		logout.verifyLogout();
	}
}
