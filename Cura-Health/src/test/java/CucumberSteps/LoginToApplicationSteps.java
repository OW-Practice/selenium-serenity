package CucumberSteps;



import Steps.LoginPageSteps;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class LoginToApplicationSteps extends PageObject{
	@Steps
	LoginPageSteps log;
	
	@Before
	public void user_is_on_home_page() {
		log.openApplication();
		//System.out.println("@Given -- user navigate to the website");
	}
	
	@When("^user enter (.*) username$")
	public void user_enter_admin_as_username(String username) {
		
		log.enterUsername(username);
	  //  System.out.println("@When -- user verify the title");
	}

	@Then("^user enter (.*) password$")
	public void user_enter_asdf_as_password() {
		
		log.enterPassword();

	    
	}

	@And("^user should be able to login$")
	public void user_should_be_able_to_login() {
		log.clickonLoginButton();

	   
	}
}
