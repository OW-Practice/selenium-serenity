package pages;

import locaters.ProductsLocaters;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductAddToCart extends PageObject {
	
	ProductsLocaters prod;
	
	
	public void verifyBackpack() {
		WebElementFacade bag =$(ProductsLocaters.backPackBag);
		bag.isCurrentlyVisible();
		
	}
	public void navigateUserToBackBagPage() {
		WebElementFacade backBag=$(prod.backPackBag);
		backBag.waitUntilClickable().click();
		WebElementFacade itemDescription=$(prod.backPackDesc);
		itemDescription.isDisplayed();
		System.out.println(itemDescription.getText());
	}
	public void addBagToCart() {
		$(prod.addBagButton).waitUntilClickable().click();
	}
	public void clickOnPageBack() {
     WebElementFacade remove=$(prod.removeButton);
     if (remove.isDisplayed()) {
    	 
    	 $(prod.pageBackIcon).click();
		
	} else {

	}
  }
	
}
