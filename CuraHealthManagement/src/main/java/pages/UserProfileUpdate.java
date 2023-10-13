package pages;

import locaters.LandingScreen;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UserProfileUpdate extends PageObject{
	
	LandingScreen lc;
	
	public void navigateToprofile() {
		
		WebElementFacade menu=$(lc.lftHamberg);
		menu.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		WebElementFacade profiletab=$(lc.tabProfile);
		profiletab.click();
	}
	public void verifyProfileScreen() {
		WebElementFacade profile=$(lc.profileText);
		profile.isDisplayed();
	}
	public void btnLogout() {
		WebElementFacade dev=$(lc.underdev);
		
		WebElementFacade logout=$(lc.btnLogout);
		
		if (dev.isDisplayed()) {
			logout.waitUntilClickable().click();
		} else {
           System.out.println("Logout Button not clicked ");
		}
	}

}
