package CucumberSteps;



import Locators.LoginPage;
import Steps.LoginPageSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Steps;
import pages.Login;

public class LoginToApplicationSteps extends PageObject{
	@Steps
	LoginPageSteps log;
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		log.openApplication();
		//System.out.println("@Given -- user navigate to the website");
	}
	
	@When("^user enter admin as username$")
	public void user_enter_admin_as_username() {
		
		log.enterUsername();
	  //  System.out.println("@When -- user verify the title");
	}

	@Then("^user enter asdf as password$")
	public void user_enter_asdf_as_password() {
		
		log.enterPassword();

	    
	}

	@And("^user should be able to login$")
	public void user_should_be_able_to_login() {
		log.clickonLoginButton();

	   
	}
}
