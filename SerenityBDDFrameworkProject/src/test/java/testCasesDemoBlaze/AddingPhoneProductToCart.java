package testCasesDemoBlaze;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import locatorsDemoBlaze.DemoBlazeLocators;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class AddingPhoneProductToCart extends PageObject {
	
@Managed
WebDriver driver;




ReusableMethodsOrangeHRM reusablemethods;
LoginDemoblaze logindb;
locatorsDemoBlaze.DemoBlazeLocators demoblazelocators;

@Title("Demoblaze Login operations")
@Before
public void loginDB() 
{
		logindb.DBLogin();
		System.out.println("User Login to Demoblaze successfully");
}

@Title("In Demoblaze application adding PHONE product to CART")
@Test
public void phoneProdToCart() 
{

		reusablemethods.waitTimeforPageLoad(3000);
		reusablemethods.mouseClick(DemoBlazeLocators.CLICK_ON_HOME);
		reusablemethods.mouseClick(DemoBlazeLocators.CLICK_ON_PHONES);
		reusablemethods.mouseClick(DemoBlazeLocators.CLICK_ON_SELECTED_PHONE);
		reusablemethods.waitTimeforPageLoad(2000);
		reusablemethods.mouseClick(DemoBlazeLocators.CLICK_ON_ADDCART);
		reusablemethods.waitTimeforPageLoad(2000);

		// WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		// wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		reusablemethods.waitTimeforPageLoad(2000);
		System.out.println("Alert OK is clicked successfully");
}

@Title("In Demoblaze application operations which are performed after adding PHONE to cart")
@Test

public void afterAddingPRODToCartOperations() 
{
		reusablemethods.mouseClick(DemoBlazeLocators.CLICK_ON_CART);
		reusablemethods.mouseClick(DemoBlazeLocators.CLICK_PLACE_ORDER);
		reusablemethods.enterValueintoField(DemoBlazeLocators.NAME_INPUT, "hari");
		reusablemethods.enterValueintoField(DemoBlazeLocators.COUNTRY_INPUT, "hari123");
		reusablemethods.enterValueintoField(DemoBlazeLocators.CITY_INPUT, "xyz");
		reusablemethods.enterValueintoField(DemoBlazeLocators.CREDITCARD_INPUT, "1458976823");
		reusablemethods.enterValueintoField(DemoBlazeLocators.MONTH_INPUT, "12");
		reusablemethods.enterValueintoField(DemoBlazeLocators.YEAR_INPUT, "12");
		reusablemethods.mouseClick(DemoBlazeLocators.CLICK_ON_PURCHASE);
		reusablemethods.mouseClick(DemoBlazeLocators.CONFIRM_ORDER_PLACE);
		reusablemethods.mouseClick(DemoBlazeLocators.CLOSE_PLACEORDER_FORM);
		System.out.println("Order Placed successfully");
}

@Title("In Demoblaze application LOGOUT operations")
@After
public void logoutDB()
{
		reusablemethods.waitTimeforElementVisible(2000);
		reusablemethods.mouseClick(DemoBlazeLocators.CLICK_LOGOUT);
		System.out.println("User Logged out successfully");
}

}

