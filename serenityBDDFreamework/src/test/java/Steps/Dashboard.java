package Steps;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.DashboardPage;


public class Dashboard extends PageObject{
	DashboardPage dashboard;
	
	public void verifyDashboardPageDisplayed() {
		dashboard.verifyDashboardPageDisplayed();
	}
	@Step
	public void verifyPeopleDropdownDisplayed() {
		dashboard.verifyPeopleDropdownDisplayed();
	}
	@Step
	public void clickPeopleDropdown() {
		dashboard.clickPeopleDropdown();
	}
	@Step
	public void selectContactOption() {
		dashboard.selectContact();
	}
	@Step
	public void selectCompaniesOption() {
		dashboard.selectCompaniesOption();
	}
}
