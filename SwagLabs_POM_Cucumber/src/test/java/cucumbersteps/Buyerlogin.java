package cucumbersteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import steps.EnterUserCredentails;
import steps.ItemAddToCart;
import steps.VerifyLoginPage;

public class Buyerlogin extends PageObject{
	
	@Steps
	VerifyLoginPage log;
	EnterUserCredentails user;
	ItemAddToCart item;

@Given("^Buyer navigate to Website$")
public void buyer_navigate_to_Website() {
	log.validateLoginScreen();
   
    
}


@When("^Buyer Enter (.*) and (.*)")
public void buyer_Enter_username_and_password(String username,String password) {
	log.validateUsername();
    user.enterUsername(username);
    log.validatePassword();
    user.enterPassword(password);
    
}

@Then("^Buyer click on login button$")
public void buyer_click_on_login_button() {
	
	log.validateLoginButton();
	user.clickOnLogin();
   
   
}

@And("^Buyer navigate to Product Screen$")
public void buyer_navigate_to_Product_Screen() {
    item.verifyProductPage();
}



}
