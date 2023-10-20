package pages;

import locaters.DashBoardLocaters;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UserLogin extends PageObject{
	
	DashBoardLocaters loc;
	
	
	public void navigateToHome(String username,String password) {
		
		WebElementFacade login =$(loc.txtLogin);
		login.isDisplayed();
		login.click();
		$(loc.lgnUsername).type(username);
		$(loc.lgnPassword).type(password);
		$(loc.btnLogin).click();
		Serenity.takeScreenshot();
			
	}
	public void verifyHomeScreen() {
		WebElementFacade productstore = $(loc.hdrCategories);
		productstore.isDisplayed();
		System.out.println(productstore.getText());
		Serenity.takeScreenshot();
		
	}
	public void verifyCurrentUsername() {
		WebElementFacade user=$(loc.lgnName);
		user.isPresent();
		System.out.println(user.getText());
		Serenity.takeScreenshot();
	}
	

}
