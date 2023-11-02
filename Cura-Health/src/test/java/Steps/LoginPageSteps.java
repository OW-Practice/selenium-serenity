package Steps;



import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.Login;


public class LoginPageSteps extends PageObject {
	
	Login loginPage;
	
	@Step
	public void openApplication() {
		//loginPage.open();
		open();
	}
	
	
	
	@Step
	public void enterUsername(){
		loginPage.enterUsername();
	}
	
	
	@Step
	public void enterPassword() {
		loginPage.enterPassword();
	}
	
	@Step
	public void clickonLoginButton() {
		loginPage.clickonLoginButton();
	}
	

	
	
	

	
	

}
