package pages;

import org.junit.Assert;

import Locators.DashboardLocators;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class DashboardPage extends PageObject{
	
	DashboardLocators dashboard;	
	
	public void verifyDashboardPageDisplayed() {
		String current_url = getDriver().getCurrentUrl();
		Assert.assertTrue(current_url.contains("dashboard"));
		
		
	}
	
	public void verifyPeopleDropdownDisplayed() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 WebElementFacade peopleDropdown = find(dashboard.peopleDropdown);
		    peopleDropdown.shouldBePresent();
		    peopleDropdown.shouldBeVisible();
	}
	public void clickPeopleDropdown() {
		WebElementFacade peopleDropdown = find(dashboard.peopleDropdown);
	    peopleDropdown.click();
	}
	
	public void selectContact() {
		WebElementFacade contact = find(dashboard.contactOption);
		contact.shouldBePresent();
	    contact.click();
	}  
	
	public void selectCompaniesOption() {
		WebElementFacade companies = find(dashboard.companies);
		companies.shouldBePresent();
		companies.click();
}
	public void selectSegmentOption() {
		WebElementFacade segments = find(dashboard.segmentOption);
		segments.shouldBePresent();
		segments.click();
}
}

