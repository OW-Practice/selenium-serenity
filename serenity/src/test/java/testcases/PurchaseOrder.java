package testcases;



import org.junit.Test;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import RandomString.java.RandomCredentials;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import pages.PlaceOrder;
import pages.UserLoginPage;
import steps.LaunchBlaze;

@RunWith(SerenityRunner.class)
//@UseTestDataFrom("src\\main\\resources\\csv.java")
//@RunWith(SerenityParameterizedRunner.class)
//@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value = "D:\\eclipse\\carswaley\\src\\main\\resources\\csv.java")
public class PurchaseOrder extends PageObject {
	private String userName;
	private String passWord;

	@Managed(driver = "chrome")
	WebDriver driver;

	@Steps
	UserLoginPage login;
	PlaceOrder order;
	RandomCredentials ramdom;

	@Title("Custer Login to Application")
	@Test
	public void userLoginToApp() {
		

		open();
		login.navigateToHome(userName,passWord);
		login.verifyHomeScreen();
		order.purchaseOrder();

	}

}
