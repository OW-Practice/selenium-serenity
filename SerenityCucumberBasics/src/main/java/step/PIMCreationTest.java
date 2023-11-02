package step;

import Pages.HomePageTest;
import base.LocatorsTest;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class PIMCreationTest {
	
	HomePageTest hp;
	
	
	
	@Step
	public void Orangehrmurl() {
		hp.open();
	}
	@Step
	public void userEntersCredentials(String username,String password) {
		try {
			hp.loginCred(username,password);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Step
	public void loginSubmit() {
		hp.submitCred();
	}
	@Step
	public void verifypage() {
		hp.assertionforpagetitle("OrangeHRM");
	}
	
	@Step
	public void PIMclk() {
		hp.dashboardPIMclick();
	}
	
	@Step
	public void Addclk() {
		hp.dashboardAddclick();
	}
	
	@Step
	public void Addingemp(String firstname,String middlename,String lastname,String employeeid) {
		hp.AddEmployeeOperations(firstname,middlename,lastname,employeeid);
	}
	
	@Step
	public void createnewlogin(String NewUsername,String NewPassword,String Confirmpassword) {
	hp.addCreatelogindetails(NewUsername,NewPassword,Confirmpassword);
	}
	
	@Step
	public void savenewlogin() {
	hp.savelogincredentials();
	}
	
//	
//	@Step
//	public void verifingTheDashboard() {
//		orange.dashboard();
//	}
//	
//	@Step
//	public void addNewEmp() {
//		orange.AddEmployeeOperations();
//	}
//	
//	@Step
//	public void AssignLeaveToEmployee() {
//		orange.applyleave();
//	}

}
