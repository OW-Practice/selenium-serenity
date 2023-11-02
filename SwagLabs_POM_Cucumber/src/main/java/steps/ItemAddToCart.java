package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.ProductAddToCart;
import pages.ProductsSorting;

public class ItemAddToCart extends PageObject{
	
	ProductAddToCart cart;
	ProductsSorting sort;
	
	
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
    @Step
    public void addLight() {
    	sort.addLight();
    }
}
