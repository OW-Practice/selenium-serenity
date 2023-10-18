package Steps;



import net.thucydides.core.annotations.Step;
import pages.Login;


public class LoginPageSteps {
	
	Login loginPage;
	
	public void openUrl() {
		loginPage.Url();
	}
	
	@Step("checking the project title in login page ")
	public void verifyLoginPageIsDisplayed() {
		loginPage.verifyTitle();
	}
	
	@Step("entering username in input field")
	public void enterUsername(String username){
		loginPage.enterUsername(username);
	}
	
	@Step
	public void clickProceedButton() {
		loginPage.clickonProceedButton();
	}
	
	@Step
	public void verifyPasswordFiledDisplayed() {
		loginPage.verifyPasswordInputFieldDisplayed();
	}
	
	@Step
	public void enterPassword(String password) {
		loginPage.enterPassword(password);
	}
	
	@Step
	public void clickonSubmitButton() {
		loginPage.clickonSubmitButton();
	}
	

	
	
	

	
	

}
