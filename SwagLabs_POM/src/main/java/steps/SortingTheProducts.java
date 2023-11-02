package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.ProductsSorting;

public class SortingTheProducts extends PageObject{
	
	ProductsSorting sort;
	
	@Step
	public void verifyFilterOption() {
		sort.verifySortOption();
	}
	@Step
	public void selectLowToHigh() {
		sort.selectLowToHigh();
	}
	@Step
	public void compareLowWithHigh() {
		sort.verifyLowPriceItem();
	}
	@Step
	public void addingHighPrice() {
		sort.addRedTshirt();
	}

}
