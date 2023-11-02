package cucumberSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import step.PIMCreationTest;

public class LeaveSteps {

	@Steps
	PIMCreationTest PIM;
	
	@Given("^user click on Leave module$")
	public void  user_click_on_Leave_module() {
		
		System.out.println("@Given --  user click on Leave module");
	}
	
	@When("^user click on Assign Leave footer menu$")
	public void  user_click_on_Assign_Leave_footer_menu(){
		
		System.out.println("@When -- user click on Assign Leave footer menu");
	}
	
	@And("^user enter data into the fields (.*) and (.*)$")
	public void  user_enter_data_into_the_fields_Employee_Name_and_Leave_Type(String EmployeeName,String LeaveType) {
		
		System.out.println("@And -- user enter data into the fields" +EmployeeName+ "and" +LeaveType);
	}
	
	@And("^user enter data into the fields (.*) and (.*) and (.*)$")
	public void  user_enter_data_into_the_fields_From_Date_and_To_Date_and_Comments(String FromDate,String ToDate,String Comments) {
		
		System.out.println("@And -- user enter data into the fields" +FromDate+ "and" +ToDate+ "and" +Comments);
	}
	
	
	@Then("^user click on Assign button$")
	public void  user_click_on_Assign_button() {
		
		System.out.println("@Then -- user click on Assign button");
	}
}
