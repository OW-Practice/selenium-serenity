package cucumberSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import step.PIMCreation;

public class LoginSteps {
	
	@Steps
	PIMCreation PIM;
	
	@Given("^user navigate to OrangeHRM (.*)$")
	public void  user_navigate_to_OrangeHRM_URL(String URL) {
		
		PIM.open();
		PIM.verifingTheDashboard();
		System.out.println("@Given --  user navigate to OrangeHRM:" +URL);
	}
	
	@When("^user entered (.*) and (.*) into respective fields$")
	public void  user_entered_username_and_password_into_respective_fields(String username,String password) throws InterruptedException {
		
		PIM.userLoginToApplication();
		
		System.out.println("@When -- user entered" +username+ "and" +password+ "into respective fields");
	}
	
	@And("^user click on submit Login button$")
	public void  user_click_on_submit_Login_button() {
		PIM.verifingTheDashboard();
		System.out.println("@And -- user click on submit Login button");
	}
	
	@Then("^user logged into OrangeHRM application$")
	public void  user_logged_into_OrangeHRM_application() {
		
		System.out.println("@Then -- user logged into OrangeHRM application");
	}
}
