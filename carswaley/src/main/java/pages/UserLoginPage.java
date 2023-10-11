package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locaters.DemoBlazeLocaters;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;

public class UserLoginPage extends PageObject{
	@Managed(driver="chrome")
	WebDriver driver;
	DemoBlazeLocaters LoginLocaters;
	
	
	public void navigateToHome(String username,String Password) {
		
		WebElementFacade login =$(LoginLocaters.txtLogin);
		login.isDisplayed();
		login.click();
		$(LoginLocaters.lgnUsername).type(username);
		$(LoginLocaters.lgnPassword).type(Password);
		$(LoginLocaters.btnLogin).click();
		//WebDriverWait wait = new WebDriverWait(getDriver(), 50); // Adjust the timeout as needed
		//wait.until(ExpectedConditions.alertIsPresent());
		
	
		
	//	Serenity.takeScreenshot();
			
	}
	public void verifyHomeScreen() {
		WebElementFacade productstore = $(LoginLocaters.hdrCategories);
		productstore.isDisplayed();
		System.out.println(productstore.getText());
		//Serenity.takeScreenshot();
		
	}
	public void verifyCurrentUsername() {
		WebElementFacade user=$(LoginLocaters.lgnName);
		user.isPresent();
		System.out.println(user.getText());
	//	Serenity.takeScreenshot();
	}
	

}
