package pages;

import static org.junit.Assert.assertNotEquals;

import locaters.ProductsLocaters;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductsSorting extends PageObject{
	
	ProductsLocaters pol;
	
	public void verifySortOption() {
		WebElementFacade sort=$(pol.sortFilter);
	    sort.isDisplayed();
	    
	}
	public void selectLowToHigh() {
		$(pol.sortFilter).waitUntilClickable().click();
		WebElementFacade lowFilter=$(pol.lowTohighFilter);
		lowFilter.select();
	}
	public void verifyLowPriceItem() {
		WebElementFacade lowest=$(pol.lowestprice);
		WebElementFacade highest=$(pol.priceHigh);
		
		assertNotEquals(lowest, highest);
		if (lowest!=highest) {
			
			System.out.println("lowest price amount not matching with highest value");
			
		}
		
	}
	public void addRedTshirt() {
		WebElementFacade redShirt=$(pol.addRedTshirt);
		redShirt.click();
	}
	public void addLight() {
		WebElementFacade light =$(pol.addBikeLight);
		light.waitUntilClickable().click();
	}

}
