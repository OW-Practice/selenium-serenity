package pages;

import locaters.LandingScreen;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HistoryPage extends PageObject{
	
	LandingScreen lc;
	
	public void navigateUserToHistoryPage() {
		
		WebElementFacade menu=$(lc.lftHamberg);
		menu.click();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		WebElementFacade historytab=$(lc.tabHistory);
		historytab.click();
	}
	public void verifyHistoryScreen() {
		
		WebElementFacade historytext=$(lc. headerHistory);
		historytext.isDisplayed();
		
	}
	public void clickOnGotoHomepage() {
		WebElementFacade gotoHome=$(lc.btnGoToHome);
		gotoHome.waitUntilClickable().click();
	}

}
