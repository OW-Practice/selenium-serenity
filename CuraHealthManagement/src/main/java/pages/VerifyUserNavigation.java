package pages;

import locaters.LandingScreen;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VerifyUserNavigation extends PageObject{
	
	LandingScreen land;
	
	
	public void verifyDashboard() {
		 
		WebElementFacade contant=$(land.txtHeath);
		contant.isCurrentlyVisible();
		System.out.println(contant.getText());
		
	}
	
	public void verifyLeftHamburg() {
		
		WebElementFacade menu=$(land.lftHamberg);
		menu.isVisible();
		menu.isClickable();
		System.out.println(menu.getText()+ "is displayed on home screen");
	}
	
        
}
