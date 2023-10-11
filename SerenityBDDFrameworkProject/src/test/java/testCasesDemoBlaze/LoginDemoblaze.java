package testCasesDemoBlaze;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import locatorsDemoBlaze.DemoBlazeLocators;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class LoginDemoblaze extends PageObject
{
	
	@Managed
	WebDriver driver;
	ReusableMethodsOrangeHRM reusablemethods;
	DemoBlazeLocators demoblazelocators;
	String email;
	String password;
	Faker faker = new Faker();
	@Title("login into Demoblaze application with valid credentials ")
	@Test
	public void DBLogin()
	{
	
		getDriver().get("https://www.demoblaze.com/");
//		open();	 
		String firstname = faker.name().firstName();
		System.out.println("User Firstname is : "+firstname);
		String lastname = faker.name().lastName();
		System.out.println("User Lastname is : "+lastname);
		String email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@domain.com";
		System.out.println("User Emailid is : "+email);
		String password= faker.name().firstName();
		System.out.println("User password is : "+password);
	
		reusablemethods.mouseClick(DemoBlazeLocators.CLICK_ON_SIGNUP_BUTTON);
		reusablemethods.enterValueintoField(DemoBlazeLocators.SIGNIN_USERNAME ,email);
		reusablemethods.enterValueintoField(DemoBlazeLocators.SIGNIN_PASSWORD ,password);
		reusablemethods.mouseClick(DemoBlazeLocators.CONFIRM_SIGNUP_BUTTON);
//		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
//		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
//		Alert alert = getAlert();
//		System.out.println(alert.getText());
//		alert.accept();
		reusablemethods.waitTimeforPageLoad(3000);
	
//		reusablemethods.waitTimeforPageLoad(3000);
		reusablemethods.mouseClick(DemoBlazeLocators.CLICKING_ON_USERTO_LOGIN);
		reusablemethods.enterValueintoField(DemoBlazeLocators.USER_NAME_INPUT ,email);
		reusablemethods.enterValueintoField(DemoBlazeLocators.PASSWORD_INPUT ,password);
		reusablemethods.mouseClick(DemoBlazeLocators.CLICK_ON_LOGIN);
		reusablemethods.waitTimeforPageLoad(2000);
		reusablemethods.assertionforpagetitle("STORE");
		reusablemethods.mouseClick(DemoBlazeLocators.CLICK_ON_HOME);
		System.out.println("Assertion passed and Demoblaze home page after login is opened");

	}

}
