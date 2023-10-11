package pages;

import Locators.Segment;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateSegmentPage extends PageObject{

	Segment segments;
	
	public void clickOnCreateSegment() {
		WebElementFacade createSegment = find(segments.createSegmentButton);
		createSegment.shouldBeVisible();
		createSegment.click();
	}
	
	public void verifyCreateDisplayed() {
		WebElementFacade CreateSegmentPage = find(segments.createSegmentPage);
		CreateSegmentPage.shouldBeVisible();
	}
}
