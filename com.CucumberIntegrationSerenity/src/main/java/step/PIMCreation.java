package step;

import Pages.HomePage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class PIMCreation extends PageObject {
	
	HomePage orange;
	
	
	@Step
	public void userLoginToApplication() throws InterruptedException {
		orange.doLogin("Admin","admin123");
	}
	
	@Step
	public void verifingTheDashboard() {
		orange.dashboard();
	}
	
	@Step
	public void addNewEmp() {
		orange.AddEmployeeOperations();
	}
	
	@Step
	public void AssignLeaveToEmployee() {
		orange.applyleave();
	}

}
