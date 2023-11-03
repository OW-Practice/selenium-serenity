package cucumbersteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.CartcheckoutSteps;
import steps.ItemAddToCart;
import steps.SortingTheProducts;

public class CustomerEndtoEndFlow {
	
	
	@Steps
	ItemAddToCart item;
	SortingTheProducts sort;
	CartcheckoutSteps cart;
	
	
	@And("^Buyer Sorting the Product List$")
	public void buyer_Sorting_the_Product_List() {
		item.addLight();
	    
	}

	@Then("^Buyer Adding the Light Product To Cart$")
	public void buyer_Adding_the_Light_Product_To_Cart() {
	    sort.verifyFilterOption();
	    sort.selectLowToHigh();
	    sort.compareLowWithHigh();
	    
	}

	@And("^Buyer Adding the RedTShirt to cart$")
	public void buyer_Adding_the_RedTShirt_to_cart() {
	    sort.addingHighPrice();
	}

	@Then("^Buyer able to CheckOutTheCart$")
	public void buyer_able_to_CheckOutTheCart() {
		cart.verifyCartIcon();
		cart.navigateUserTocart();
		cart.verifyCartScreen();
		cart.removItemFromCart();
		cart.verifyCheckoutButton();
		cart.clickOnCheckoutButton();
	    
	}
	@And("^Buyer Adding the DeliveryLocations (.*) and (.*) and (.*)$")
	public void buyer_Adding_the_DeliveryLocations_FirstName_and_LastName_and_Zipcode(String firstname,String lastname,String zipcode) {
		cart.verifyCartInformationPage();
		cart.addCustomerFirstName(firstname);
		cart.addCustomerLastName(lastname);
		cart.addCustomerZipcode(zipcode);
		cart.clickonContinueButton();
		cart.verifyOverview();
		cart.verifyPaymentInfo();
		cart.verifyShippingInfo();
	    
	}
	@And("^Buyer able to Finish the Cart$")
	public void buyer_able_to_Finish_the_Cart() {
		cart.verifyFinishButton();
		cart.clickOnFinishButton();
		cart.verifyCompleteCartscreen();
		cart.verifyConfirmationPopup();
		
	   
	}

}
