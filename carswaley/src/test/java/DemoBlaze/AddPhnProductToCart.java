package DemoBlaze;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class AddPhnProductToCart extends PageObject{
	@Managed
	WebDriver driver;
	Utilities utilitiespage;
	DBAppLogin logindb;
	DBAppLocators demoblazelocators;
	
	@Title("Demoblaze Login operations")
	@Before
	@Test
	public void loginDB()
	{
		logindb.DBLogin();
		System.out.println("User Login to Demoblaze successfully");
	}
	
	@Title("In Demoblaze application adding PHONE product to CART")
	@Test
	public void phoneProdToCart()
	{
		
		utilitiespage.waitTimeforPageLoad(3000);
		utilitiespage.mouseClick(DBAppLocators.CLICK_ON_HOME);
		utilitiespage.mouseClick(DBAppLocators.CLICK_ON_PHONES);
		utilitiespage.mouseClick(DBAppLocators.CLICK_ON_SELECTED_PHONE);
		utilitiespage.waitTimeforPageLoad(2000);
		utilitiespage.mouseClick(DBAppLocators.CLICK_ON_ADDCART);
		utilitiespage.waitTimeforPageLoad(2000);
		
		//WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		//wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();;
		utilitiespage.waitTimeforPageLoad(2000);
		System.out.println("Alert OK is clicked successfully");
	}
	
	
	@Title("In Demoblaze application operations which are performed after adding PHONE to cart")
	@Test
	
	public void afterAddingPRODToCartOperations()
	{
		utilitiespage.mouseClick(DBAppLocators. CLICK_ON_CART);
		utilitiespage.mouseClick(DBAppLocators.CLICK_PLACE_ORDER);
		utilitiespage.enterValueintoField(DBAppLocators.NAME_INPUT,"hari");
		utilitiespage.enterValueintoField(DBAppLocators.COUNTRY_INPUT,"hari123");
		utilitiespage.enterValueintoField(DBAppLocators.CITY_INPUT,"xyz");
		utilitiespage.enterValueintoField(DBAppLocators.CREDITCARD_INPUT,"1458976823");
		utilitiespage.enterValueintoField(DBAppLocators.MONTH_INPUT ,"12");
		utilitiespage.enterValueintoField(DBAppLocators.YEAR_INPUT ,"12");
		utilitiespage.mouseClick(DBAppLocators.CLICK_ON_PURCHASE);
		utilitiespage.mouseClick(DBAppLocators.CONFIRM_ORDER_PLACE);
		utilitiespage.mouseClick(DBAppLocators.CLOSE_PLACEORDER_FORM);
		System.out.println("Order Placed successfully");
	}
	
	@Title("In Demoblaze application LOGOUT operations")
	@After
	public void logoutDB()
	{
		utilitiespage.waitTimeforElementVisible(2000);
		utilitiespage.mouseClick(DBAppLocators.CLICK_LOGOUT);
		System.out.println("User Logged out successfully");
	}
	
	
	
}



//reusablemethods.clickOperations(DemoBlazeLocators.PHONE_NAME_IN_CART);
//reusablemethods.clickOperations(DemoBlazeLocators.CLICK_ON_DELETE);
//WebElementFacade confirmProduct = $(By.xpath("//div[@class='item active']"));
//confirmProduct.click();
//Alert alert = getDriver().switchTo().alert();
//alert.accept();
//getDriver().switchTo().alert().accept();
//perform(Click.on("#your-button-id"));


//Actor actor = Actor.named("OK");
//actor.can(BrowseTheWeb.with(driver));
//YourPageObject yourPageObject = new YourPageObject();
//yourPageObject.open();
//alert.clickButtonThatOpensConfirmationAlert("OK");
//alert.acceptConfirmationAlert();


//WebDriverWait wait = new WebDriverWait(getDriver(), 50); // Adjust the timeout as needed
//wait.until(ExpectedConditions.alertIsPresent());
//Alert alert = getAlert();
//System.out.println(alert.getText());
//alert.accept();


//Alert alert = getAlert();
//System.out.println(alert.getText());
//alert.accept();
//alert.clickButtonThatOpensConfirmationAlert("OK");
//alert.acceptConfirmationAlert();