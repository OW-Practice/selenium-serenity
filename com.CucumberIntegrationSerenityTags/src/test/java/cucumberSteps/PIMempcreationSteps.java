package cucumberSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import step.PIMCreation;

public class PIMempcreationSteps {
	
	@Steps
	PIMCreation PIM;
	
	@Given("^user click on PIM module$")
	public void user_click_on_PIM_module() {
		PIM.addNewEmp();
		System.out.println("@Given --   Given user click on PIM module");
	}
	
	@When("^user click on Add button$")
	public void user_click_on_Add_button() {
		
		System.out.println("@When --  When user click on Add button");
	}
	
	@And("^user enter data into the fields (.*) and (.*) and (.*) and (.*)$")
	public void user_enter_data_into_the_fields_firstname_and_middlename_and_lastname_and_employeeid(String firstname,String middlename,String lastname,int employeeid) {
		
		System.out.println("@And --user enter data into the fields" +firstname+ "and" +middlename+ "and" +lastname+ "and" +employeeid );
	}
	
	@And("^user click on Create login details button with (.*) and (.*) and (.*)$")
	public void user_click_on_Create_login_details_button_with_NewUsername_and_NewPassword_and_Confirmpassword(String NewUsername,String NewPassword,String Confirmpassword) {
		
		System.out.println("@And -- user click on Create login details button with <NewUsername> and <NewPassword> and <Confirmpassword>");
	}
	
	
	@Then("^user click on Save button$")
	public void user_click_on_Save_button() {
		
		System.out.println("@Then -- user click on Save button");
	}
}
