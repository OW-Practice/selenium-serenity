package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.CartcheckoutSteps;
import steps.EnterUserCredentails;
import steps.ItemAddToCart;
import steps.SortingTheProducts;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src\\test\\resources\\testdata\\data.csv")
public class CustomerAddingBagToCart extends PageObject{
	
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String zipcode;
	
	@Managed(driver="chrome")
	WebDriver driver;
	
	@Steps
	EnterUserCredentails user;
	ItemAddToCart item;
	SortingTheProducts sort;
	CartcheckoutSteps check;
	
	@TestData(columnNames = "Username,Password ,FirstName , LastName , ZipCde ")
	@Qualifier
	public String qualifier() {
		return " - " + " Username = " + username + " and " + " Password = " + password +  " and " + " FirstName = " + firstname + "and " + " LastName = " + lastname + "and " + " ZipCode = " + zipcode + " should display ";		
	}
	@WithTag("Buyer Login Into Application")
	@Before
	@Title("User log into application with valid credentails")
	public void userLogin() {
		open();
		user.enterUsername(username);
		user.enterPassword(password);
		user.clickOnLogin();
	}
	@WithTag("Buyer able to buy the products")
	@Title("User buying the back pack bag from application")
	@Test
	public void customerBuyingTheBag() throws InterruptedException {
		item.verifyProductPage();
		item.verifyBackBagDetails();
		item.addBackToCart();
		Thread.sleep(3000);
		item.userNavigateToHomeScreen();
		Thread.sleep(3000);
		item.addLight();
		Thread.sleep(3000);
		sort.verifyFilterOption();
		Thread.sleep(3000);
		sort.selectLowToHigh();
		Thread.sleep(3000);
		sort.compareLowWithHigh();
		Thread.sleep(3000);
		sort.addingHighPrice();
	}
	@WithTag("Buyer able to completing the order from cart")
	@After
	@Title("User checkout the cart ")
	public void customerCheckoutTheCart() throws InterruptedException {
		check.verifyCartIcon();
		Thread.sleep(3000);
		check.navigateUserTocart();
		Thread.sleep(3000);
		check.verifyCartScreen();
		Thread.sleep(3000);
		check.removItemFromCart();
		Thread.sleep(3000);
		check.verifyCheckoutButton();
		Thread.sleep(3000);
		check.clickOnCheckoutButton();
		Thread.sleep(3000);
		check.verifyCartInformationPage();
		Thread.sleep(3000);
		check.addCustomerFirstName(firstname);
		Thread.sleep(3000);
		check.addCustomerLastName(lastname);
		Thread.sleep(3000);
		check.addCustomerZipcode(zipcode);
		Thread.sleep(3000);
		check.clickonContinueButton();
		implicitTimoutMilliseconds();
		check.verifyOverview();
		implicitTimoutMilliseconds();
		check.verifyPaymentInfo();
		implicitTimoutMilliseconds();
		check.verifyShippingInfo();
		implicitTimoutMilliseconds();
		check.verifyFinishButton();
		implicitTimoutMilliseconds();
		check.clickOnFinishButton();
		implicitTimoutMilliseconds();
		check.verifyCompleteCartscreen();
		implicitTimoutMilliseconds();
		check.verifyConfirmationPopup();
		implicitTimoutMilliseconds();
		check.clickOnBackToHomeButton();
	}
	

}
