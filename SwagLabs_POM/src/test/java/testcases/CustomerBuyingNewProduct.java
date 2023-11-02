
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
import steps.SortingTheProducts;

@RunWith(SerenityParameterizedRunner.class)

@UseTestDataFrom(value = "src\\test\\resources\\testdata\\data.csv")
public class CustomerBuyingNewProduct extends PageObject {

	@Managed(driver = "chrome")
	WebDriver driver;

	private String username;
	private String password;

	@Steps
	EnterUserCredentails user;
	SortingTheProducts sort;

	@TestData(columnNames = "Username , Password")

	@Qualifier
	public String qualifier() {

		return " - " + " Username = " + username + " and " + " Password = " + password + " should display ";
	}

	@Before

	@Title("user logi into application")
	public void customerLogin() {
		open();
		user.enterUsername(username);
		user.enterPassword(password);
		user.clickOnLogin();
	}

	@Title("custer buying the product theough soring functionality")

	@Test
	public void userWorkingOnSort() {
		sort.verifyFilterOption();
		sort.selectLowToHigh();
		sort.compareLowWithHigh();
		sort.addingHighPrice();
	}
}
