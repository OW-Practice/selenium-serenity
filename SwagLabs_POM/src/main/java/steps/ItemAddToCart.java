package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.ProductAddToCart;

public class ItemAddToCart extends PageObject{
	
	ProductAddToCart cart;
	
	
	@Step
	public void verifyProductPage() {
		cart.verifyBackpack();
	}
    @Step
    public void verifyBackBagDetails() {
    	cart.navigateUserToBackBagPage();
    }
    @Step
    public void addBackToCart() {
    	cart.addBagToCart();
    }
    @Step
    public void userNavigateToHomeScreen() {
    	cart.clickOnPageBack();
    }
}
