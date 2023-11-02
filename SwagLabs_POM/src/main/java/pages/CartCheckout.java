package pages;

import locaters.CartLocaters;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartCheckout extends PageObject{
	
	CartLocaters cart;
	
	public void verifyCartIcon() {
		WebElementFacade carticon=$(cart.CartIcon);
		carticon.isDisplayed();
		
	}
	public void navigateUserToCart() {
		WebElementFacade carticon=$(cart.CartIcon);
		carticon.waitUntilClickable().click();
	}
    public void verifyCartScreen() {
    	WebElementFacade cartText=$(cart.textYourCart);
    	cartText.isDisplayed();
    	System.out.println(cartText.getText());
    }
    public void removeItemFromCart() {
    	$(cart.removeRed).waitUntilClickable().click();
    }
    public void verifyCheckoutButton() {
    	 WebElementFacade checkout=$(cart.btnCheckout);
    	 checkout.isDisplayed();
    }
    public void clickOnCheckoutButton() {
   	 WebElementFacade checkout=$(cart.btnCheckout);
   	 checkout.waitUntilClickable().click();
   }
    
    
}
