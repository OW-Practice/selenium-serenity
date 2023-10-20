package steps;

import net.serenitybdd.core.pages.PageObject;
import pages.LaunchURL;
import pages.NewUserRegistrations;
import pages.UserLogin;

public class LuanchBlaze extends PageObject {
	
	LaunchURL url;
	NewUserRegistrations user;
	UserLogin log;
	
	public void userNavigateToDashboard() {
		url.verifyingTheDashboard();
				
	}
	
	public void customerRegister(String username ,String password) {
		user.addNewUser(username,password);
	}
	 public void userLogin(String username ,String password) {
		 
		 log.navigateToHome(username,password); 
	 }
	 public void verifyProductScreen() {
		 log.verifyHomeScreen();
			log.verifyCurrentUsername();
	 }

}
