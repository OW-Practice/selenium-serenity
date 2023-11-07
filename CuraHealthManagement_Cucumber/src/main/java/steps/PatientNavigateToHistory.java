package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.HistoryPage;

public class PatientNavigateToHistory extends PageObject{
	
	HistoryPage hp;
	@Step
	public void patientNavigateToHistory() {
		
		hp.navigateUserToHistoryPage();
		
	}
	@Step
	public void verifyingtheHistoryScreen() {
		
		hp.verifyHistoryScreen();
	}
	@Step
	public void patientNavigatebackToHome() {
		
		hp.clickOnGotoHomepage();
	}

}
