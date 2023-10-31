package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.EnterUserCredentails;
import steps.ItemAddToCart;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src\\test\\resources\\testdata\\data.csv")
public class CustomerAddingBagToCart extends PageObject{
	
	private String username;
	private String password;
	
	@Managed(driver="chrome")
	WebDriver driver;
	
	@Steps
	EnterUserCredentails user;
	ItemAddToCart item;
	
	@TestData(columnNames = "Username,Password")
	@Qualifier
	public String qualifier() {
		return " - " + " Username = " + username + " and " + " Password = " + password +  " should display ";		
	}
	
	@Before
	@Title("User log into application with valid credentails")
	public void userLogin() {
		open();
		user.enterUsername(username);
		user.enterPassword(password);
		user.clickOnLogin();
	}
	@Title("User buying the back pack bag from application")
	@Test
	public void customerBuyingTheBag() {
		item.verifyProductPage();
		item.verifyBackBagDetails();
		item.addBackToCart();
		item.userNavigateToHomeScreen();
	}
	

}
