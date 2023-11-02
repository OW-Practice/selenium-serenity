package cucumberSteps;


import Pages.HomePageTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import step.PIMCreationTest;

public class LoginTestSteps extends PageObject{
	
	@Steps
	PIMCreationTest PIM;
	HomePageTest orange;
	
	@Given("^user navigate to OrangeHRM URL$")
	public void user_navigate_to_OrangeHRM_URL() {
		getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("@Given --  user navigate to OrangeHRM URL");
	}
	
	@When("^user entered (.*) and (.*) into respective fields$")
	
	public void  user_entered_username_and_password_into_respective_fields(String username,String password) throws InterruptedException {

		PIM.userEntersCredentials(username,password);
		System.out.println("user_entered_username_and_password_into_respective_fields");
	}
	
	@And("^user click on submit Login button$")
	public void  user_click_on_submit_Login_button() {
		PIM.loginSubmit();
		System.out.println("user_click_on_submit_Login_button");
	}
	
	@Then("^user logged into OrangeHRM application$")
	public void  user_logged_into_OrangeHRM_application() {
  	PIM.verifypage();
  	System.out.println("user logged into OrangeHRM application");
	}
	
	
}
